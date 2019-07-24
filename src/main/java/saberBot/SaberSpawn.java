package saberBot;
/*
TODO: pause music
TODO: add new commands to help
*/

import Audio.GuildMusicManager;
import com.sedmelluq.discord.lavaplayer.player.AudioLoadResultHandler;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManagers;
import com.sedmelluq.discord.lavaplayer.tools.FriendlyException;
import com.sedmelluq.discord.lavaplayer.track.AudioPlaylist;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import events.*;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.managers.AudioManager;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.security.auth.login.LoginException;
import java.awt.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SaberSpawn extends ListenerAdapter {
    private static JDA saber;

    public static void main(String[] args) throws LoginException {

        saber = new JDABuilder("NjAyODQ2NDg5NjAxMTE0MTIy.XTeV7A.JYWuwqW0kglpwiGoapee7Q2mFg0").build();

        saber.addEventListener(new EventTest());
        saber.addEventListener(new OperationEvent());
        //saber.addEventListener(new RPS());
        //needs work
        //saber.addEventListener(new Guess());
        saber.addEventListener(new SaberSpawn());
        saber.addEventListener(new Filters());
        saber.addEventListener(new ImagePull());
        saber.addEventListener(new ImageTest());
        saber.addEventListener(new VideoTest());
    }

    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent e) {
        EmbedBuilder emb = new EmbedBuilder();

        if (e.getMember().getUser().isBot()) {
            return;
        }


        if (e.getMessage().getContentRaw().equalsIgnoreCase("!help")) {
            emb.setColor(69);
            emb.setThumbnail("https://i.redd.it/5z4vu11pgje11.jpg");
            emb.setTitle("Help Me!!");

            emb.addField("!rolldie", "Rolls a die", true);
            emb.addField("!meme", "Get a random meme", false);
            emb.addField("!saber", "Get a random Saber pic", false);
            emb.addField("!video [search]", "Type a search without the brackets to get a youtube video", false);
            emb.addField("!mi [search]", "Type a search without the brackets to get a mobile wallpaper", false);
            emb.addField("!di [search]", "Type a search without the brackets to get a desktop wallpaper", false);
            emb.addField("!r [search]", "Type a valid subreddit name to get a random picture from there", false);
            emb.addField("!add, !sub, !mult, !div", "Performs operation to succeeding values", false);

            e.getChannel().sendMessage(emb.build()).queue();
        }


        if (e.getMessage().getContentRaw().equalsIgnoreCase("who are you?")) {
            emb.setTitle("Seiba!", "https://typemoon.fandom.com/wiki/Saber_(Fate/stay_night)");
            emb.setColor(Color.BLUE);
            emb.setImage("https://i.redd.it/1gegym41s1a31.jpg");
            e.getChannel().sendMessage(emb.build()).queue();

        }


        if (e.getMessage().getContentRaw().equalsIgnoreCase("I love you")) {
            emb.setTitle("I love you too!");
            emb.setColor(Color.blue);
            emb.setImage("https://media1.tenor.com/images/385ac5a7a5ce3bf946b223555318d755/tenor.gif?itemid=5869825");
            e.getChannel().sendMessage(emb.build()).queue();
        }


        if (e.getMessage().getContentRaw().equalsIgnoreCase("!rolldie")) {
            e.getChannel().sendMessage("You rolled a " + (int) (Math.random() * 6) + 1).queue();
        }


        if (e.getMessage().getContentRaw().equalsIgnoreCase("gimme seiba")
                || e.getMessage().getContentRaw().equalsIgnoreCase("OwO")) {

            e.getChannel().sendMessage("UwU").queue();
            e.getChannel().sendMessage("https://www.youtube.com/watch?v=jsRchR-jrf4").queue();
        }


    }


    public static void botCreator() throws Exception {
        saber = new JDABuilder("NjAyODQ2NDg5NjAxMTE0MTIy.XTeV7A.JYWuwqW0kglpwiGoapee7Q2mFg0").build();
    }


    private final AudioPlayerManager playerManager;
    private final Map<Long, GuildMusicManager> musicManagers;


    private SaberSpawn() {
        this.musicManagers = new HashMap();

        this.playerManager = new DefaultAudioPlayerManager();
        AudioSourceManagers.registerRemoteSources(playerManager);
        AudioSourceManagers.registerLocalSource(playerManager);
    }


    private synchronized GuildMusicManager getGuildAudioPlayer(Guild guild) {
        long guildId = Long.parseLong(guild.getId());
        GuildMusicManager musicManager = musicManagers.get(guildId);

        if (musicManager == null) {
            musicManager = new GuildMusicManager(playerManager);//audio player manager instance
            musicManagers.put(guildId, musicManager);
        }

        guild.getAudioManager().setSendingHandler(musicManager.getSendHandler());

        return musicManager;
    }


    public void onMessageReceived(MessageReceivedEvent event) {
        String[] messageReceived = event.getMessage().getContentRaw().split(" ", 2);
        Guild guild = event.getGuild();

        if (guild != null) {
            //direct links
            if (messageReceived[0].equalsIgnoreCase("!playl") && messageReceived.length == 2) {
                loadAndPlay(event.getTextChannel(), messageReceived[1]);
            }
            //youtube searches
            else if (messageReceived[0].equalsIgnoreCase("!play") && messageReceived.length == 2) {

                int randomNum = 0;
                WebDriver driver = new ChromeDriver();

                String search = "https://www.youtube.com/results?search_query=" + messageReceived[1];
                driver.get(search);
                List<WebElement> listVideos = driver.findElements(By.tagName("a"));

                boolean flag = true;
                while (flag) {
                    randomNum = (int) (Math.random() * ((listVideos.size() - 1) + 1)) + 1;
                    try {
                        if (!(listVideos.get(randomNum).getAttribute("href").equals("")) && !(listVideos.get(randomNum).getAttribute("href") == null)
                                && listVideos.get(randomNum).getAttribute("href").contains("watch")) {
                            String url = listVideos.get(randomNum).getAttribute("href");

                            loadAndPlay(event.getTextChannel(), url);
                            driver.close();
                            driver.quit();

                            flag = false;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        //e.getChannel().sendMessage("Hmm, something went wrong...").queue();
                    }
                }//close while

                //driver.close();
                driver.quit();
                //driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);

                try {
                    //driver.close();
                    driver.quit();
                    SaberSpawn.botCreator();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    //e.getChannel().sendMessage("Hmm, something went wrong...").queue();
                }

            } else if ("!skip".equalsIgnoreCase(messageReceived[0])) {
                skipTrack(event.getTextChannel());
            }
        }

        super.onMessageReceived(event);
    }

    private void loadAndPlay(@NotNull final TextChannel channel, final String trackUrl) {
        final EmbedBuilder emb = new EmbedBuilder();
        emb.setColor(Color.CYAN);
        final GuildMusicManager musicManager = getGuildAudioPlayer(channel.getGuild());

        playerManager.loadItemOrdered(musicManager, trackUrl, new AudioLoadResultHandler() {

            public void trackLoaded(AudioTrack track) {
                emb.setTitle("Playing " + track.getInfo().title);
                channel.sendMessage(emb.build()).queue();

                play(channel.getGuild(), musicManager, track);
            }


            public void playlistLoaded(AudioPlaylist playlist) {
                AudioTrack firstTrack = playlist.getSelectedTrack();

                if (firstTrack == null) {
                    firstTrack = playlist.getTracks().get(0);
                }

                emb.setTitle("Playing " + firstTrack.getInfo().title + " (first track of playlist" + playlist.getName() + ")");
                channel.sendMessage(emb.build()).queue();

                play(channel.getGuild(), musicManager, firstTrack);
            }


            public void noMatches() {
                channel.sendMessage("Nothing found by " + trackUrl).queue();
            }


            public void loadFailed(FriendlyException exception) {
                channel.sendMessage("Could not play: " + exception.getMessage()).queue();
            }
        });
    }

    private void play(@NotNull Guild guild, @NotNull GuildMusicManager musicManager, AudioTrack track) {
        connectToFirstVoiceChannel(guild.getAudioManager());

        musicManager.scheduler.queue(track);
    }

    private void skipTrack(@NotNull TextChannel channel) {
        GuildMusicManager musicManager = getGuildAudioPlayer(channel.getGuild());
        musicManager.scheduler.nextTrack();

        channel.sendMessage("Skipped").queue();
    }

    private static void connectToFirstVoiceChannel(@NotNull AudioManager audioManager) {
        if (!audioManager.isConnected() && !audioManager.isAttemptingToConnect()) {
            for (VoiceChannel voiceChannel : audioManager.getGuild().getVoiceChannels()) {
                audioManager.openAudioConnection(voiceChannel);
                break;
            }
        }
    }

}

