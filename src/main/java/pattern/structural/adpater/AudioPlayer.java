package pattern.structural.adpater;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.adpater
 * @ClassName: AudioPlayer
 * @Description:
 * @Date: 2021/10/26 8:00 下午
 * @Version: 1.0
 */
public class AudioPlayer implements MediaPlay {


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc") || audioType.equals("mp4")) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
            return;
        }
        System.out.println("play other ");
    }
}
