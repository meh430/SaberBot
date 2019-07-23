package saberBot;
/*
TODO: add random video from homepage option
TODO: add error correction for inputs, for example, if the second word is nothing
TODO: Music maybe?
*/

import events.*;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;
import java.awt.*;

//https://www.youtube.com/watch?v=jsRchR-jrf4
public class SaberSpawn extends ListenerAdapter {
    private static JDA saber;

    public static void main(String[] args) throws LoginException {

        saber = new JDABuilder("NjAyODQ2NDg5NjAxMTE0MTIy.XTWzGA.chU0j_FQDA2M12wu1pm1MRYnmoE").build();

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

        if (!e.getMember().getUser().isBot()) {
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
        }

    }//close event

    public static void botCreator() throws Exception {
        saber = new JDABuilder("NjAyODQ2NDg5NjAxMTE0MTIy.XTWzGA.chU0j_FQDA2M12wu1pm1MRYnmoE").build();
    }

}

