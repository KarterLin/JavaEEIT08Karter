package karter.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad62TCPserver端 {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(9999);  //http://127.0.0.7(:800) 可以測試
			Socket socket = server.accept();
			
			String urip = socket.getInetAddress().getHostName();
			System.out.println("urip:");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line;
			while( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			socket.close();
			System.out.println("Finished");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				try {
					server.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
