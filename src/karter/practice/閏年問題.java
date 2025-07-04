package karter.practice;

import java.util.Scanner;
public class 閏年問題 {

	public static void main(String[] args) {
		//可以被4整除的叫閏年，但不能被100整除，但可以被400整除。
		// %4 ==0    閏
		// %100 ==0  平
		// %400 ==0  閏
		
		Scanner scanner = new Scanner(System.in);  // 建立輸入工具

        System.out.print("請輸入年份：");
        int year = scanner.nextInt();              // 讀取一個 int 整數

        System.out.println("你輸入的年份是：" + year);
        
        scanner.close(); // 好習慣：用完要關閉
        
        System.out.println("--以下判斷是否閏年--");
        
        boolean isLeap;  //Leap閏年
        if(year % 4 ==0) {
//        	System.out.println(year+"是閏年");
        	isLeap = true;
        }
        
        System.out.println();
        
        
		

	}

}
