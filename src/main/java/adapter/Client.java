package adapter;

import adapter.classadp.VoltageAdapterByClass;
import adapter.interfaceadp.VoltageAdapterByInterface;

/**
 * 
 * @Description:适配器模式
 * @author: clfeng
 * @date: 2020年5月3日 下午4:30:17
 */
public class Client extends Phone {

	public static void main(String[] args) {
		System.out.println("======类适配器模式======");
		Phone phone1 = new Phone();
		phone1.charging(new VoltageAdapterByClass());

		System.out.println("======对象适配器模式======");
		Phone phone2 = new Phone();
		phone2.charging(new VoltageAdapterByInterface(new Voltage220V()));
	}
}
