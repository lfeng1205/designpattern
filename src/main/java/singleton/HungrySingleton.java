package singleton;

public class HungrySingleton {

	// 创建好一个静态的对象供系统使用，以后不会再改变
	private static final HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return instance;
	}
}
