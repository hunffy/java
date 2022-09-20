package chap5;

import java.util.Scanner;

/* bynary 뜻 2진법의
 * 10진수를 2진수로 변경하기
 */
public class ArrEx4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int divnum = num,index=0;
		int bynary[] = new int[32];
		while(divnum!=0) {
			bynary[index++] = divnum%2;
			divnum/=2;
		}
		for(int i=index-1; i>=0; i--) {
			System.out.println(num+"의 2진수 값:"+bynary[i]);
		}
		System.out.println();
	}
}
