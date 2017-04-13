package hellofile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class fileio {

	public static void main(String[] args) {
			File file = new File("text.txt");
			if(file.exists()){
				System.err.println(file.getName()+"  exist!");
				try {
					
					
					FileInputStream fis = new FileInputStream(file);
					InputStreamReader isr;
					try {
						isr = new InputStreamReader(fis,"UTF-8");
					
					BufferedReader br = new BufferedReader(isr);
					String line;
					try {
						while((line = br.readLine())!= null){
							System.out.println(line);
						}
						br.close();
						isr.close();
						fis.close();
						
						
					} catch (IOException e) {
						System.err.println("ִcsc");
						e.printStackTrace();
					}} catch (UnsupportedEncodingException e1) {
						System.err.println(" dcdc");
						e1.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					System.err.println(" dsd");
					e.printStackTrace();
				}
				
			}
			else{
				System.err.println(file.getName()+"  not exist!");
			}
	}

}
