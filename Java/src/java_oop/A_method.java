package java_oop;

public class A_method {

	/*
	 * 메소드 : 클래스의 내부에 존재하며, 특정 기능을 하는 코드를 묶어 하나의 기능으로 표현, 함수 코드의 재사용성 향상, 자주사용하는 로직을
	 * 메소드로 만들어두면 호출하는것을 통해 간편하게 재사용가능
	 */
	public static void mtd1() { // 메소드 정의
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	// 매개변수(파라미터)를 사용한 반환값이 있는 메소드
	public static String mtd2(int p1, int p2) { // 메소드를 호출할때 int p1과 p2 값을 입력해주면 된다.
		int i = p1;
		String output = ""; // 만들어지는 숫자를 저장하기 위한 변수
		while (i < p2) {
			output += i; // 숫자를 output에
			i++;
		}
		return output; // output에 담겨있는 값을 메소드 외부로 반환하려면 return
	}

	public static void main(String[] args) { // main또한 메소드이다.
		mtd1(); // 메소드 호출

		System.out.println("");
		String result = mtd2(1, 5); // mtd2가 리턴한 값이 변수 result에 저장
		System.out.println(result);
	}

}
