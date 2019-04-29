package Utils;

import java.util.Random;

public class RandNum {
	public int rand(int min,int max) {
		Random r = new Random();
		int rm = r.nextInt(max-min+1)+min;
		return rm;
	}
}
