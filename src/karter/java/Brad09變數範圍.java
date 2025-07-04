package karter.java;

public class Brad09變數範圍 {

	public static void main(String[] args) {
		int i = 0;
		for (printBrad(); i<10; printLine()) {  //i++ = i+=1
			System.out.println(i++);
		}
		System.out.println("---");
//		System.out.println(i); //i只存活在宣告範圍內 如果我第六行沒有寫的話，print不出來

	}
	
	static void printBrad() {
		System.out.println("Brad");
	}
	
	static void printLine() {
		System.out.println("--------");
	}
	
}
