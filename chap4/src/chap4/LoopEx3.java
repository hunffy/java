package chap4;

import java.util.Scanner;

/*
 * 화면에서 999숫자가 입력될때까지 숫자를 입력받아 총 입력된 숫자의 합을 출력하기
 * 
 * [결과]
 * 숫자를 입력(종료:999)
 * 1 2 3 4 5 6 999
 */
public class LoopEx3 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;

		while (true) {
			num = scan.nextInt();
			if (num == 999)
				break;
			sum += num;
		}
		System.out.println("합계:" + sum);
	}
}
