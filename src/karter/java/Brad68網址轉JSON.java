package karter.java;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad68網址轉JSON {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			reader.close();
			conn.disconnect();
			
			parseJSON(sb.toString());
			
//			System.out.println(sb);
			
//			FileOutputStream fout = new FileOutputStream("dir1/iii.html");
//			fout.write(sb.toString().getBytes());
//			fout.close();
			
			System.out.println("Finished");
							
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	static void parseJSON(String json) {
		JSONArray root = new JSONArray(json);
		System.out.println(root.length());
		for (int i=0; i<root.length();i++) {
			JSONObject row = root.getJSONObject(i);
			String name = row.getString("Name");
			String addr = row.getString("Address");
			String tel = row.getString("Tel");
			String city = row.getString("City");
			String town = row.getString("Town");
			System.out.printf("%s : %s : %s%s%s\n", name, tel, city, town, addr);
		}
	}
}
