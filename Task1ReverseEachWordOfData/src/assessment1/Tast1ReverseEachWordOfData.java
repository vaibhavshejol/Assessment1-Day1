package assessment1;

import java.io.*;

public class Tast1ReverseEachWordOfData {

	public static void main(String[] args) throws IOException {
		System.out.println("Application work properly....");
		
		FileReader f=new FileReader("D:\\Assessments\\Assessment1-Day1\\input.txt");
		BufferedReader br=new BufferedReader(f);
		
		String data="";
		String line;
		while((line=br.readLine())!=null) {
			data=data+"\n"+line;
		}
		System.out.println(data);
	}

}
