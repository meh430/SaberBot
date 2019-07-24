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

        if (e.getMember().getUser().isBot()) {
            return;
        }
        if (arrMessage[0].equalsIgnoreCase("!mi") && !arrMessage[1].equalsIgnoreCase(" ")) {
            WebDriver driver = new ChromeDriver();
            int randomNum = 0;
            String search = "https://www.zedge.net/find/" + arrMessage[1];
            driver.get(search);

            List<WebElement> listImages = driver.findElements(By.tagName("img"));

            boolean flag = true;

            while (flag) {
                randomNum = (int) (Math.random() * ((listImages.size() - 1) + 1)) + 1;
                try {
                    if (!(listImages.get(randomNum).getAttribute("src").equals("")) && !(listImages.get(randomNum).getAttribute("src") == null)) {

                        String url = listImages.get(randomNum).getAttribute("src");
                        //System.out.println(listImages.get(i).getAttribute("src"));
                        EmbedBuilder emb = new EmbedBuilder();
                        emb.setTitle("Image", url);
                        emb.setColor(Color.RED);
                        emb.setImage(url);
                        e.getChannel().sendMessage(emb.build()).queue();

                        driver.close();
                        driver.quit();

                        flag = false;
                    }
                } catch (Exception ex) {
                    // e.getChannel().sendMessage("Hmm, something went wrong...").queue();
                    ex.printStackTrace();
                }
            }
            //driver.close();
            driver.quit();
            //driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);

            try {
                SaberSpawn.botCreator();
            } catch (java.lang.Exception ex) {
                //e.getChannel().sendMessage("Hmm, something went wrong...").queue();
                ex.printStackTrace();
            }

        }

        if (arrMessage[0].equalsIgnoreCase("!di") && !arrMessage[1].equalsIgnoreCase(" ")) {
            WebDriver driver = new ChromeDriver();
            int randomNum = 0;
            String search = "https://wall.alphacoders.com/search.php?search=" + arrMessage[1];
            driver.get(search);

            List<WebElement> listImages = driver.findElements(By.tagName("img"));

            boolean flag = true;

            while (flag) {
                randomNum = (int) (Math.random() * ((listImages.size() - 1) + 1)) + 1;

                try {
                    if (!(listImages.get(randomNum).getAttribute("src").equals("")) && !(listImages.get(randomNum).getAttribute("src") == null)
                            && listImages.get(randomNum).getAttribute("src").contains("images")) {

                        String url = listImages.get(randomNum).getAttribute("src");
                        EmbedBuilder emb = new EmbedBuilder();
                        emb.setTitle("Image", url);
                        emb.setColor(Color.RED);
                        emb.setImage(url);
                        e.getChannel().sendMessage(emb.build()).queue();

                        driver.close();
                        driver.quit();

                        flag = false;
                    }
                } catch (Exception ex) {
                    //e.getChannel().sendMessage("Hmm, something went wrong...").queue();
                    ex.printStackTrace();
                }
            }
            //driver.close();
            driver.quit();
            //driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);

            try {
                SaberSpawn.botCreator();
            } catch (java.lang.Exception ex) {
                //e.getChannel().sendMessage("Hmm, something went wrong...").queue();
                ex.printStackTrace();
            }

        }

        if (arrMessage[0].equalsIgnoreCase("!r") && !arrMessage[1].equalsIgnoreCase(" ")) {
            WebDriver driver = new ChromeDriver();
            int randomNum = 0;
            String search = "https://www.reddit.com/r/" + arrMessage[1] + "/new/";
            driver.get(search);

            List<WebElement> listImages = driver.findElements(By.tagName("img"));

            boolean flag = true;

            while (flag) {
                randomNum = (int) (Math.random() * ((listImages.size() - 1) + 1)) + 1;

                try {
                    if (!(listImages.get(randomNum).getAttribute("src").equals("")) && !(listImages.get(randomNum).getAttribute("src") == null)
                            && listImages.get(randomNum).getAttribute("alt").contains("image")) {

                        String url = listImages.get(randomNum).getAttribute("src");
                        EmbedBuilder emb = new EmbedBuilder();
                        emb.setTitle("Image", url);
                        emb.setColor(Color.RED);
                        emb.setImage(url);
                        e.getChannel().sendMessage(emb.build()).queue();

                        driver.close();
                        driver.quit();

                        flag = false;
                    }
                } catch (Exception ex) {
                    //e.getChannel().sendMessage("Hmm, looks like there's nothing there...").queue();
                    driver.close();
                    driver.quit();
                    flag = false;
                    ex.printStackTrace();
                }
            }
            //driver.close();
            driver.quit();
            //driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);

            try {
                SaberSpawn.botCreator();
            } catch (java.lang.Exception ex) {
                ex.printStackTrace();
                //e.getChannel().sendMessage("Hmm, something went wrong...").queue();
            }

        }

    }
}
