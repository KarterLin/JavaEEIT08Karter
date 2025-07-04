package karter.java;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RacingTesting extends JFrame {
	private JButton go;
	private JLabel[] lanes;
	private Car[] cars;
	private volatile boolean raceFinished = false;  // 標記是否已經有第一名
	private int winnerLane = -1;

	public RacingTesting() {
		setLayout(new GridLayout(9, 1));
		
		go = new JButton("Go!");
		add(go);

		lanes = new JLabel[8];
		for (int i = 0; i < lanes.length; i++) {
			lanes[i] = new JLabel(String.format("%d.", (i + 1)));
			add(lanes[i]);
		}

		setSize(1024, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resetRace(); // 重置畫面
				go();        // 開始比賽
			}
		});
	}

	private void resetRace() {
		// 終止舊的車（如果有）
		if (cars != null) {
			for (Car c : cars) {
				if (c != null && c.isAlive()) {
					c.interrupt();
				}
			}
		}

		// 重設畫面和狀態
		for (int i = 0; i < lanes.length; i++) {
			lanes[i].setText(String.format("%d.", i + 1));
		}
		raceFinished = false;
		winnerLane = -1;
	}

	private void go() {
		cars = new Car[8];
		for (int i = 0; i < lanes.length; i++) {
			cars[i] = new Car(i);
			cars[i].start();
		}
	}

	private class Car extends Thread {
		private int lane;
		private StringBuffer sb;

		Car(int lane) {
			this.lane = lane;
			sb = new StringBuffer(String.format("%d.", (lane + 1)));
		}

		@Override
		public void run() {
			for (int i = 0; i < 100 && !isInterrupted(); i++) {
				sb.append(">");
				lanes[lane].setText(sb.toString());

				try {
					Thread.sleep(10 + (int) (Math.random() * 20));
				} catch (InterruptedException e) {
					// 被中斷時直接結束
					return;
				}
			}

			// 抵達終點，檢查是否為第一名
			if (!raceFinished) {
				raceFinished = true;
				winnerLane = lane;

				lanes[lane].setText(sb.toString() + " 🏆第一名");

				// 中斷所有其他車
				for (int i = 0; i < cars.length; i++) {
					if (i != lane && cars[i] != null && cars[i].isAlive()) {
						cars[i].interrupt();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		new RacingTesting();
	}
}

