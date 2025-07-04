package karter.java;

public class Brad01宣告變數 {

	public static void main(String[] args) {
		// byte, short, int, long
		// byte => -128 ~ 127 =>2^8
		// 強型別，宣告了就只會在這個區域
		// short => 2^16 => -32768 ~ 32767
		// int => 2^32 => default
		// long => 2^64
		byte var1, var2;
		var1 = 10;
		var2 = 3;
		int var3 = var1 / var2;   //運算完會放在int，所以用byte會報錯
		// 宣告int 後 10/3 =3  因為強型別，所以不會變成flo
		System.out.println(var3);

	}

}
