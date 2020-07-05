package command;

/**
 * 客户端角色，由茱丽小女孩扮演
 * 命令模式
 * @author qian
 */
public class Julia {

    public static void main(String[] args) {
        //创建接收者
        AudioPlayer audioPlayer = new AudioPlayer();

        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCopmmand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCopmmand);
        keypad.setStopCommand(stopCommand);

        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();

    }
}
