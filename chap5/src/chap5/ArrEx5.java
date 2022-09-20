package chap5;

import java.util.Scanner;

/*
 * 10진수를 16진수로 변경하기
 * 					  		10 	11	12	13	14	15	
 * 0 1 2 3 4 5 6 7 8 9 		A 	B 	C 	D 	E 	F
 */
public class ArrEx5 {
	public static void main(String[] args) {
		String nums= "0123456789ABCDEF";
		char[] numarr = nums.toCharArray(); 
		//toCharArray():문자열(문자여러개)을 char타입 배열로 변환해주는 함수
		//numarr = {'0','1','2','3','4','5','6'...'A','B','C','D','E','F'}
		char[] hexa = new char[10];
		System.out.println("10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //10
		int divnum = num,index=0;
		while(divnum !=0) { //10
			//10 = 10%16 -> numarr[10]번째 자리에있는 'A'를 hexa[A]
			hexa[index++] = numarr[divnum%16];
			divnum /=16; 
			
		}
		System.out.println(num+"의 16진수:");
		for(int i=index -1; i>=0;i--) {
			System.out.print(hexa[i]);
		}
		System.out.println();
	}
}
