package day4;
import java.util.Scanner;

class Matter{
	String letter;
	int a=0,b=0,i=0;
	
	void caculate() {
		letter = letter.toLowerCase();
	while (true) {
		if (letter.charAt(i)=='a' || letter.charAt(i)=='e' || letter.charAt(i)=='i' || letter.charAt(i)=='o'
				|| letter.charAt(i)=='u') {
			a++; i++;
		}
		else {
			b++; i++;
		}
		if (i==letter.length())
			break;
		}
	System.out.println("모음의 개수: " + a + "개");
	System.out.println("자음의 개수: " + b + "개");
	}
}

public class exercise1 {
	public static void main(String[] args) {
		Matter mt = new Matter();
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오: ");
		mt.letter = input.nextLine();
		
		mt.caculate();
		input.close();
	}
}
