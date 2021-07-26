package day02_variable;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		String name;
//		int kor, eng, math; 
		int kor, eng, math, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까? ");
		name = input.next();
		System.out.println(name + "님의 국어점수:  ");
		kor = input.nextInt();
		System.out.println(name + "님의 영어점수:  ");
		eng = input.nextInt();
		System.out.println(name + "님의 수학점수:  ");
		math = input.nextInt();
		
		sum = kor + eng + math;
				
 		System.out.println("======================");
		System.out.println("이름 : " + name);
		System.out.println("======================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		System.out.println("======================");
		System.out.println("합 계: " + sum);
//		System.out.println("합계: " + (kor+eng+math)); 또 다른 방법은 괄호안에 넣기.
		System.out.println("======================");
				
	}
}
