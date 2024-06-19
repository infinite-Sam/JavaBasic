package java_oop;

class Cal { /*
			 * 변수 i와 j, 메소드 sum과 avg는 연관되어 있는 로직인데, 이 로직을 대표하는 이름을 계산기라는 의미의 Cal이라는 이름으로
			 * 그룹핑하기 위해 class를 선언
			 */
	int i, j;

	public Cal(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public void sum() {
		System.out.println(this.i + this.j);
	}

	public void avg() {
		System.out.println((this.i + this.j) / 2);
	}
}

public class C_oop {

	public static void main(String[] args) {
		/*
		 * 객체지향프로그래밍 : 더 나은 프로그램을 만들기 위해 로직을 상태와 행위로 이루어진 객체로 만드는것
		 * 이 객체들을 레고블럭처럼 조립해서 하나의 프로그램을 만드는것이 객체지향 프로그래밍
		 * 
		 */
		System.out.println("\nC1 결과");
		Cal c1 = new Cal(10, 20); // new를 이용해서 만든 인스턴스를 변수 c1에 저장
		c1.sum();
		c1.avg();
		
		System.out.println("\nC2 결과");
		Cal c2 = new Cal(20, 40);
		c2.sum();
		c2.avg();
		
	}

}
