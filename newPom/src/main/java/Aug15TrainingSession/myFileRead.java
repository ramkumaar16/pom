package Aug15TrainingSession;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class myFileRead {
	
	public static void main(String[] args) throws IOException {
		
		FileReader read = new FileReader("E:\\mass.txt");
		BufferedReader buf= new BufferedReader(read);
		String reverse = null;
		while((reverse=buf.readLine())!=null) {
			System.out.println(reverse);
		}
		
	   String output = "Hi am ram cm kumaar";	
	   FileWriter write = new FileWriter("E:\\mass2.txt") ;
	   BufferedWriter buff = new BufferedWriter(write);
	   buff.write(output);
	   for (int i = 0; i < args.length; i++) {
		buff.write(output.charAt(i));
	}
	   System.out.println("my name is "+output);
	   
	   
	}

}
