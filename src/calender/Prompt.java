package calender;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "Cal>";

	public void rumPrompt() {
		Scanner scanner = new Scanner(System.in);
		calender cal = new calender();
		
		int month = -1;
		int year = -1;
		
		while(true) {
			System.out.println("년도 입력해주세요");
			System.out.print("Year>>");
			year = scanner.nextInt();			
	
			System.out.println("달을 입력해주세요");
			System.out.print("Month>>");
			month = scanner.nextInt();			
			if(month == -1) {
				break;
			}
			if (month > 12) {
		 		continue;
			}				
			cal.printCalender(year, month);
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
