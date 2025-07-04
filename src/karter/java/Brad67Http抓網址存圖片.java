package karter.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Brad67Http抓網址存圖片 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://s.yimg.com/uu/api/res/1.2/VP9kzWfDgqKRQidKD6roaA--~B/Zmk9ZmlsbDtoPTQ3MjtweW9mZj0wO3c9ODA4O2FwcGlkPXl0YWNoeW9u/https://s.yimg.com/os/creatr-uploaded-images/2024-07/b0b03ae0-4d95-11ef-9eea-496b7c6ab751.cf.webp");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();

			BufferedInputStream bin =
					new BufferedInputStream(conn.getInputStream());
			BufferedOutputStream bout =
					new BufferedOutputStream(new FileOutputStream("dir2/yahoo.jpg"));
			byte[] buf = new byte[4*1024]; int len;
			while ((len = bin.read(buf)) != -1) {
				bout.write(buf,0,len);
				
			}
			bout.flush();
			bout.close();
			bin.close();
			
			System.out.println("Finished");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
