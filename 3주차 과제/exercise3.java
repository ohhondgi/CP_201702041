package day4;
import java.util.Scanner;

class Date{
	int year,month,day;
	String month2;
	
	void printEasterm() {
		System.out.println("동양식 날짜 표현: " + year +"."+ month+ "."+day);
	}
	
	void printWesterm() {
		switch (month) {
		case 1:
			month2="Jenuary";
			break;
		case 2:
			month2="February";
			break;
		case 3:
			month2="March";
			break;
		case 4:
			month2="April";
			break;
		case 5:
			month2="May";
			break;
		case 6:
			month2="June";
			break;
		case 7:
			month2="July";
			break;
		case 8:
			month2="August";
			break;
		case 9:
			month2="September";
			break;
		case 10:
			month2="October";
			break;
		case 11:
			month2="November";
			break;
		case 12:
			month2="December";
			break;
		}
		System.out.println("서양식 날짜 표현: " + month2 +" "+ day+ ", "+year);
	}
}

public class exercise3 {
	public static void main(String[] args) {
		Date dt = new Date();
		Scanner input = new Scanner(System.in);
		System.out.print("연도 입력: ");
		dt.year = input.nextInt();
		System.out.print("월 입력: ");
		dt.month = input.nextInt();
		System.out.print("일 입력: ");
		dt.day = input.nextInt();
		
		dt.printEasterm();
		dt.printWesterm();
		input.close();
	}
}
