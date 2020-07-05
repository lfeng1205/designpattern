package adapter;

/**
 * @author qian
 */
public class Phone {

	public void charging(Voltage5V voltage5v) {
		if (voltage5v.output5V() == 5) {
			System.out.println("电压为5V，可以充电~");
		} else if (voltage5v.output5V() > 5) {
			System.out.println("电压大于5V，不可以充电~");
		}
	}
}
