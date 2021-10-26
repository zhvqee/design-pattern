package pattern.structural.adpater;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.adpater
 * @ClassName: Mp4Player
 * @Description:
 * @Date: 2021/10/26 7:58 下午
 * @Version: 1.0
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);

    }
}
