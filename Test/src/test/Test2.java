package test;

import java.util.Random;

public class Test2 {
	public static void main(String [] args) {
		int min = 10;
		int max = 20;
		Random r = new Random();
		int rn = r.nextInt(max-min+1)+min;
		System.out.println(rn);
	}
}
