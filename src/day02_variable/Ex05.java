package day02_variable;

public class Ex05 {

	public static void main(String[] args) {

		// 변수를 상수화 시키면 더이상 변수의 값을 변경할 수 없다.
		final int i = 100;
//		i = 200; 변경할 수 없음.
		System.out.println(i);
		
		// String은 문자 저장
		// 상수화 할 때는 대문자로 작성하는 규칙이 있다.
		// 문자열은 쌍따옴표로 묶어 준다.
		final String KOREA = "대한민국";
//		KOREA= "미국"; 변경할 수 없음.
		System.out.println(KOREA);
		
	}

}
