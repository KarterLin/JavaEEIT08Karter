package karter.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad46創新txt檔案 {

	public static void main(String[] args) {
		String mesg = "Hello, Seal\n";
		byte[] buf = mesg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt");//後面加上,true可以直些新增上去
			fout.write(buf);
			fout.flush();  //最好要加這個
			fout.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}catch (IOException e) {
//			System.out.println(e);
//		}
				
	}

}
