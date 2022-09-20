package chap5;

import java.util.Scanner;

/*
 * 1 ~ 100사이의 임의의 값을 시스템이 저장하고, 사용자는 숫자를 입력받아 
 * 저장된 숫자를 맞추는 프로그램 작성하기
[결과]
1과100사이의 값을 입력 : 50
더작은수를 입력하세요
1과100사이의 값을 입력 : 25
더작은수를 입력하세요
1과100사이의 값을 입력 : 10
더큰수를 입력하세요
1과100사이의 값을 입력 : 15
더큰수를 입력하세요
1과100사이의 값을 입력 : 20
더작은수를 입력하세요
1과100사이의 값을 입력 : 18
더작은수를 입력하세요
1과100사이의 값을 입력 : 17
맞췄습니다.
시도 횟수는 7입니다.
 */

public class Test4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int num = (int) (Math.random() * 100) + 1;
		while (true) {
			int n1 = scan.nextInt();
			if (n1 < num) {
				System.out.println("더 큰수를 입력하세요");
			}
			if (n1 > num) {
				System.out.println("더 작은수를 입력하세요");
			}
			if (n1 == num) {
				System.out.println("맞췄습니다. \n 시도 횟수는" + i + "입니다");
			}
			i++;
		}
	}
}
