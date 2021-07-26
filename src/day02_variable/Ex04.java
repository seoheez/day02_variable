package day02_variable;

public class Ex04 {

	public static void main(String[] args) {
		//A는 65
		char ch = 'A';
		int num = 5, ret; //둘 다 int형태라서 한 줄로 작성.
//		int num = 5;
//		int ret;  과 같은 것.
		
		ret = ch + num;
		System.out.println("ret = " + ret);
		System.out.println("ret = " + (char)ret);
		
	}

}
