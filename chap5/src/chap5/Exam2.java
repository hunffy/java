package chap5;

import java.util.Scanner;

/*
 * 10진수를 입력받아 8진수로 변경하여 출력하기
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int octa[] = new int[32];
		int divnum = num;
		int index = 0;
		while (divnum != 0) {
			octa[index++] = divnum % 8;
			divnum /= 8;
		}
		for(int i= index-1; i>=0; i--) {
			System.out.println(num+"의 8진수"+octa[i]);
		}
		System.out.println();
	}
}
