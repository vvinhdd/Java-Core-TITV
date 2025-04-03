package Intro;

import java.util.Scanner;

public class CuuChuong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap vao bang cuu chuong can tinh");
		int a = s.nextInt();
		for(int i=1; i<=9; i++) {
			int k = a*i;
			System.out.println(a+ "x" + i + " = " + k);
		}
		
	}
	
	

}
