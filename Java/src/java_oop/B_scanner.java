package java_oop;

import java.util.Scanner;

public class B_scanner {

	public static void main(String[] args) {
		// Scanner : 자바가 실행되는 중에 사용자가 입력가능
		System.out.println("값을 입력해주세요.");
		Scanner sc = new Scanner(System.in); // 스캐너
		while(sc.hasNext()) { // sc.hasNext()는 입력값이 생기기 전까지 실행 보류
			System.out.println("입력한 값은 " + sc.next()); // 출력
		}
		sc.close(); // 종료

	}

}
