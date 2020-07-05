package adapter.classadp;

import adapter.Voltage220V;
import adapter.Voltage5V;

/**
 * 
 * @Description:类适配器
 * @author: clfeng
 * @date: 2020年6月13日 上午8:37:57
 */
public class VoltageAdapterByClass extends Voltage220V implements Voltage5V {

	@Override
	public int output5V() {
		int src = output220V();
		int dst = src / 44;
		return dst;
	}

}
