package hellofile;

import java.io.File;

public class hellofile {
	public static void main(String args[]) {
		File file = new File("hello.txt");
		if (file.exists())
		{
			
//			File rename = new File("../new hello.txt");
//			file.renameTo(rename);
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println("����ɾ���ļ�");
			file.delete();
			System.out.println("�ļ���ɾ��");
		}
		else{
			System.out.println("�ļ�������");
			if (file.mkdir()){
				System.out.println("�ļ��д����ɹ�");
			}
			else{
				System.out.println("�ļ��д���ʧ��");
			}
		}
	}
}
