package chap4;

import java.util.Scanner;

/*
 * 한개의 문자를 입력받아서 숫자,대문자,소문자 출력하기
 */
public class IfEx2 {
	public static void main(String[] args) {
	System.out.println("한개의 문자를 입력하세요");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	char ch = str.charAt(0);
	if('0'<=ch && ch<='9') {
		System.out.println(ch+"은 숫자입니다");
	}else if('a'<=ch && ch<='z') {
		System.out.println(ch+"는 소문자입니다.");
	}else if('A'<=ch && ch<='Z') {
		System.out.println(ch+"는 대문자입니다.");
	}else System.out.println(ch+"는 기타 문자입니다.");
	}

}

//대문자와 소문자의 코드 차이는 32임  
// (char)(A+32) = a // (char)(a-32) =A 