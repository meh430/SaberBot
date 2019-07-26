package events;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;
import java.util.ArrayList;

public class Filters extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent discordEvent) {
        EmbedBuilder emb = new EmbedBuilder();
        ArrayList<String> noBadWords = new ArrayList<String>();
        noBadWords.add("fuck");
        noBadWords.add("fucker");
        noBadWords.add("motherfucker");
        noBadWords.add("bitch");
        noBadWords.add("asshole");
        noBadWords.add("dick");
        noBadWords.add("nigger");
        noBadWords.add("nigga");
        noBadWords.add("cunt");
        noBadWords.add("shit");

        if (discordEvent.getMember().getUser().isBot()) {
            return;
        }
        String[] strMessage = discordEvent.getMessage().getContentRaw().split(" ");

        for (String s : strMessage) {
            if (noBadWords.contains(s) && !discordEvent.getChannel().toString().contains("gilgamesh")) {
                emb.setTitle("No Bad Words!");
                emb.addField("User: " + discordEvent.getMember().getUser().getName(), "Stop saying bad words, you can go here to the Gilgamesh channel for that!", true);
                emb.setColor(Color.RED);
                emb.setImage("https://img.fireden.net/v/thumb/1532/63/1532634981382s.jpg");
                discordEvent.getChannel().sendMessage(emb.build()).queue();
                discordEvent.getMessage().delete().queue();
                System.out.println(discordEvent.getChannel().toString());
            }
        }


    }
}
