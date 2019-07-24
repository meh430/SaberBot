package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class EventTest extends ListenerAdapter {

    //listens for message being received in a server, not a channel
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent discordEvent) {
        //String [] userMessageSentArr = discordEvent.getMessage().getContentRaw().trim().split(" ");
        String userMessageSent = discordEvent.getMessage().getContentRaw();

        if (discordEvent.getMember().getUser().isBot()) {
            return;
        }

        if (userMessageSent.equalsIgnoreCase("Hello World")) {
            discordEvent.getChannel().sendMessage("Wow, you did it!!").queue();
        }

        if (userMessageSent.equalsIgnoreCase("best show?")) {
            discordEvent.getChannel().sendMessage("Gravity Falls! Duh...").queue();
        }
    }//close message received
}//close class
