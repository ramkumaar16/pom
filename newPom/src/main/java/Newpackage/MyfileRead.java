package Newpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class MyfileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader read = new FileReader("F:\\ramfile.txt");
		BufferedReader buff = new BufferedReader(read);   
		String myRead = null;
		while((myRead = buff.readLine())!=null) {
			System.out.println(myRead);
		}
		String mystring= "mytest file writer programme"; 
		FileWriter filewrite1 = new FileWriter("F:\\ramfile2.txt");
		BufferedWriter source = new BufferedWriter(filewrite1);
		source.write(mystring);
		FileReader fileread = new FileReader("F:\\ramfile2.txt");
		BufferedReader buffreader = new BufferedReader(fileread);
		String mynewstring = null;
		while ((mynewstring=buffreader.readLine())!=null) {
			System.out.println(mynewstring);
		}
		source.close();
		buffreader.close();
		buff.close();
		
	}
}
  