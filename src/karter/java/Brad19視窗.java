package karter.java;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad19視窗 extends JFrame{
	private JButton b1, b2, b3;
	
	public Brad19視窗() {
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		
		setLayout(new FlowLayout()); //like室內設計師
		add(b1);add(b2);add(b3);
		
		
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad19視窗();

	}

}
