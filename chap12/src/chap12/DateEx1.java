package chap12;
/* Date 클래스 : 날짜,시간 표현하는 클래스. 현재일시객체 생성.
 * SimpleDateFormat 클래스 : Date 객체를 형식화된 문자열로 변경
 * 	String format(Date객체) : Date객체를 형식화된 문자열로 리턴
 * 	Date parse(형식화된 문자열객체)	: 형식화된 문자열객체를 Date로 리턴
 * 								ParseException 예외처리 필수
 * 
 * 날짜 format에 사용되는 문자
 *  yyyy : 년도 4자리
 *  MM   : 월을 2자리
 *  dd   : 일을 2자리
 *  HH   : 시간을 2자리
 *  mm   : 분을 2자리
 *  ss   : 초를 2자리
 *  E    : 요일
 *  a    : 오전/오후
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; //날짜+시간표현

public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date(); // 현재일시
		System.out.println(now);
		// java.text.SimpleDateFormat: 날짜 출력시 형식에 맞도록 설정
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH시 mm분 ss초 E a");
		System.out.println(sf.format(now));
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf2.format(now));
		String dateStr = "2022-09-13";
		Date date = null;
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sf3.parse(dateStr);// 형식화된 문자열(yyyy-MM-dd)을 parse를 이용하여 Date객체로 리턴
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date);
		System.out.println(sf2.format(date));

		// dateStr 날짜의 요일만 출력하기
		System.out.println(dateStr + "=>" + new SimpleDateFormat("E요일").format(date));
	}
}
