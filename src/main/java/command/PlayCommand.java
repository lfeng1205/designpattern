package command;

/**
 * 具体命令类
 * 执行播放操作
 * @author qian
 */
public class PlayCommand implements Command{

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();
    }
}
