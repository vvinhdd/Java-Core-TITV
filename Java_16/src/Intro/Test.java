package Intro;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// Tinh dien tich va Chu vi cuar hinh tron ban R nhap tu ban phim
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap R cua hinh tron: ");
		double R = s.nextDouble();
		
		double S = Math.PI * 2 * R;
		System.out.println("Chu vi cua hinh tron: " + Math.round(S) );
		System.out.println("Chu vi cua hinh tron: " + Math.round(S*100)/100.0 );
		double V = Math.pow(R, 2) * Math.PI;
		System.out.println("Dien tich cua hinh tron: " + Math.round(V) );
		System.out.println("Dien tich cua hinh tron: " + Math.round(V*100)/100.0 );
		
	}
}
