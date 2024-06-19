package java_basic;

public class E_array {

	public static void main(String[] args) {
		// 배열 : 연관된 데이터를 모아 관리하기 위해 사용, 변수가 하나의 데이터를 저장한다면 배열은 여러개의 데이터를 저장
		// 배열 생성
		String[] arr1 = { "Java", "C", "Spring" }; // String[]은 arr 배열에 담을 데이터의 타입
		
		String[] arr2 = new String[3]; // 이런식으로도 생성 가능하다. new String[3]은 데이터의 수를 세개로 설정하는것이다. 이 크기 이상으로 데이터를 넣을수는 없다.
		arr2[0] = "Java";
		arr2[1] = "C";
		arr2[2] = "Spring";
		
		// 배열생성 후 for문을 이용하여 데이터 출력
		String[] arr3 = {"A", "B", "C", "D", "E"}; // 배열 arr3 생성
		for(int i = 0; i < arr3.length; i++) { // for문을 사용하여 arr3의 데이터 출력
			String arrData = arr3[i]; // arr3의 i번째 데이터를 arrData변수에 저장
			System.out.println("arr3의 i번째 데이터는 " + arrData); // 출력
		}
	
	}

}
