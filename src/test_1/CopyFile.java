package test_1;

import java.io.*;

public class CopyFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args)throws IOException {
		// TODO 自动生成的方法存根
		int i;
		File f = new File("text_1");
		FileInputStream fin;
		FileOutputStream fout/* = new FileOutputStream(f)*/;
		
		
		
		try {
			try {
				fin = new FileInputStream("text.txt");
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("file not find");
				return;
			}
			
			try {
				fout =new FileOutputStream(f);
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("Error Opening Output File");
				return;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("usage : copyFile From To");
			return;
		}
		
		try {
			do {
				i = fin.read();
				if (i!=-1)fout.write(i);
			} while (i!=-1);
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("file error");;
		}
		
		fin.close();
		fout.close();
		System.out.print("main exiting");
	}

}
