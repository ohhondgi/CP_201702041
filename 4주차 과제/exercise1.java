package day5;

import java.util.Random;

public class exercise1 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[10];
		for (int i=0; i<10; i++) {
			array[i] = random.nextInt(100);
			System.out.print(array[i]+" ");
		}
		int max = array[0];
		int min = array[0];
		for (int i=0; i<9; i++) {
			if (array[i+1]>max)
				max = array[i+1];
			if (array[i+1]<min)
				min = array[i+1];
			}
		System.out.println("\n10���� �� �� ���� ū ����: "+ max);
		System.out.println("10���� �� �� ���� ���� ����: "+ min);
	}
}