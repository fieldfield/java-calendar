package calender;

import java.util.Scanner;

public class calender {

	public static void main(String[] args) {
		
//		System.out.println("hello calender");
//		System.out.println("월 화 수 목 금 토");
//		System.out.println(" 1 2 3 4 5 6 7");
//		System.out.println(" 1 2 3 4 5 6 7");
//		System.out.println(" 1 2 3 4 5 6 7");
//	   	System.out.println(" 1 2 3 4 5 6 7");
	
		Scanner scanner = new Scanner(System.in);
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int a;
		
		System.out.println("숫자를 입력해주세요");
		a = scanner.nextInt();
		
		System.out.println(a+ "은 " + month[a-1]+"일입니다 "  );
		
		scanner.close();
	}
}
