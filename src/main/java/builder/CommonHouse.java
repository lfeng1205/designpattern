package builder;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("普通房子打地基3米");

	}

	@Override
	public void buildWall() {
		System.out.println("普通房子垒墙2米");

	}

	@Override
	public void buildRoof() {
		System.out.println("普通房子盖屋顶，没有吊顶");

	}

}
