package chap5;
/*
[결과]
  
길이를 홀수로 입력하세요
5

*****
 ***
  *
 ***
*****
  
  
 */

import java.util.Scanner;

public class Test7_A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이를 홀수로 입력하세요");
		int len = scan.nextInt(); // 5
		for (int i = 0; i <= len / 2; i++) { // 0//1//2
			for (int j = 0; j < len - i; j++) { // 0,1,2,3,4//0,1,2,3//0,1,2
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for (int i = len / 2 + 1; i < len; i++) { //3//4
			for (int j = 0; j <= i; j++) {//0,1,2,3//0,1,2,3,4
				if (j >= len - i - 1 && j <= i) //
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}