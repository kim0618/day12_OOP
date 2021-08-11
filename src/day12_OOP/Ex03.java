package day12_OOP;

import java.io.IOException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("윈도우 실행 명령어 입력");
		String s = input.next();
		ProcessBuilder pro = new ProcessBuilder(s);	// 프로세스에서 값을 가져옴
												// 윈도우시스템을 실행가능한 것 해주는거
		
		try {
			pro.start();	// 준비시켜주는거 시작해줏는거
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
