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
			System.out.println("正在删除文件");
			file.delete();
			System.out.println("文件已删除");
		}
		else{
			System.out.println("文件不存在");
			if (file.mkdir()){
				System.out.println("文件夹创建成功");
			}
			else{
				System.out.println("文件夹创建失败");
			}
		}
	}
}
