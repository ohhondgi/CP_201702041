package day2;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year,month,day,total_day,b;
		int k=0;
		int total=0;
		String a="";
		
		System.out.print("년도를 입력해주세요:");
		year = scan.nextInt();
		System.out.print("월을 입력해주세요:");
		month = scan.nextInt();
		System.out.print("일을 입력해주세요:");
		day = scan.nextInt();
				
		for (int i=1; i<month; i++) {
			switch (i) {
			case 1: case 3: case 5: case 7: 
			case 8: case 10: case 12:
				k=31;
				break;
			case 4: case 6: case 9: 
			case 11:
				k=30;
				break;
			case 2:
				k=28;
				break;
			}
			total +=k;
		}
		
		total_day = (year-1900)*365 + ((year-1900)/4) + total + day;
		if (((year%4==0) && (year%100!=0) || (year%400==0)) && (month<3))
			total_day -=1;
		b= total_day%7;

		switch (b) {
		case 0:
			a="일요일";
			break;
		case 1:
			a="월요일";
			break;
		case 2:
			a="화요일";
			break;
		case 3:
			a="수요일";
			break;
		case 4:
			a="목요일";
			break;
		case 5:
			a="금요일";
			break;
		case 6:
			a="토요일";
			break;
		}
		System.out.println(year+"년 "+month+"월 "+day+"일은 "+a+"입니다.");
		scan.close();
	}
}
