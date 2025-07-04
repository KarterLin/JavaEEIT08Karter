package karter.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad58網路ip {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");
			for (InetAddress ip : ips) {
			System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
//			System.out.println(e);
		}

	}

}
