package Intro;

import java.util.Scanner;

public class Chuyen10to2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so thap phan can chuyen doi: ");
		int x = s.nextInt();
		String result = "";
		
		while(x>0) {
			int cell = x%2;
			x = x/2;
			//System.out.println("So Du: " + cell);
			//System.out.println("Next X: " + x);
			result = cell + result;
		}
		System.out.println("So nhi phan: " + result);
		
	}

}
