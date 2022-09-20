package chap4;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test4_A {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(); //입력받은수. 121
		int tmp = num;  
		int result = 0; //뒤집은 수 
		while(tmp != 0) { // tmp 121//12 //1
			result *=10;  //  0 //10//120
			result += tmp %10; // result 1 //12//121
			tmp /= 10; // 12 //1 //0
		}
		//num : 입력받은수
		//result : 뒤집은 숫자
		if(num == result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
	}
}