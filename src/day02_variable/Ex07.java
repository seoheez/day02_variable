package day02_variable;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int age;
		String name;
		System.out.print("이름 입력: ");
		//문자열을 입력받는 기능
		name = input.next();
		System.out.print("나이 입력: ");
		age = input.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		
	}
}
