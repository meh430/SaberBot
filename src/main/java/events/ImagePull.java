package events;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import java.awt.*;
import java.util.ArrayList;

public class ImagePull extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent discordEvent) {
        EmbedBuilder emb = new EmbedBuilder();
        //saber
        ArrayList<String> saberImageURL = new ArrayList<String>();
        saberImageURL.add("https://images.goodsmile.info/cgm/images/product/20160607/5721/39461/large/2787b85ca3253bdbc283538bd1d4cce4.jpg");
        saberImageURL.add("https://animemotivation.com/wp-content/uploads/2017/05/Saber-fate-stay-night-1.jpg.webp");
        saberImageURL.add("https://i.imgur.com/pq3WOuG.jpg");
        saberImageURL.add("https://i.pinimg.com/originals/e8/18/aa/e818aa324258991b8a4e60af43140cad.png");
        saberImageURL.add("https://www.dhresource.com/0x0s/f2-albu-g7-M00-0C-C5-rBVaSlpl1h6AbO4nAAFZM6tquVY777.jpg/150x200cm-anime-fate-stay-night-tohsaka-rin.jpg");
        saberImageURL.add("https://cdn.myanimelist.net/images/characters/6/275276.jpg");
        saberImageURL.add("https://media1.tenor.com/images/26f73e84180dd87d73c6acd2dea6c9a0/tenor.gif?itemid=13451570");
        saberImageURL.add("https://i.imgur.com/1VyyrYe.jpg");
        saberImageURL.add("https://i.pinimg.com/originals/32/30/41/32304101b4ae147a569ad4c68cd94bfa.jpg");
        saberImageURL.add("https://i.ytimg.com/vi/K5N_Sc-0qXk/maxresdefault.jpg");
        saberImageURL.add("https://www.wallpaperup.com/uploads/wallpapers/2014/01/14/227458/6fd0232545282aaa387590570c6c1957-700.jpg");
        saberImageURL.add("https://media0.giphy.com/media/RMw1DhEAwx5ZK/source.gif");
        saberImageURL.add("https://img1.ak.crunchyroll.com/i/spire4/c93b3fc55aa45ff2de6acd6ead4c719e1520650944_large.png");
        saberImageURL.add("https://thumbs.gfycat.com/WelltodoGreenCod-size_restricted.gif");
        saberImageURL.add("https://wallup.net/wp-content/uploads/2016/05/14/54145-Saber-Fate-Stay_Night-748x703.png");
        saberImageURL.add("https://3.bp.blogspot.com/-LiliajxAPCM/XGOPeLO7eGI/AAAAAAAAF-w/H1G9xtYky8A0ek7TW4U6kCzn9PbqmzRCACHMYCw/s1600/wallpaper-sword-the-saber-fate-stay-night-fate-stay-night.jpg");
        saberImageURL.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW8O4SJzTPcslZgBeZge3zg_Y_sCR2gp5xXdTcDJ8xaJs2VWQQKA");
        saberImageURL.add("https://www.redwallpapers.com/download/original/saber-fate-zero-girl-blond-eyes-seriously-free-stock-photos-images-hd-wallpaper.jpg");
        saberImageURL.add("https://preview.redd.it/xwbrtbjf9cl21.jpg?width=640&crop=smart&auto=webp&s=21f5de1cad62c19fd50fd6c415280e219f3a87a8");
        saberImageURL.add("https://external-preview.redd.it/2bpPfFAI3Q1vU2pfISOa5064cT8o0pdeS-0SDSwy9YY.jpg?width=640&crop=smart&auto=webp&s=c91327c0639149e3f814a3524f8fd182e07fc4ae");
        saberImageURL.add("https://preview.redd.it/nita57dr05k21.jpg?width=640&crop=smart&auto=webp&s=e1f537d4e249b3a75c896fa1148a7ff50f68bd1e");
        saberImageURL.add("https://external-preview.redd.it/H5zfFcXC0G3wsUqKCmqw5GoidQEmUJpyQCXO_vRM2Z8.png?width=640&crop=smart&auto=webp&s=8168ad44640b355d98ae55fdf0900f98fcb3bd64");
        saberImageURL.add("https://external-preview.redd.it/mX-_xhgl2bzssRZBfBWd8FGWDj1IklMPqS6clHSmswY.png?width=640&crop=smart&auto=webp&s=539e68057dc89d301431696422828b19c9adde55");
        saberImageURL.add("https://external-preview.redd.it/Qzc8ccbLdYfjZPtFPGDvmkRnlu4niZtluU5UlA48_Wg.jpg?width=640&crop=smart&auto=webp&s=57251ff631f31e3df8674c99e58333e9693a29b9");
        saberImageURL.add("https://preview.redd.it/409dweu45gu21.jpg?width=640&crop=smart&auto=webp&s=23aff313bfb157f5a67fb3cc93fbd04e4e9fd20b");
        saberImageURL.add("https://i.redd.it/hggne2cjqii21.jpg");
        saberImageURL.add("https://external-preview.redd.it/gdSqDKcq3VCPrrI7Ap89mcbWrGRISTjVnrvKIzf-JMg.jpg?width=640&crop=smart&auto=webp&s=0ac629c01f5a2e4be76b671dc72843511beca294");

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

        //rin
        ArrayList<String> RinImageURL = new ArrayList<String>();
        RinImageURL.add("https://preview.redd.it/xykfe6zgr3921.jpg?width=640&crop=smart&auto=webp&s=df77228ea7db77b0b96d3a0227dc3083548da050");
        RinImageURL.add("https://preview.redd.it/vr5x1d5789o21.jpg?width=640&crop=smart&auto=webp&s=780558bf932a83ad68de51c2e6084b8f4289d9c3");
        RinImageURL.add("https://preview.redd.it/9fxg7lvc5f921.jpg?width=640&crop=smart&auto=webp&s=a86462e0c84061965ded661be58c495df0d1bbfe");
        RinImageURL.add("https://preview.redd.it/yp97b68ayjt11.jpg?width=640&crop=smart&auto=webp&s=d0b8bccc5ca1215ed01cd778951f002b681c9261");
        RinImageURL.add("https://preview.redd.it/rgnky9plrxl21.png?width=640&crop=smart&auto=webp&s=94193b0f582c88e970452813e43032c34a7865dc");
        RinImageURL.add("https://preview.redd.it/mjkxesnytg621.jpg?width=640&crop=smart&auto=webp&s=ff0abe25352128f04e81df62f0b624fd3f0c5286");
        RinImageURL.add("https://preview.redd.it/wwaekjqeubh21.jpg?width=640&crop=smart&auto=webp&s=4aa1ab5781b32f5b9e97c9f888971638f641b7fa");
        RinImageURL.add("https://preview.redd.it/rygtkvua9r131.png?width=640&crop=smart&auto=webp&s=bf92f997111673910582a0350b7d0801d1063300");
        RinImageURL.add("https://preview.redd.it/5dz484zhk5z11.jpg?width=640&crop=smart&auto=webp&s=b196c3f07989f3d0036fc06a8e78ec3cfcc616da");
        RinImageURL.add("https://preview.redd.it/wudtn6lr5io21.jpg?width=960&crop=smart&auto=webp&s=36db69973f2b501d308dfdfbd93c6c041e94c00e");
        RinImageURL.add("https://external-preview.redd.it/O5NOJv1ie9v6kvG-5WhkxhdCOJBHAZxyUljdUM8GGCs.jpg?width=640&crop=smart&auto=webp&s=a84758b5aea04b83c3c66a6ef9eb2fa9cb80d0c7");
        RinImageURL.add("https://preview.redd.it/50b74e98ghj21.png?width=640&crop=smart&auto=webp&s=6faa2e9b215a610874b09dda664a9d7d458d8c59");
        RinImageURL.add("https://preview.redd.it/k8tbf1vuahn21.jpg?width=960&crop=smart&auto=webp&s=862d5e0744a1022af9d2fd1762574c2646df899e");
        RinImageURL.add("https://i.redd.it/9s5buxtdfsw21.jpg");
        RinImageURL.add("https://i.redd.it/u2yfgqhgcwa31.jpg");
        RinImageURL.add("https://preview.redd.it/svo5jeqgmra31.png?width=640&crop=smart&auto=webp&s=22fc05de529506c428490c6fa7c40e1f18f1fcbc");
        RinImageURL.add("https://preview.redd.it/nl5uv11oiy031.jpg?width=640&crop=smart&auto=webp&s=f5529ed2900e028fed01e0288ffd5596ad272ff1");
        RinImageURL.add("https://preview.redd.it/d8ksckfrj6p21.gif?format=mp4&s=8d5db196a28d5fe828aa6464642fc56382ed6fbc");
        RinImageURL.add("https://preview.redd.it/qlhe67fxizx21.jpg?width=640&crop=smart&auto=webp&s=755751348d97ca710248f9a851ed4eb0f84cb397");
        RinImageURL.add("https://external-preview.redd.it/uZZiHCi04pK6mXP3pGM6I534L7CrnVBRW6dwUbA9OT4.jpg?width=640&crop=smart&auto=webp&s=afcfe2dc1a1fa6990d6a171c592b156155b2df36");
        RinImageURL.add("https://preview.redd.it/6zcrlxj8q1v21.jpg?width=640&crop=smart&auto=webp&s=cabb9cdc4358b5dd9bd13b7f0c750e95849cb219");
        RinImageURL.add("https://external-preview.redd.it/d2qVS8mtYRzfMi7J9nQGcdsfbbdXq77QNFB6pkB9vwc.jpg?width=640&crop=smart&auto=webp&s=69dda7c6ee067712d8f96269daaeb84265f3c08b");
        RinImageURL.add("https://preview.redd.it/c917bi96so531.jpg?width=640&crop=smart&auto=webp&s=46bf339057227ca5ad4ef40a3f900433603bfd8c");
        RinImageURL.add("https://external-preview.redd.it/iXad0WN-eYSScavPDUPAbkVr2ZN4iju5qE0JOtuCLck.jpg?auto=webp&s=f2f0576621d4515bbdedad85ec4f7534c1e2af50");


        if (discordEvent.getMember().getUser().isBot()) {
            return;
        }
        if (discordEvent.getMessage().getContentRaw().equalsIgnoreCase("!meme")) {
            int max = memeURL.size() - 1;

            int index = (int) (Math.random() * (max + 1));

            emb.setTitle("Here's your meme:");
            emb.setColor(Color.GREEN);
            emb.setImage(memeURL.get(index));
            discordEvent.getChannel().sendMessage(emb.build()).queue();
        }

        if (discordEvent.getMessage().getContentRaw().equalsIgnoreCase("!saber")) {
            int max = saberImageURL.size() - 1;

            int index = (int) (Math.random() * (max + 1));

            emb.setTitle("Here's your seiba:");
            emb.setColor(Color.BLUE);
            emb.setImage(saberImageURL.get(index));
            discordEvent.getChannel().sendMessage(emb.build()).queue();
        }

        if (discordEvent.getMessage().getContentRaw().equalsIgnoreCase("!rin")) {
            int max = RinImageURL.size() - 1;

            int index = (int) (Math.random() * (max + 1));

            emb.setTitle("Here's your one true Tohsaka: ");
            emb.setColor(Color.RED);
            emb.setImage(RinImageURL.get(index));
            discordEvent.getChannel().sendMessage(emb.build()).queue();
        }
    }
}

