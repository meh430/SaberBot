package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Guess extends ListenerAdapter {
    private int intRandomNumber = (int) (Math.random() * 100) + 1;

    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent discordEvent) {

        if (!discordEvent.getMember().getUser().isBot()) {
            String userMessageSent = discordEvent.getMessage().getContentRaw();
            if (userMessageSent.equalsIgnoreCase("!guess")) {
                discordEvent.getChannel().sendMessage("Alright, lets play a guessing game " + discordEvent.getMember().getUser().getName()).queue();
                discordEvent.getChannel().sendMessage("Guess a number between 1-100").queue();
            }
        }


        if (!discordEvent.getMember().getUser().isBot()) {
            String strGuess = discordEvent.getMessage().getContentRaw();
            if (Integer.parseInt(strGuess) > intRandomNumber) {
                discordEvent.getChannel().sendMessage("Try lower").queue();
            } else if (Integer.parseInt(strGuess) < intRandomNumber) {
                discordEvent.getChannel().sendMessage("Try higher").queue();
            } else if (Integer.parseInt(strGuess) == intRandomNumber) {
                discordEvent.getChannel().sendMessage("You got it!").queue();
                discordEvent.getJDA().removeEventListener(this);

            }
        }
    }
    //discordEvent.getJDA().removeEventListener(this);

}

