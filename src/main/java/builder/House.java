package builder;

/**
 * 
 * @Description:Product类
 * @author: clfeng
 * @date: 2020年5月3日 下午3:33:42
 */
public class House {

	private String basic;

	private String wall;

	private String roof;

	public String getBasic() {
		return basic;
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public String toString() {
		return "House [basic=" + basic + ", wall=" + wall + ", roof=" + roof + "]";
	}

}
