package day4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise2 {
	public static void main(String[] args) throws IOException {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("문자열을 입력해주세요: ");
	char[] ask = buf.readLine().toCharArray();
	
	for (int i=0; i<ask.length; i++) {
		if (ask[i]>=97&&ask[i]<=122)
			ask[i] -= 32;
		else if (ask[i]>=65&&ask[i]<=90)
			ask[i] += 32;
		}
	System.out.print(ask);
	}
}