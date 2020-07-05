package builder;

public class HighHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("高级房子打地基5米");

	}

	@Override
	public void buildWall() {
		System.out.println("高级房子垒墙4米");

	}

	@Override
	public void buildRoof() {
		System.out.println("高级房子盖屋顶，有吊顶");

	}

}
