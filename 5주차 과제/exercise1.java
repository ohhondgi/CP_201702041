package day6;

import java.util.Scanner;

public class exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount bk1 = new BankAccount();
		BankAccount bk2 = new BankAccount();
		
		System.out.println("����1 ���� �Է�");
		System.out.print("���¹�ȣ: ");
		bk1.accountNumber = input.nextLine();
		
		System.out.print("������: ");
		bk1.owner = input.nextLine();
		
		System.out.print("�ʱ� �ܾ�: ");
		bk1.balance = input.nextInt();
		
		System.out.println("\n����2 ���� �Է�");
		
		System.out.print("���¹�ȣ:");
		bk2.accountNumber = input.nextLine();
		bk2.accountNumber = input.nextLine();
		
		System.out.print("������: ");
		bk2.owner = input.nextLine();
		
		System.out.print("�ʱ� �ܾ�: ");
		bk2.balance = input.nextInt();
		
		System.out.print("����1 ���� ����2�� �۱��� �ݾ�: ");
		bk2.sendAccouunt(input.nextInt(), bk1);
		
		System.out.println("=========================");
		System.out.println("���� 1"+"\n���¹�ȣ : "+bk1.accountNumber+"\n������: "
		+ bk1.owner+bk1.toString(bk1.balance));
		System.out.println("\n���� 2"+"\n���¹�ȣ : "+bk2.accountNumber+"\n������: "
		+ bk2.owner+bk2.toString(bk2.balance));
		input.close();
	}
}
