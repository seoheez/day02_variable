package day02_variable;

import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		
//		사용자에게서 입력 받는 기능 
		int val;
		System.out.println("입력 : ");
		val = System.in.read(); //이걸 사용하기 위해서는 throws~가 필요함.
		System.out.println("입력 data : " + (char)val);
		
		System.in.read();
		System.in.read();
		
		//버퍼에 있는 잔여물을 다 빼줘야 2번째 입력을 할 수 있다.
		System.out.println("2번째 입력 : ");
		val = System.in.read(); 
		System.out.println("입력 data : " + (char)val);
		
		

	
	
	}
}
