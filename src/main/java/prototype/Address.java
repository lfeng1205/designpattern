package prototype;

import java.io.Serializable;

public class Address implements Cloneable, Serializable {

	/**
	 * @Fields serialVersionUID : TODO(这个变量表示什么)
	 */
	private static final long serialVersionUID = 4845135408220877555L;
	private String provices;
	private String city;

	public Address(String provices, String city) {
		this.provices = provices;
		this.city = city;
	}

	@Override
	protected Object clone() {
		Address address = null;
		try {
			address = (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return address;
	}


	@Override
	public String toString() {
		return "Address [provices=" + provices + ", city=" + city + "]";
	}

}
