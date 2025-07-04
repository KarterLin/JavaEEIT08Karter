//擲骰子 ，擲骰子100次，各點出現幾次 (陣列版本)//增加456的機率
package karter.java;

public class Brad12灌鉛骰子 {

	public static void main(String[] args) {
		int[] p = new int[7];

		for (int i = 0; i < 10000; i++) {
			int point = (int) (Math.random() * 9) + 1; // 1 ~ 6
			if (point >= 1 && point <= 9) {
				p[point<=6?point:point-3]++;
			} else {
				p[0]++;
			}
		}
		if (p[0] == 0) {
			for (int i = 1; i < p.length; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}
		} else {
			System.out.println("error");
		}
	}
}
