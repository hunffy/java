package chap3;

import java.util.Scanner;

/*
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이 
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=10*20 / 2
 */
public class Test5 {
	public static void main(String[] args) {
	System.out.println("밑변과 높이를 입력하세요");
	Scanner scan = new Scanner(System.in);
		int len1 = scan.nextInt();
		int len2 = scan.nextInt();
	System.out.println("밑변의 길이");
	System.out.println(len1);
	System.out.println("높이의 길이");
	System.out.println(len2);
	System.out.println();
	System.out.print("넓이=" + ((len1*len2)/2));
	}
}