package java_basic;

public class B_operater {
	public static void main(String[] args) {
		/*
		 * 연산자 우선순위는 괄호(), 단항연산자, 산술연산자, shift, 비교, 등식, 비트, 논리 , 삼항, 대입 순서인데 
		 * 괄호가 가장 높고, 대입연산자가 가장 낮다는것만 알면 될듯...
		 */

		System.out.println("산술연산자");
		// 변수 초기화
		int a = 5;
		int b = 2;

		// 덧셈
		int sum = a + b;
		System.out.println("a + b = " + sum); // 5 + 2 = 7

		// 뺄셈
		int diff = a - b;
		System.out.println("a - b = " + diff); // 5 - 2 = 3

		// 곱셈
		int mul = a * b;
		System.out.println("a x b = " + mul); // 5 x 2 = 10

		// 나눗셈
		double div = (double) a / b;
		System.out.println("a / b = " + div); // 5 / 2 = 2

		// 나머지
		int mod = a % b;
		System.out.println("a % b = " + mod); // 5 % 2 = 1

		// 문자열
		System.out.println("\n문자열");
		String s1 = "study" + " coding";
		System.out.println(s1);

		String s2 = s1 + " together";
		System.out.println(s2);

		// 문자 + 숫자
		System.out.println("\n문자 + 숫자");
		System.out.println(a + s2 + b); // 5 + study coding together + 2
		System.out.println(a + b + s2); // (5 + 2) + study coding together

		// 증감연산자 : 값을 증가시키거나 감소시킴
		System.out.println("\n증감연산자");
		int i = 0;
		int y = 1;
		++i; // i = i + 1;
		System.out.println(i); // 1
		y = i++; // i의 현재값을 y에 먼저 대입하고, 그 이후에 i값 증가(후위 증감)
		System.out.println(y); // 1
		
		// 비교연산자 : 값을 비교할때 사용, 주로 조건문과 함께 사용
		System.out.println("\n비교연산자");
		System.out.println(i == y); // 1 == 0 = false
		System.out.println(i != y); // 1과 0이 다른것이 맞으므로 true
		
		// 결과를 boolean 변수에 담을수 있음
		boolean result = a == b;
		System.out.println(result);

		// 논리연산자 : && : 둘다 참일때 참, || : 둘중 하나라도 참일때 참
		System.out.println("\n논리연산자");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(true || false); // true
		System.out.println(!true || false); // false

		// 대입연산자
		System.out.println("\n대입연산자");
		i = 0;
		i += 3; // i = i + 3;
		System.out.println(i);
		
		i *= 4; // i = i * 4;
		System.out.println(i);
		
		

	}
}
