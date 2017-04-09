package paixu;

public class 选择排序 {
	public static void main(String args[]) {
		int soc[] = { 23, 56, 46, 497, 46, 4, 64, 46 };
		for (int i = 0; i < soc.length; i++) {
			for (int j = i; j < soc.length; j++) {
				if (soc[j] > soc[i]) {
					int temp;
					temp = soc[i];
					soc[i] = soc[j];
					soc[j] = temp;
				}
			}
			for (int k = 0; k < soc.length; k++) {
				System.out.print(soc[k] + "\t");
			}
			System.out.println("\n");
		}
		for (int k = 0; k < soc.length; k++) {
			System.out.print(soc[k] + "\t");
		}
	}
}
