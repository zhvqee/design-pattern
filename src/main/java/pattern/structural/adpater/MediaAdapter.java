package pattern.structural.adpater;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.adpater
 * @ClassName: MediaAdapter
 * @Description:
 * @Date: 2021/10/26 7:58 下午
 * @Version: 1.0
 */
public class MediaAdapter implements MediaPlay {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }
        if (audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.playMp4(fileName);
    }
}
