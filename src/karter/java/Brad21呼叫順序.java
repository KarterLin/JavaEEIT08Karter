// 建構式 => 將祖宗十八代完成初始化
package karter.java;

import java.net.MulticastSocket;

public class Brad21呼叫順序 {

	public static void main(String[] args) {
		Brad211 obj1 = new Brad211(0);
		Brad212 obj2 = new Brad212();
		Brad213 obj31 = new Brad213();
		Brad213 obj32 = new Brad213(1);
		Brad213 obj33 = new Brad213(1.0);

	}

}

class Brad211 extends Object{
	Brad211(int a) {
		System.out.println("Brad211(int)");
	}
}
class Brad212 extends Brad211{
	Brad212(){
		// super(); 初始化無傳參數
		super(1);
		System.out.println("Brad212()");
	}
}
class Brad213 extends Brad212{
	Brad213(){
		
		System.out.println("Brad213()");
	}
	Brad213(int a){
		// super(); 沒寫的話，隱含super
		this();
		System.out.println("Brad213(int)");
	}
	Brad213(double a){
		this(2);     //寫這個就替代super了
		System.out.println("Brad213(double)");
	}
}

