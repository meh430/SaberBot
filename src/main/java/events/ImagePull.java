package events;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;

public class ImagePull extends ListenerAdapter {
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent e) {
        EmbedBuilder emb = new EmbedBuilder();
        //saber
        ArrayList<String> saberImageURL = new ArrayList<String>();
        saberImageURL.add("https://images.goodsmile.info/cgm/images/product/20160607/5721/39461/large/2787b85ca3253bdbc283538bd1d4cce4.jpg");
        saberImageURL.add("https://animemotivation.com/wp-content/uploads/2017/05/Saber-fate-stay-night-1.jpg.webp");
        saberImageURL.add("https://i.imgur.com/pq3WOuG.jpg");
        saberImageURL.add("https://i.pinimg.com/originals/e8/18/aa/e818aa324258991b8a4e60af43140cad.png");
        saberImageURL.add("https://www.dhresource.com/0x0s/f2-albu-g7-M00-0C-C5-rBVaSlpl1h6AbO4nAAFZM6tquVY777.jpg/150x200cm-anime-fate-stay-night-tohsaka-rin.jpg");

        //memes
        ArrayList<String> memeURL = new ArrayList<String>();
        memeURL.add("https://i.redd.it/9t02914t6ue21.jpg");
        memeURL.add("https://i.imgur.com/dtL1wQe.jpg");
        memeURL.add("https://i.redd.it/2lbk9eec9s8z.png");
        memeURL.add("https://cdn.vox-cdn.com/thumbor/r4D5rYaxrM0ihjBrH-rIFKaHc1w=/0x0:1079x587/1200x800/filters:focal(454x208:626x380)/cdn.vox-cdn.com/uploads/chorus_image/image/63035671/Screen_Shot_2019_02_11_at_11.40.05_AM.0.png");
        memeURL.add("https://preview.redd.it/hjfbfn487zp11.jpg?auto=webp&s=ba13fec7e1d76ae943ac4583d10edc5350570ae1");
        memeURL.add("https://img.memecdn.com/i-literally-just-copy-paste-a-meme-from-reddit-memes-subreddit_o_7246155.jpg");
        memeURL.add("https://i.redd.it/v6v01u46q7zz.jpg");
        memeURL.add("https://cdn.vox-cdn.com/thumbor/tvitA_C9KGltAXnLzNSkm3N3dQc=/1400x0/filters:no_upscale()/cdn.vox-cdn.com/uploads/chorus_asset/file/13751929/Screen_Shot_2019_02_11_at_11.40.23_AM.png");
        memeURL.add("https://i.redd.it/l2r3k2itlmpz.jpg");
        memeURL.add("https://pics.me.me/thumb_when-you-dont-use-reddit-for-a-few-hours-and-37241111.png");
        memeURL.add("https://i.redd.it/ijifkbk4d5vz.png");
        memeURL.add("https://i.redd.it/ukuei8dwa8j01.jpg");
        memeURL.add("https://i.redd.it/vktlp4j3wf911.png");
        memeURL.add("https://pics.me.me/reddit-newbies-trying-to-post-in-r-dankmemes-but-dont-reach-37689170.png");
        memeURL.add("https://i.redd.it/actmaz2c78lz.jpg");
        memeURL.add("https://i.redd.it/a9um30o8wxgy.png");
        memeURL.add("https://i.redd.it/7yi0tq5jf8z21.jpg");
        memeURL.add("https://i.imgur.com/2BwuT51.jpg");
        memeURL.add("http://i.imgur.com/M1BptS5.jpg");
        memeURL.add("https://i.redd.it/4pdlgtut1b9y.png");
        memeURL.add("https://i.redd.it/70kr7uxhxb711.jpg");
        memeURL.add("https://i.redd.it/ncw7o1qg9txx.png");
        memeURL.add("https://i.imgur.com/1s8NebV.jpg");
        memeURL.add("https://i.imgur.com/fB7bqH1.jpg");
        memeURL.add("https://i.redd.it/73kw0dkankgy.jpg");
        memeURL.add("https://i.redd.it/27jxpximistx.jpg");
        memeURL.add("https://i.imgur.com/tc2HrHY.jpg");
        memeURL.add("http://i.imgur.com/gWr0fME.jpg");
        memeURL.add("https://i.redd.it/4gl3mwmsjk4z.jpg");
        memeURL.add("https://i.redd.it/1g8fvcqhciyx.jpg");
        memeURL.add("https://i.redd.it/jimsn2thg4m01.png");
        memeURL.add("https://i.redd.it/7jmh1sjqdcoz.jpg");
        memeURL.add("http://i.imgur.com/Vw1ewTy.png");
        memeURL.add("https://i.redd.it/zyh2i129cqjz.jpg");

        //ArrayList <String> nImageURL = new ArrayList<String>();

        if (!e.getMember().getUser().isBot()) {
            if (e.getMessage().getContentRaw().equalsIgnoreCase("!memes")) {
                int max = memeURL.size() - 1;

                int index = (int) (Math.random() * (max + 1));

                emb.setTitle("Here's your meme:");
                emb.setColor(Color.GREEN);
                emb.setImage(memeURL.get(index));
                e.getChannel().sendMessage(emb.build()).queue();
            }

            if (e.getMessage().getContentRaw().equalsIgnoreCase("!saber")) {
                int max = saberImageURL.size() - 1;

                int index = (int) (Math.random() * (max + 1));

                emb.setTitle("Here's your seiba:");
                emb.setColor(Color.BLUE);
                emb.setImage(saberImageURL.get(index));
                e.getChannel().sendMessage(emb.build()).queue();
            }
        }


    }
}

