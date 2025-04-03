package Intro;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap x: ");
		int x = s.nextInt();
		
		String result = (x%2==0) ? "La So Chan" : "La So Le";
		System.out.println(x + " " + result);
	}
}
