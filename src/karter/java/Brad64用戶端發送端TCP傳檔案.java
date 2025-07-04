package karter.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.net.Socket;

public class Brad64用戶端發送端TCP傳檔案 {

	public static void main(String[] args) {
		File source = new File("dir1/TheNothingSeal.jpg");
		byte[] buf = new byte[(int)source.length()];
		try {
			BufferedInputStream bin = 
					new BufferedInputStream(new FileInputStream(source));
			bin.read(buf);
			bin.close();
			
			Socket socket = new Socket(InetAddress.getByName("10.0.101.65"),7777);
			BufferedOutputStream bout =
					new BufferedOutputStream(socket.getOutputStream());
			bout.write(buf);
			bout.flush();
			bout.close();
			System.out.println("Send OK");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
