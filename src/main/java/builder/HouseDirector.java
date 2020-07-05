package builder;

public class HouseDirector {

	HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		super();
		this.houseBuilder = houseBuilder;
	}

	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWall();
		houseBuilder.buildRoof();
		return houseBuilder.buildHouse();
	}

	public HouseBuilder getHouseBuilder() {
		return houseBuilder;
	}

	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

}
