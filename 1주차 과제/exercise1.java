package day2;

import java.util.Scanner;
public class exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user,com = null;
		int x = 0;
		int y = 0;
		int stage=0;
		
		for (int i=1; i<=7; i++) {
		int userNum = (int)(Math.random()*10) +1;
		System.out.print("���� ���� �� �� �ϳ��� �Է����ּ���: ");
		user = input.nextLine();
		
		switch (userNum) {
		case 1: case 4: case 7:
			com = "����";
			break;
		case 2: case 5: case 8:
			com = "����";
			break;
		case 3: case 6: case 9:
			com = "��";
			break;	}
		
			if (user.equals("����")) {
				if (com.equals("��")) {
					System.out.println("�̰��!");
					x++;}
				else if (com.equals("����")) {
					System.out.println("����");
					y++;}
				else 
					System.out.println("����");
			}
			else if (user.equals("����")) {
				if (com.equals("����")) {
					System.out.println("�̰��!");
					x++;}
				else if (com.equals("��")) {
					System.out.println("����");
					y++;}
				else
					System.out.println("����");
			}
			else if (user.equals("��")) {
				if (com.equals("����")) {
					System.out.println("�̰��!");
					x++;}
				else if (com.equals("����")) {
					System.out.println("����");
					y++;}
				else 
					System.out.println("����");
			}
			stage++;
			System.out.printf("stage %d - user %d�� vs computer %d�� \n",i,x,y);
		}
		if (x>y)
			System.out.println("�̱� ����� user");
		else if (x<y)
			System.out.println("�̱� ����� computer");
		else
			System.out.print("�̱� ����� ������ ����.");
		input.close();
	}
}

