package builder;

/**
 * 
 * @Description:建造者模式
 * @author: clfeng
 * @date: 2020年5月3日 下午4:29:26
 */
public class Client {

	public static void main(String[] args) {
		// 盖普通房子
		CommonHouse commonHouse = new CommonHouse();
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		houseDirector.constructHouse();
	}
}
