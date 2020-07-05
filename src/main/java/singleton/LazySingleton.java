package singleton;

public class LazySingleton {

	// 保证 instance 在所有线程中同步
	private static volatile LazySingleton instance = null;

	// 私有构造方法
	private LazySingleton() {

	}

	/**
	 * 
	 * @Title: getInstance   
	 * @Description: 单例方法
	 * @param: @return      
	 * @return: LazySingleton      
	 * @throws
	 */
	public static synchronized LazySingleton getInstance() {
		// getInstance 方法前加同步
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
