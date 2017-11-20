package day3;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letter;
		
		System.out.print("영문자 하나를 입력해주세요. : ");
		letter = scan.nextLine();
		
		switch (letter) {
		case "a": case "e": case "i": case "o": case "u":
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
			break;
		}
		scan.close();
	}
}
