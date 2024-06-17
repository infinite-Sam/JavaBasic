package java_basic;

public class C_condition {

	public static void main(String[] args) {
		// 조건문

		// if-else문
		int score = 70;
		if (score >= 80) { // score가 80이상이면
			System.out.println("A등급입니다."); // 출력
		} else if (score >= 60) { // score가 80이상이 아니고 60이상이면
			System.out.println("B등급입니다."); // 출력
		} else { // 아무것도 아니면
			System.out.println("불합격입니다."); // 출력
		}

		// 각각 따로 실행해야되는 경우도 있는데 이때는 if문을 각각 따로 써야됨
		int price = 10000;
		int age = 25;
		int discount = 0;

		if (price >= 10000) {
			discount += 1000;
			price -= discount;
			System.out.println("1만원 이상 구매 시 할인금액 = " + discount); 
		}
		if (age == 25) {
			discount += 1000;
			price -= discount;
			System.out.println("25세가 구매 시 할인금액 = " + discount);
		} else {
			System.out.println("할인 미적용");
		}
		System.out.println("총 금액 = " + price);

		if (price >= 10000 && age == 25) {
			discount += 2000;
			price -= discount;
			System.out.println("25세, 1만원 이상 구매 후 금액 = " + price);
		} else if (price >= 10000) {
			discount += 1000;
			price -= discount;
			System.out.println("1만원 이상 구매 후 금액 = " + price);
		} else {
			discount = 0;
			price -= discount;
			System.out.println("할인 미적용 금액 = " + price);
		}

	}

}
