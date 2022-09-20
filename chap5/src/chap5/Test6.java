package chap5;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
3
  *  
 *** 
*****

 */

public class Test6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=len-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
		
	}

