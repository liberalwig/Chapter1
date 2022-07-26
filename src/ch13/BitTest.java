package ch13;

public class BitTest {

	public static void main(String[] args) {

		int num1 = 5;  // 00000101
		int num2 = 10; // 00001010;
		
		System.out.println(num1 | num2); // | : 비교하는 비트가 다를 때만 1이 나옴 =>15
		System.out.println(num1 & num2); // &: 비교하는 비트가 같을 때만 1이 나옴 => 0
		System.out.println(num1 ^ num2); // ^ : 비교하는 비트가
			
	}

}
