package builder;

/**
 * 
 * @Description:抽象的建造者
 * @author: clfeng
 * @date: 2020年5月3日 下午3:34:34
 */
public abstract class HouseBuilder {


	protected House house = new House();

	// 建造流程
	// 打地基
	public abstract void buildBasic();

	// 垒墙
	public abstract void buildWall();

	// 盖屋顶
	public abstract void buildRoof();

	public House buildHouse() {
		return house;
	}
}
