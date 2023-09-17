package Main;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		int[] aaa = {1,2,3};
//		ArrayList<Integer> aa = new ArrayList<>();
//		aa.add(2);
//		aa.add(2);
//		aa.add(2);
		try {
			int e = aaa[5];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
