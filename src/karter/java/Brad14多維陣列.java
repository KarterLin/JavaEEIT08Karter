// 一個陣列裡面存有另一個陣列(一維陣列中還有其他維度
package karter.java;

public class Brad14多維陣列 {

	public static void main(String[] args) {
		int[][] a;
		a = new int[3][4];

		int[][] b;
		b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[3];
		b[2] = new int[2];
		
		System.out.println(b.length);
		System.out.println(b[0].length);
		System.out.println(b[1].length);
		System.out.println(b[2].length);
		System.out.println("----");
		
		for(int[]v : b) {
			for (int vv:v) {
				System.out.print(vv + " ");				
			}			
			System.out.println();		
		}
	}
}
