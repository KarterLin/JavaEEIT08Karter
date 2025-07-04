package karter.java;

public class Brad04DoubleAndFloat {

	public static void main(String[] args) {
		// float double
		float var1 = 10;
		float var2 = 3f; //後面放f 代表佔有float空間
		double var3 = var1 / var2;
		System.out.println(var3);
		
		// 如果要顯示小數，一般都用double，因為float後面要加上f較麻煩
		double var4 = 10;
		double var5 = 3;
		double var6 = var4 / var5;
		System.out.println(var6);

	}

}
