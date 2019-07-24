package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class OperationEvent extends ListenerAdapter {
    //listens for message being received in a server, not a channel
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent discordEvent) {
        String[] userMessageSentArr = discordEvent.getMessage().getContentRaw().trim().split(" ");
        //String userMessageSent = discordEvent.getMessage().getContentRaw();

        if (!discordEvent.getMember().getUser().isBot()) {
            //add
            if (userMessageSentArr[0].equalsIgnoreCase("!add")) {
                StringBuilder strExpression = new StringBuilder();

                for (int i = 1; i < userMessageSentArr.length; i++) {
                    strExpression.append(userMessageSentArr[i]);
                }

                if (strExpression.toString().contains("+")) {
                    String[] strValues = strExpression.toString().trim().split("\\+");

                    double dblSum = 0;
                    for (String strValue : strValues) {
                        dblSum += Double.parseDouble(strValue);
                    }

                    discordEvent.getChannel().sendMessage("The sum is " + dblSum + "! I'm good at math!").queue();
                } else {
                    discordEvent.getChannel().sendMessage("There's no addition here baka").queue();
                }
            }//close if

            //subtract
            if (userMessageSentArr[0].equalsIgnoreCase("!sub")) {
                StringBuilder strExpression = new StringBuilder();

                for (int i = 1; i < userMessageSentArr.length; i++) {
                    strExpression.append(userMessageSentArr[i]);
                }

                if (strExpression.toString().contains("-")) {
                    String[] strValues = strExpression.toString().trim().split("-");

                    double dblDifference = 0;
                    for (int i = 0; i < strValues.length - 1; i++) {
                        dblDifference = Double.parseDouble(strValues[i]) - Double.parseDouble(strValues[i + 1]);
                    }

                    discordEvent.getChannel().sendMessage("The difference is " + dblDifference + "! I'm good at math!").queue();
                } else {
                    discordEvent.getChannel().sendMessage("There's no subtraction here baka").queue();
                }
            }//close if

            //multiply
            if (userMessageSentArr[0].equalsIgnoreCase("!mult")) {
                StringBuilder strExpression = new StringBuilder();

                for (int i = 1; i < userMessageSentArr.length; i++) {
                    strExpression.append(userMessageSentArr[i]);
                }

                if (strExpression.toString().contains("*")) {
                    String[] strValues = strExpression.toString().trim().split("\\*");

                    double dblProduct = 1;
                    for (String strValue : strValues) {
                        dblProduct *= Double.parseDouble(strValue);
                    }

                    discordEvent.getChannel().sendMessage("The product is " + dblProduct + "! I'm good at math!").queue();
                } else {
                    discordEvent.getChannel().sendMessage("There's no multiplication here baka").queue();
                }
            }//close if

            //divide
            if (userMessageSentArr[0].equalsIgnoreCase("!div")) {
                StringBuilder strExpression = new StringBuilder();

                for (int i = 1; i < userMessageSentArr.length; i++) {
                    strExpression.append(userMessageSentArr[i]);
                }

                if (strExpression.toString().contains("/")) {
                    String[] strValues = strExpression.toString().trim().split("/");

                    double dblQuotient = 0;
                    for (int i = 0; i < strValues.length - 1; i++) {
                        dblQuotient = Double.parseDouble(strValues[i]) / Double.parseDouble(strValues[i + 1]);
                    }

                    discordEvent.getChannel().sendMessage("The quotient is " + dblQuotient + "! I'm good at math!").queue();
                } else {
                    discordEvent.getChannel().sendMessage("There's no division here baka").queue();
                }
            }//close if
        }

    }//close message received
}
