package chap12;

import java.util.Calendar;

/*
 * Calendar 클래스
 *  추상클래스임 
 *    1. 추상메서드를 멤버로 가질수있다.
 *    2. 객체화 불가. new Calendar()형식으로는 객체화 안됨.->오류
 *  getInstance() static 메서드를 통해서 객체 전달   
 */
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();	//현재일시
		System.out.println(now);
		//get(상수값) : 지정된 상수값에 맞는 값을 리턴
		System.out.println("년도:" + now.get(Calendar.YEAR)); //년도
		System.out.println("월(0 ~ 11):"
						+ (now.get(Calendar.MONTH) + 1));//월(0부터시작)
		
		System.out.println("일:" + now.get(Calendar.DATE));//일
		System.out.println("일:" + now.get(Calendar.DAY_OF_MONTH));//그 달의 몇번째일
		System.out.println("년도기준일자:" + now.get(Calendar.DAY_OF_YEAR));//그 해의 몇번째일
		System.out.println("요일(1:일~7:토):"
		         + now.get(Calendar.DAY_OF_WEEK));//요일(1~7) 1:일요일
		System.out.println("월기준 몇째주:" + now.get(Calendar.WEEK_OF_MONTH)); //그달의 몇번째 주
		System.out.println("년기준 몇째주:" + now.get(Calendar.WEEK_OF_YEAR));//1월1일부터 지금 몇번째 주
		System.out.println("월기준 몇째요일:" 
		     + now.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //그 달의 몇번째 요일
		System.out.println("오전0/오후1:" + now.get(Calendar.AM_PM));//오전/오후
		System.out.println("시간(0~11):" + now.get(Calendar.HOUR));
		System.out.println("시간(0~23):" + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):" + now.get(Calendar.MINUTE));
		System.out.println("초(0~59):" + now.get(Calendar.SECOND));
		System.out.println("밀리초(0~999):" + now.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(밀리초):" + now.get(Calendar.ZONE_OFFSET));
		System.out.println("TimeZone(시간):" 
		   + (now.get(Calendar.ZONE_OFFSET))/(1000*60*60));
		System.out.println("이번달의 마지막일자:" 
		           + now.getActualMaximum(Calendar.DATE));
		
	}
}
