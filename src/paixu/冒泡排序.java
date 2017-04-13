package paixu;

public class 冒泡排序 {
	public static void main(String[] args) {
		int[] soc = { 20, 56, 45, 85, 69, 32 };
		for (int i = 0; i < soc.length; i++) {
			for (int j = 0; j < soc.length; j++) {
				if (soc[i] > soc[j]) {
					int temp;
					temp = soc[i];
					soc[i] = soc[j];
					soc[j] = temp;
				}
			}
			for (int k = 0; k < soc.length; k++) {
				System.out.println(soc[k]);
			}
			System.out.println("\n");
		}
		for (int k = 0; k < soc.length; k++) {
			System.out.println(soc[k]);
		}
	}

}
