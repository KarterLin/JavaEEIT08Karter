package karter.java;

public class Brad九九乘法表 {

	public static void main(String[] args) {
		//flexible寫法 把常數定義替換，彈性較大
		final int ROWS = 1;    //final常數 //列
		final int COLS = 9;	   //幾行
		final int START = 1;   //從幾開始
		
		for (int k = 0; k<ROWS /*幾列*/; k++ ) {
			for (int j = 1; j<=9 ; j++) {
				for (int i = START; i< START+COLS; i++) {
					int newi = i + k * COLS; //先乘除後加減
					int r = newi * j;
					System.out.printf("%d x %d = %d\t",newi,j,r);	
				}
				System.out.println();
			}
			System.out.println("----------------------------------------------------------");
		}
		
		
		System.out.println("**********************************************************");
		
		
		
		//---------以下OK(九九乘法表)
		for (int k = 0; k<2 /*幾列*/; k++ ) {
			for (int j = 1; j<=9 ; j++) {
				for (int i = 2; i<= 5; i++) {
					int newi = i + k * 4; //先乘除後加減
					int r = newi * j;
					System.out.printf("%d x %d = %d\t",newi,j,r);	
				}
				System.out.println();
			}
			System.out.println("----------------------------------------------------------");
		}			
	}
}
