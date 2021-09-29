package co.micol.prj;

import java.util.Scanner;

public class lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int moneynum = money / 1000;
		if (money % 1000 != 0) {
			System.out.println("¹ñ¾î³»¾ßÇÒµ· :" + money % 1000);
		}
		int[] ary = new int[6];
		for (int k = 1; k <= moneynum; k++) {
			for (int i = 0; i < ary.length; i++) {
				int score = (int) (Math.random() * 45) + 1;
				ary[i] = score;
				boolean Flag = true;
				for (int j = 0; j < i; j++) {
					if (ary[i] == ary[j]) {
						i--;
						Flag = false;
					}
				}
				if (Flag == true) {
					System.out.print(ary[i] + " ");
				}
			}
			System.out.println();
			if (k % 5 == 0) {
				System.out.println("===============");
			}
		}

	}
}
