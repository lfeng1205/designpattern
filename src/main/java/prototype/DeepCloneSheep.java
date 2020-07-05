package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepCloneSheep implements Cloneable, Serializable {

	/**
	 * @Fields serialVersionUID : TODO(这个变量表示什么)
	 */
	private static final long serialVersionUID = 4277951929388054016L;

	private String name;

	private int age;

	private String color;

	public Address address;

	public DeepCloneSheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DeepCloneSheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
	}

	@Override
	protected Object clone() {
		DeepCloneSheep deepCloneSheep = null;
		try {
			deepCloneSheep = (DeepCloneSheep) super.clone();
			deepCloneSheep.address = (Address) address.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return deepCloneSheep;
	}

	protected Object deepClone() {

		ByteArrayOutputStream bos=null;
		ObjectOutputStream oos=null;
		ByteArrayInputStream bis=null;
		ObjectInputStream ois=null;
		try {
			// 序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			// 反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			
			DeepCloneSheep deepCloneSheep = (DeepCloneSheep) ois.readObject();
			return deepCloneSheep;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
