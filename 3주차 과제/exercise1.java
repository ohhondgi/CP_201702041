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
	System.out.println("������ ����: " + a + "��");
	System.out.println("������ ����: " + b + "��");
	}
}

public class exercise1 {
	public static void main(String[] args) {
		Matter mt = new Matter();
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��Ͻÿ�: ");
		mt.letter = input.nextLine();
		
		mt.caculate();
		input.close();
	}
}
