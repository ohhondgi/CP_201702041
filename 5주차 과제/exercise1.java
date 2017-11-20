package day6;

import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount bk1 = new BankAccount();
		BankAccount bk2 = new BankAccount();
		
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호: ");
		bk1.accountNumber = input.nextLine();
		
		System.out.print("예금주: ");
		bk1.owner = input.nextLine();
		
		System.out.print("초기 잔액: ");
		bk1.balance = input.nextInt();
		
		System.out.println("\n계좌2 정보 입력");
		
		System.out.print("계좌번호:");
		bk2.accountNumber = input.nextLine();
		bk2.accountNumber = input.nextLine();
		
		System.out.print("예금주: ");
		bk2.owner = input.nextLine();
		
		System.out.print("초기 잔액: ");
		bk2.balance = input.nextInt();
		
		System.out.print("계좌1 에서 계좌2로 송금할 금액: ");
		bk2.sendAccouunt(input.nextInt(), bk1);
		
		System.out.println("=========================");
		System.out.println("계좌 1"+"\n계좌번호 : "+bk1.accountNumber+"\n예금주: "
		+ bk1.owner+bk1.toString(bk1.balance));
		System.out.println("\n계좌 2"+"\n계좌번호 : "+bk2.accountNumber+"\n예금주: "
		+ bk2.owner+bk2.toString(bk2.balance));
		input.close();
	}
}
