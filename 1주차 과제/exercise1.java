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
		System.out.print("가위 바위 보 중 하나를 입력해주세요: ");
		user = input.nextLine();
		
		switch (userNum) {
		case 1: case 4: case 7:
			com = "가위";
			break;
		case 2: case 5: case 8:
			com = "바위";
			break;
		case 3: case 6: case 9:
			com = "보";
			break;	}
		
			if (user.equals("가위")) {
				if (com.equals("보")) {
					System.out.println("이겼다!");
					x++;}
				else if (com.equals("바위")) {
					System.out.println("졌다");
					y++;}
				else 
					System.out.println("비겼다");
			}
			else if (user.equals("바위")) {
				if (com.equals("가위")) {
					System.out.println("이겼다!");
					x++;}
				else if (com.equals("보")) {
					System.out.println("졌다");
					y++;}
				else
					System.out.println("비겼다");
			}
			else if (user.equals("보")) {
				if (com.equals("바위")) {
					System.out.println("이겼다!");
					x++;}
				else if (com.equals("가위")) {
					System.out.println("졌다");
					y++;}
				else 
					System.out.println("비겼다");
			}
			stage++;
			System.out.printf("stage %d - user %d승 vs computer %d승 \n",i,x,y);
		}
		if (x>y)
			System.out.println("이긴 사람은 user");
		else if (x<y)
			System.out.println("이긴 사람은 computer");
		else
			System.out.print("이긴 사람은 없으며 비겼다.");
		input.close();
	}
}

