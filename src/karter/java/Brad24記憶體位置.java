package karter.java;

public class Brad24記憶體位置 {

	public static void main(String[] args) {
		String name = "Seal小海豹";
		System.out.println(name);
		String name2 = name.concat("Lin");//重新建立一個，原來的物件不會動
		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.length());
		String name3 =name.replace('a', 'A');//字元是用單引號
		System.out.println(name3);
		System.out.println("-------");
		String s1 = new String("Seal");
		String s2 = s1;
		System.out.println(s1 == s2);
		s2 = "Seal";
		System.out.println(s1 == s2);
	}

}
