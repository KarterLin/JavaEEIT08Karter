package karter.java;

public class Brad07閏年問題 {

	public static void main(String[] args) {
		int year = 2024; //可以被4整除的叫閏年，但不能被100整除，但可以被400整除。
		// %4 ==0    閏
		// %100 ==0  平
		// %400 ==0  閏
		boolean isLeap;  //Leap閏年
		
		if (year % 4 == 0) {
			if(year % 100 ==0) {
				if (year % 400 ==0) {
					isLeap = true;
				}else {
					isLeap = false;
				}
			}else {
				isLeap = true;
			}
		}else {
			//平
			isLeap = false;
		}
		
		
		System.out.printf("%d年是%s年\n",year,isLeap?"閏":"平"); //三元運算式
		//----------------
		if (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0)) {
			isLeap = true;
		}else {
			isLeap = false;
		}
		System.out.printf("%d年是%s年\n",year,isLeap?"閏":"平"); //三元運算式
	}

}
