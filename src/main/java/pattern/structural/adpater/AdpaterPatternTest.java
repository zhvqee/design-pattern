package pattern.structural.adpater;

/**
 * @ProjectName: design-pattern
 * @Package: pattern.structural.adpater
 * @ClassName: AdpaterPatternTest
 * @Description:
 * @Date: 2021/10/26 8:02 下午
 * @Version: 1.0
 */
public class AdpaterPatternTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4", "123");
    }
}
