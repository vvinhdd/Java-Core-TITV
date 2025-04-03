package Excercise;

import java.util.Scanner;

public class TinhNgay {
	public static void main(String[] args) {
		//Xuat ra so ngay cua thang ma nguoi dung nhap vap
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap vao thang can tinh");
		int month = s.nextInt();
		System.out.println("Nhap vao nam");
		int year = s.nextInt();
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Thang " + month + " co 31 ngay");
				break;
			case 2:
				if ( (year%4==0 && year%100!=0) || (year%400==0) ) {
					System.out.println("Nam nhuan, thang " + month + " co 29 ngay" );
				}else {
					System.out.println("Nam khong nhuan, thang " + month + " co 28 ngay");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Thang " + month + " co 30 ngay");
				break;
			default:
				System.out.println("Khong co thang nao phu hop");
		}
				
		s.close();
	}

}
