package days34;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class FileUtil {
	public static void fileToPrint(String fileName) throws Exception{
		//구현
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
		
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(":: "+line);
		}
	}
	
	public static Vector<User> fileFindAddres(String fileName, String address) throws IOException{
		//구현
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
		String[] sa = new String[5];
		Vector<User> vv = new Vector<User>();
		boolean male = false;
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			sa = line.split("/");
			if(sa[3].equals("남")) {
				male = true;
			}
			if(sa[3].equals("여")) {
				male = false;
			}
			 User user = new User(sa[0], sa[1], sa[2], male);
			 if(user.getAddress().equals(address)) {
				 vv.add(user);
			 }
		}
		return vv;
	}
}
