package chap12;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아 해당월의 달력을 출력하기
 * 
[결과]
년도와 월를 입력하세요
2022 09
	2022년 9월
  일 월  화 수  목 금 토
              1  2  3
  4  5  6  7  8  9 10
 11 12 13 14 15 16 17
 18 19 20 21 22 23 24
 25 26 27 28 29 30
*/
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월를 입력하세요");
		String week = " 일 월 화 수 목 금 토";
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		System.out.println("   "+year+"년 "+mon+"월");
		System.out.print(week);
		cal.set(year, mon-1,1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		int weeek = cal.get(Calendar.DAY_OF_WEEK);
		for(int i=1; i<weeek; i++) {
			System.out.print("  ");
		}
		for(int i=1; i<=lastday; i++) {
			System.out.println((i<10)?"  "+1:"  "+i);
			if(weeek==0) {
				System.out.println();
				weeek++;
			}
			System.out.println("\n===============");
		}
	}
}