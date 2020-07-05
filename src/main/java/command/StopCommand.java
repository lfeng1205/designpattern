package command;

/**
 * 具体命令类
 * 执行停止操作
 * @author qian
 */
public class StopCommand implements Command{

    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
