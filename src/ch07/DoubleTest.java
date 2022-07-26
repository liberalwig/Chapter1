package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double dnum = 3.14;
		float fnum = 3.14F; // F이라는 식별자를 써주지 않으면 오류 남
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double doubleNumber = 1;
		
		for(int i = 0; i<10000; i++) {
			doubleNumber = doubleNumber + 0.1;
		}
		
		System.out.println(doubleNumber); // 이 경우 더 넓은 범위를 쓰기 위해 소수점 이하는 오류가 발생하기도 하는데 당황하지 말 것. 원래 이럼.
	}

}
