package Intro;

public class Test {
	public static void main(String[] args) {
		
		final int x = 100;
		try {
			
			//x = 200;
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.print("Value able change: " + x);
	}

}
