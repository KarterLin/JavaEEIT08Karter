package karter.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad59UDP發送端 {

	public static void main(String[] args) {
		String mesg = "無所事事小海豹 The Nothing Seal";
		byte[] data = mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket pocket = new DatagramPacket(data, data.length,
					InetAddress.getByName("10.0.101.65"),8888);
			socket.send(pocket);
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
