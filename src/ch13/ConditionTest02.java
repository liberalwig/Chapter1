package ch13;

import java.util.Scanner;

public class ConditionTest02 {

	public static void main(String[] args) {
		
		int max;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력받은 뒤 더 큰 수를 가려냅시다");		
		
		System.out.println("입력1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("입력2: ");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2 ? num1 : num2);
		System.out.println(max);
	}
	
}
