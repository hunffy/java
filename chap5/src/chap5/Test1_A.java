package chap5;

import java.util.Scanner;

/*
 * 강아지와 병아리 개체수의 합과 다리수의 합을 입력받아
 * 강아지,병아리의 각각의 개체수를 출력하는 프로그램 작성하기
 * 
 * [결과]
 * 강아지와 병아리 합
 * 10
 * 강아지와 병아리 다리의 합
 * 30
 * 강아지 5마리, 병아리 5마리
 * 
 * 
 * x : 강아지 마리수
 * y : 병아리 마리수
 * 
 * x + y = 전체 개체수
 * 4x + 2y = 전체 다리수 
 */
public class Test1_A {
	public static void main(String[] args) {
		boolean search = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("강아지와 병아리 합");
		int acnt = scan.nextInt();
		System.out.println("강아지와 병아리 다리의 합");
		int lcnt = scan.nextInt();
		for (int x = 0; x < acnt; x++) {
			for (int y = 0; y < acnt; y++) {
				if (x + y == acnt && (4 * x) + (2 * y) == lcnt) {
					search = true;
					System.out.println("강아지" + x + "마리, " + "병아리" + y + "마리");
				}
			}
		}
	}
}