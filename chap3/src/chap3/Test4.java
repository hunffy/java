package chap3;

import java.util.Scanner;

/*
 *  화면에서 두수를 입력받아서 더큰수를 출력하기 
 */
public class Test4 {
	public static void main(String[] args) {
	System.out.println("두 수를 입력하세요");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int n2 = scan.nextInt();
	System.out.println(n>n2?n:n2);
	}
}
