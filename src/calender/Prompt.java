package calender;

import java.util.Scanner;


public class Prompt {

/**	
 * 
 * @param week 요일
 * @return 0~6 sun~sat
 */
	
	public int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else 
			return 0;
	}
	
	public void rumPrompt() {
		Scanner scanner = new Scanner(System.in);
		calender cal = new calender();
		
		int month = 1;
		int year = 2017;
		int weekday = 0;
		
		while(true) {
			System.out.println("년도 입력해주세요(exit : -1)");
			System.out.print("Year>>");
			year = scanner.nextInt();			
			if(year == -1)
				break;
			
			System.out.println("달을 입력해주세요");
			System.out.print("Month>>");
			month = scanner.nextInt();			
			System.out.println("첫째 날의 요일을 입력하세요.(su, mo, tu, we, th, fr, sa) ");
			String  str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if (month > 12 || month < 1) {
		 		System.out.println("잘못된 입력입니다");
				continue;
			}				
			cal.printCalender(year, month, weekday);
		}
		System.out.println("bye~");		
		scanner.close();
	}
	
	public static void main(String[] args) {
	    //셀 실
		Prompt p = new Prompt();
		p.rumPrompt();
	}
}
