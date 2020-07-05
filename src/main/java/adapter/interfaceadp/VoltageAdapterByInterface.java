package adapter.interfaceadp;

import adapter.Voltage220V;
import adapter.Voltage5V;

/**
 * 
 * @Description:对象适配器
 * @author: clfeng
 * @date: 2020年6月13日 上午8:38:12
 */
public class VoltageAdapterByInterface implements Voltage5V {

	private Voltage220V voltage220v;

	public VoltageAdapterByInterface(Voltage220V voltage220v) {
		this.voltage220v = voltage220v;
	}

	@Override
	public int output5V() {
		int src = voltage220v.output220V();
		int dst = src / 44;
		return dst;
	}

}
