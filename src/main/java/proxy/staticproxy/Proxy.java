package proxy.staticproxy;

/**
 * 
 * @Description:中介
 * @author: clfeng
 * @date: 2020年5月16日 下午5:44:14
 */
public class Proxy {

	private Host host;

	public Proxy() {

	}

	public Proxy(Host host) {
		this.host = host;
		host.rent();
		seeHouse();
		hetong();
		fare();
	}

	public void rent() {
		host.rent();
	}

	public void seeHouse() {
		System.out.println("中介带客户看房子。");
	}

	public void hetong() {
		System.out.println("中介带客户签合同。");
	}

	public void fare() {
		System.out.println("中介收客户中介费。");
	}
}
