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

public class Test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		for(int i=len; i>0; i--) {
			for(int j=1; j<=len-i; j++) {
				System.out.print(" ");
			}
			
		for(int k=1; k<=2*i-len; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
		
}
}
