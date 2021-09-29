package co.micol.prj2;

import java.util.Scanner;

public class Bj3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] ary = new int[c];
		

		for (int i = 0; i < ary.length; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			ary[i]= a+b;

			System.out.println(ary[i]);
		}

	}
}
