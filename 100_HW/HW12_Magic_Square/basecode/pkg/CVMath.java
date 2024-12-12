package pkg;

public class CVMath {		

	public static boolean perfectSquare(int num) {
		int perfsquare = (int)(Math.sqrt(num));
		if(perfsquare*perfsquare == num) {
			return true;
		}
	}
	
	public static int specialSquare() {
		int count = 5;
		int tot = 0;
		for(int num = 0; num < count; num++) {
			if (perfectSquare(num) == false) {
				count++;
			}
			else if (perfectSquare(num) == true) {
				for (int i = 1; i < num; i++) {
					tot = tot+i;
					if (i+tot == num) {
						return tot;
					}
					
				}
			}	
		}
	}
	
	public static int[] magicSquare(int num) {
		int count = 0;
		int i = 0;
		int [] arr = new int [num];
			while (count < num) {
				arr[i] = specialSquare();
				count++;
				i++;
			}
		return arr[num];
	}
}
