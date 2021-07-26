package day02_variable;

public class Quiz01 {

	public static void main(String[] args) {

		// 형변환을 이용하여 에러를 해결하세요
		// 크기를 확인하고 왜 그런지도 생각해 보세요.
		byte b = 97;
		short s = 20;
		char c = 'A';
		float f;
		
		//작은 공간에는 큰 값을 넣을 수 없다. 큰 공간에 작은 값을 넣을 수 있다.
		s = b;
		c = (char)b;
		s = (short)c;
		c = (char)s;
		f = (float)5.11;
//		f = 5.11f; 이렇게도 가능.
	}

}
