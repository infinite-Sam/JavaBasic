package java_basic;

import java.util.Iterator;

public class D_loop {

	public static void main(String[] args) {
		// 반복문
		int sum = 0;
		int i = 1;
		int endNum = 5;
		// while문 : 조건이 참인 동안 반복
		System.out.println("while문");
		while (i <= endNum) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
			i++;
		}

		// do=while문 : 조건에 상관없이 우선 한번 실행 후 조건이 참이면 계속 실행
		System.out.println("\ndo-while문");
		sum = 0;
		i = 1;
		do { // 우선 한번 실행 후
			sum += i;
			i++;
			System.out.println("i = " + i + ", sum = " + sum);
		} while (i >= endNum); // 조건이 참이면 실행하는데, 조건이 거짓이므로 반복안하고 종료

		// for문 : 반복횟수가 정해져있을때 사용
		System.out.println("\nfor문");
		sum = 0;
		for (i = 1; i <= endNum; i++) {
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		
		// 중첩반복문 : for문 안의 for문
		System.out.println("\n중첩 반복문");
		int result = 0;
		for (i = 2; i <= 9; i++) {
			System.out.println("\n" +  i + " 단");
			for(int j = 1; j <= 9; j++) {
				result = i * j;
				System.out.println(i + " X " + j + " = " + result);
			}
		}

		// break, continue
		System.out.println("\nbreak, continue");
		i = 1;
		sum = 0;
		while (true) { // 무한반복
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
			if (i >= endNum) {
				break; // 종료
				// continue; // 다른것들을 무시하고 다시 while 조건문으로 이동
			}
			i++;
		}
	}

}
