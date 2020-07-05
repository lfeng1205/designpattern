package prototype;

/**
 * 
 * @Description:原型模式
 * @author: clfeng
 * @date: 2020年5月3日 下午4:29:43
 */
public class Client {

	public static void main(String[] args) {
		CloneSheep cloneSheep = new CloneSheep("Tom", 18, "白色");
		CloneSheep cloneSheep1 = (CloneSheep) cloneSheep.clone();
		CloneSheep cloneSheep2 = (CloneSheep) cloneSheep.clone();
		CloneSheep cloneSheep3 = (CloneSheep) cloneSheep.clone();

		System.out.println(cloneSheep);
		System.out.println(cloneSheep1);
		System.out.println(cloneSheep2);
		System.out.println(cloneSheep3);

		System.out.println("==========================");

		DeepCloneSheep deepCloneSheep = new DeepCloneSheep("Tom", 18, "白色");
		deepCloneSheep.address = new Address("sichuan", "chengdu");
		DeepCloneSheep deepCloneSheep1 = (DeepCloneSheep) deepCloneSheep.clone();
		System.out.println(deepCloneSheep + "---" + deepCloneSheep.hashCode());
		System.out.println(deepCloneSheep1 + "---" + deepCloneSheep1.hashCode());

		System.out.println("序列化==========================");
		DeepCloneSheep deepCloneSheep2 = (DeepCloneSheep) deepCloneSheep.deepClone();
		System.out.println(deepCloneSheep + "---" + deepCloneSheep.hashCode());
		System.out.println(deepCloneSheep2 + "---" + deepCloneSheep2.hashCode());
	}
}
