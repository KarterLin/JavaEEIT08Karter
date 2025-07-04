package karter.java;

public class Brad06骰子 {

	public static void main(String[] args) {
		double temp = Math.random();
				
		int score = (int)(temp*101);
		System.out.println("分數為:"+score);
		
		int dice = (int)(temp*6)+1; //骰子0~5，往右位移+1 = 1~6
		System.out.println("骰子點數:"+dice);
		
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60){
			System.out.println("D");
		}
		else{
			System.out.println("E");
		}
		
	}

}
