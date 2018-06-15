package calender;

public class calender {

	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public boolean isLeapYear(int year) {
		if (year % 4==0 && (year % 100 != 0  || year % 400 == 0)){
		return true;	
		}
		return false;
	}
	
	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];	
		}else {
			return MAX_DAYS[month-1];
	}
	}
	
/*
	
	- 월을 입력하면 해당월의 달력을 출력한다.
	- 달력의 모양은 1단계에서 작성한 모양으로 한다.
	- 1일은 일요일로 정해도 무방하다.
	- -1을 입력받기 전까지 반복 입력한다.
	- 프롬프트를 출력한다.
	
	- 1일의 요일을 입력받는다.
 	- 출력한다.
*/	
	
	
	public void printCalender(int year, int month, int weekday) {
		System.out.printf("<<%4d년%3d월>>\n", year, month);
		System.out.println("su mo tu  we  th fr sa");
		
		//print blank space
		for(int i=0; i< weekday; i++) {
			System.out.print("   ");
		}
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int count = 7- weekday;
		int delim = (count< 7) ? count : 0;
		
		//print fist line
		for(int i =1; i <= count; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		for(int i = count+1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i % 7 ==  delim) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
	
}

