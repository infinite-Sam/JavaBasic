package java_basic;

public class A_variable {

	public static void main(String[] args) {

		// 변수 : 변할수 있는 값, 초기화 필수, 재사용성 증가->오류 감소
		int n1 = 1; // int타입 변수 a 선언 후 10으로 초기화
		System.out.println(n1); // 변수 a의 값인 10 출력

		n1 = n1; // 변수 a의 값 10 -> 50으로 변경
		System.out.println(n1); // 다시 a값을 출력하면 50 출력

		int n2 = 2, n3 = 3; // 여러 변수 선언과 초기화를 동시에 가능
		System.out.println(n1 + n2 + n3); // 5 + 2 + 3 = 10 출력

		// 변수의 타입 : 각 변수는 지정한 타입에 맞는 값을 사용해야함
		int i = 1; // 정수
		double d = 1.1; // 실수
		boolean b = true; // true, false
		char c = '아'; // 문자 하나
		String s = "아이스크림"; // 문자열

		System.out.println(i); // 1 출력
		System.out.println(d); // 1.1 출력
		System.out.println(b); // true 출력
		System.out.println(c); // 아 출력
		System.out.println(s); // 아이스크림 출력

		// 숫자 타입
		// 정수(대부분 보통 int사용)
		byte nb = 127; // -128 ~ 127
		short ns = 32767; // -32,768 ~ 32,767
		int ni = 2147483647; // 약 20억
		long nl = 9222313123123123123L; // 엄청 큰 수
		// 실수(대부분 보통 double 사용)
		float nf = 10.1f; // 뒤에 f를 붙여줘야함
		double nd = 10.1; // 보통 double을 사용

		// 문자 타입
		char cc = 'A'; // 문자 하나, char타입은 작은 따옴표
		String ss = "Abcd"; // 문자열, 큰따옴표

		boolean bb = false; // true or false

	}

}