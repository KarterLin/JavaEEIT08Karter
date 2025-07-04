package karter.java;

public class PokerV1陣列 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int[]poker = new int[52];
		
		// 洗牌
		for (int i=0; i<poker.length; i++) {
        //	poker[i] = (int)(Math.random()*52); //這樣會有重複的
			int rand = (int)(Math.random()*52);
			
			//檢查是否重複
			boolean isRepeat = false; 
			for (int j = 0; j < i; j++) {
				if (rand == poker[j]) {
					// 重複了
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
			poker[i] = rand;
			System.out.println(poker[i]);
			}else {
				i--;
			}
		}
		
		System.out.println("---");
		System.out.println(System.currentTimeMillis()- start);
		// 發牌
		
		// 攤牌 + 理牌

	}

}
