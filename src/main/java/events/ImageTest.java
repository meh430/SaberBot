package events;

import java.awt.*;
import java.util.List;

import saberBot.SaberSpawn;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageTest extends ListenerAdapter {

    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent e) throws NullPointerException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehul Pillai\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        String[] arrMessage = e.getMessage().getContentRaw().split(" ");
        if (!e.getMember().getUser().isBot()) {
            WebDriver driver = new ChromeDriver();
            if (arrMessage[0].equalsIgnoreCase("!mimage")) {
                int randomNum = 0;
                String search = "https://www.zedge.net/find/" + arrMessage[1];
                driver.get(search);
                List<WebElement> listImages = driver.findElements(By.tagName("img"));

                boolean flag = true;

                while (flag) {
                    randomNum = (int) (Math.random() * 100) + 1;
                    try {
                        if (!(listImages.get(randomNum).getAttribute("src").equals("")) && !(listImages.get(randomNum).getAttribute("src") == null)) {

                            String url = listImages.get(randomNum).getAttribute("src");
                            //System.out.println(listImages.get(i).getAttribute("src"));
                            EmbedBuilder emb = new EmbedBuilder();
                            emb.setTitle("Image", url);
                            emb.setColor(Color.RED);
                            emb.setImage(url);
                            e.getChannel().sendMessage(emb.build()).queue();
                            //e.getChannel().sendMessage("Am i dead?").queue();
                            driver.close();
                            driver.quit();
                            //e.getChannel().sendMessage("Am I dead").queue();

                            flag = false;
                        }
                    } catch (Exception ex) {
                        //
                    }
                }
                //e.getChannel().sendMessage("1").queue();
                driver.close();
                driver.quit();
                //driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
                e.getChannel().sendMessage("2").queue();
                try {
                    e.getChannel().sendMessage("3").queue();
                    SaberSpawn.botCreator();
                } catch (java.lang.Exception ex) {
                    e.getChannel().sendMessage("4").queue();
                    System.out.println("wtf");
                }

            }

            if (arrMessage[0].equalsIgnoreCase("!dimage")) {
                int randomNum = 0;
                String search = "https://wall.alphacoders.com/search.php?search=" + arrMessage[1];
                driver.get(search);

                List<WebElement> listImages = driver.findElements(By.tagName("img"));

                boolean flag = true;

                while (flag) {
                    randomNum = (int) (Math.random() * 100) + 1;

                    try {
                        if (!(listImages.get(randomNum).getAttribute("src").equals("")) && !(listImages.get(randomNum).getAttribute("src") == null)
                                && listImages.get(randomNum).getAttribute("src").contains("images")) {

                            String url = listImages.get(randomNum).getAttribute("src");
                            //System.out.println(listImages.get(i).getAttribute("src"));
                            EmbedBuilder emb = new EmbedBuilder();
                            emb.setTitle("Image", url);
                            emb.setColor(Color.RED);
                            emb.setImage(url);
                            e.getChannel().sendMessage(emb.build()).queue();
                            //e.getChannel().sendMessage("Am i dead?").queue();
                            driver.close();
                            driver.quit();
                            //e.getChannel().sendMessage("Am I dead").queue();

                            flag = false;
                        }
                    } catch (Exception ex) {
                        //
                    }
                }
                //e.getChannel().sendMessage("1").queue();
                driver.close();
                driver.quit();
                //driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
                e.getChannel().sendMessage("2").queue();
                try {
                    e.getChannel().sendMessage("3").queue();
                    SaberSpawn.botCreator();
                } catch (java.lang.Exception ex) {
                    e.getChannel().sendMessage("4").queue();
                    System.out.println("wtf");
                }

            }
        }
        //e.getChannel().sendMessage("5").queue();
    }
}
