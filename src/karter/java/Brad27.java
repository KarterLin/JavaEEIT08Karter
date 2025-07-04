package karter.java;

public class Brad27 {

	public static void main(String[] args) {
		Brad271 obj1 = new Brad271();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println("-----");
		Brad271 obj2 = new Brad271();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println("-----");
		Brad271 obj3 = new Brad271();
		System.out.println(obj1.i);
		System.out.println(obj1.j);

	}

}
class Brad271{
	int i;
	static int j;
	Brad271(){
		i++;
		j++;
	}
}