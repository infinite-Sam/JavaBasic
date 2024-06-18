package java_basic;

public class C_condition {

	public static void main(String[] args) {
		// 조건문
		// if-else문
		int score = 70;
		if (score >= 90) { // score가 90이상이면
			System.out.println("A등급입니다."); // 출력
		} else if (score >= 80) { // score가 80이상, 90미만 이면
			System.out.println("B등급입니다."); // 출력
		} else if (score >= 70) { // score가 70이상, 80미만 이면
			System.out.println("C등급입니다."); // 출력
		} else { // 아무것도 아니면
			System.out.println("D등급입니다."); // 출력
		}

		// 각각 따로 실행해야되는 경우도 있는데 이때는 if문을 각각 따로 써야됨
		char grade;
		score = 90;
		if (score >= 90) {
			grade = 'A';
			System.out.println("등급은 " + grade);
		}
		if (score >= 80) {
			grade = 'B';
			System.out.println("등급은 " + grade);
		}
		if (score >= 70) {
			grade = 'C';
			System.out.println("등급은 " + grade);
		}
		if (score < 70) {
			grade = 'D';
			System.out.println("등급은 " + grade);
		}
		
		// switch문 : if문보다 직관적임, 특정 case와 같은지만 체크 가능
		grade = 'B';
		switch (grade) { // 괄호안의 값(조건)이 case의 값과 같으면 실행, 값만 넣을수 있음
		case 'A':
			System.out.println("점수는 90점 이상입니다.");;
			break; // break문이 없으면 다음 break까지 실행
		case 'B':
			System.out.println("점수는 80점 이상입니다.");;
			break;
		case 'C':
			System.out.println("점수는 70점 이상입니다.");;
			break;
		default: // else와 같음
			System.out.println("점수는 70점 미만입니다.");
		break;
		}
		System.out.println("등급은 " + grade);

		
	}

}













