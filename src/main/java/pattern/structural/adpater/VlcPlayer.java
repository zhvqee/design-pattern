package pattern.structural.adpater;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.adpater
 * @ClassName: VlcPlayer
 * @Description:
 * @Date: 2021/10/26 7:57 下午
 * @Version: 1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
