package command;

/**
 * 具体命令类
 * 执行倒带操作
 * @author qian
 */
public class RewindCommand implements Command{

    private AudioPlayer myAudio;

    public RewindCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }

    @Override
    public void execute() {
        myAudio.rewind();
    }
}
