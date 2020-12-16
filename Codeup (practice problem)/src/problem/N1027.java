package problem;

import java.util.Scanner;

public class N1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, day;

		String[] today = sc.nextLine().split("\\.");
		year = Integer.parseInt(today[0]);
		month = Integer.parseInt(today[1]);
		day = Integer.parseInt(today[2]);
		System.out.println(
				String.format("%02d", day) + "-" + String.format("%02d", month) + "-" + String.format("%4d", year));
	}
}
