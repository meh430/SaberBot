package events;

import java.util.List;

import saberBot.SaberSpawn;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoTest extends ListenerAdapter {
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent e) throws NullPointerException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehul Pillai\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        String[] arrMessage = e.getMessage().getContentRaw().split(" ");

        if (!e.getMember().getUser().isBot()) {

            if (arrMessage[0].equalsIgnoreCase("!video")) {
                WebDriver driver = new ChromeDriver();

                String search = "https://www.youtube.com/results?search_query=" + arrMessage[1];
                driver.get(search);
                List<WebElement> listVideos = driver.findElements(By.tagName("a"));

                boolean flag = true;
                while (flag) {
                    int randomNum = (int) (Math.random() * 100) + 1;
                    try {
                        if (!(listVideos.get(randomNum).getAttribute("href").equals("")) && !(listVideos.get(randomNum).getAttribute("href") == null)
                                && listVideos.get(randomNum).getAttribute("href").contains("watch")) {
                            String url = listVideos.get(randomNum).getAttribute("href");
                            e.getChannel().sendMessage(url).queue();

                            driver.close();
                            driver.quit();

                            flag = false;
                        }
                    } catch (Exception ex) {
                        //
                    }
                }

                driver.close();
                driver.quit();
                //driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);

                try {
                    e.getChannel().sendMessage("3").queue();
                    driver.close();
                    driver.quit();
                    SaberSpawn.botCreator();
                } catch (java.lang.Exception ex) {
                    e.getChannel().sendMessage("4").queue();
                }
            }
        }
    }
}
