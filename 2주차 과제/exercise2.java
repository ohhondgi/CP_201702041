package day3;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letter;
		
		System.out.print("������ �ϳ��� �Է����ּ���. : ");
		letter = scan.nextLine();
		
		switch (letter) {
		case "a": case "e": case "i": case "o": case "u":
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�����Դϴ�.");
			break;
		}
		scan.close();
	}
}
