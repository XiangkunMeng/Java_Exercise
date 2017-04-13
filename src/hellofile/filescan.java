package hellofile;

import java.io.File;

public class filescan {

	public static void main(String[] args) {
		scan(new File("H:/MySP"), 1);
	}

	public static void scan(File dir, long tab) {
		if (dir.isDirectory()) {
			File ls[] = dir.listFiles();
			for (int i = 0; i < ls.length; i++) {
				for (long j = 0; j < tab; j++) {
					System.out.print("|¡ª¡ª");
				}
				System.out.println(ls[(int) i].getName());
				if (ls[i].isDirectory()) {
					scan(ls[i], tab + 1);
				}
			}
		}
	}

}
