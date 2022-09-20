package chap4;

import java.util.Scanner;

/*
 * 화면에서 숫자형 문자열을 입력받아서 각 자리수의 합을 구하기
 * 
 * [결과]
 * 숫자를 문자를 입력하세요.
 * 123
 * 6
 * 
 * '0' = 48, '1' =49 '2' = 50
 * [문제해결]
 * for(int i=0; i<len;i++) {
 * ch = str.charAt(0)
 * sum += ch
 * }
 */
public class Exam5 {
	public static void main(String[] args) {
	System.out.println("숫자형 문자열을 입력하세요");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	int sum = 0;
	int len = str.length();
		for(int i=0; i<len; i++) {
		sum += str.charAt(i)-'0';
		}
		System.out.println(str+"의 문자열 숫자의 합:"+sum);
	}
}
