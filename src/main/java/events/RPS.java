package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class RPS extends ListenerAdapter {
    private static int intScore = 0;
    private static int intBotScore = 0;

    //listens for message being received in a server, not a channel
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent discordEvent) {
        //RPS obj = new RPS();
        if (!discordEvent.getMember().getUser().isBot()) {
            String[] userMessageSentArr = discordEvent.getMessage().getContentRaw().trim().split(" ");
            String userName = discordEvent.getMember().getUser().getName();

            if (userMessageSentArr[0].equalsIgnoreCase("!fate")) {
                discordEvent.getChannel().sendMessage("Whoa " + userName + ", so you're challenging me to Rock, Paper, Scissors?").queue();
                discordEvent.getChannel().sendMessage("Let me tell you, luck is my best stat. I'll go first and let you win").queue();
                discordEvent.getChannel().sendMessage("Type !R for 'rock', !P for 'paper', and !S for 'scissors'").queue();
            }//close if
        }

        String strTool = "";

        if (!discordEvent.getMember().getUser().isBot()) {
            strTool = discordEvent.getMessage().getContentRaw().trim();
            discordEvent.getChannel().sendMessage("you said: " + strTool).queue();

            if (strTool.equalsIgnoreCase("!quit")) {
                discordEvent.getChannel().sendMessage("Alright").queue();
                discordEvent.getJDA().removeEventListener(this);
            } else {
                //1 = R, 2 = P, 3 = S
                int intRandomNum = (int) (Math.random() * 3) + 1;

                String strOutcome;
                strOutcome = rockPaperScissor(strTool, intRandomNum);
                if (intRandomNum == 1) {

                    discordEvent.getChannel().sendMessage("I choose ROCK").queue();

                } else if (intRandomNum == 2) {

                    discordEvent.getChannel().sendMessage("I choose PAPER").queue();

                } else if (intRandomNum == 3) {

                    discordEvent.getChannel().sendMessage("I choose SCISSORS").queue();
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                discordEvent.getChannel().sendMessage(strOutcome).queue();


                if (intBotScore == 3) {
                    discordEvent.getChannel().sendMessage("I told you my luck was good, I won!").queue();
                    discordEvent.getJDA().removeEventListener(this);
                } else if (intScore == 3) {
                    discordEvent.getChannel().sendMessage("I yield, you have better luck than me.").queue();
                    discordEvent.getJDA().removeEventListener(this);
                }

            }
        }
    }//close message received

    private static String rockPaperScissor(@NotNull String strTools, int intRandomNums) {

        if (strTools.substring(0, 2).equalsIgnoreCase("!R")) {
            if (intRandomNums == 1) {
                //tie
                return "We got the same thing, let's go again!";
            } else if (intRandomNums == 2) {
                //lost
                intBotScore++;
                return "Hahaha, I won this round";
            } else if (intRandomNums == 3) {
                //won
                intScore++;
                return "No way, I was beat this round";
            }
        } else if (strTools.substring(0, 2).equalsIgnoreCase("!P")) {
            if (intRandomNums == 1) {
                //won
                intScore++;
                return "No way, I was beat this round";
            } else if (intRandomNums == 2) {
                //tie
                return "We got the same thing, let's go again!";
            } else if (intRandomNums == 3) {
                //lost
                intBotScore++;
                return "Hahaha, I won this round";
            }
        } else if (strTools.substring(0, 2).equalsIgnoreCase("!S")) {
            if (intRandomNums == 1) {
                //lost
                intBotScore++;
                return "Hahaha, I won this round";
            } else if (intRandomNums == 2) {
                //won
                intScore++;
                return "No way, I was beat this round";
            } else if (intRandomNums == 3) {
                //tie
                return "We got the same thing, let's go again!";
            }
        } else {
            //error
            return "";
        }
        return "";
    }//close rockPaperScissor
}
