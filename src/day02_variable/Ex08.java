package day02_variable;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.print("첫번째 값 입력 :");
		n1 = input.next();
		System.out.print("두번째 값 입력 :");
		n2 = input.next();
		System.out.println("첫번째 입력 값: " + n1);
		System.out.println("두번째 입력 값: " + n2);
		//next는 공백을 줄 수 없다. 엔터나 공백을 입력하면 앞에 있는 값 가져옴.
		
		
	}

}
