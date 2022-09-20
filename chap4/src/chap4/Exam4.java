package chap4;

import java.util.Scanner;

/*
 * 화면에서 자연수(양수인정수)를 입력받아서 각 자리수의 합을 구하기
 * 
 * 자연수를 입력
 * 123
 * 
 * 출력:6
 * 
 * sum
 * 123 => 123 % 10 => sum +=3
 * 123/10 => 12%10 => sum += 2
 * 12/10 => 1%10 => sum += 1
 * 1/10 => 0  반복종료
 */
public class Exam4 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		int temp = num;
		
		while(temp>0) {
			sum+=temp%10;
			temp /= 10;
		}
		System.out.println(num+"의 각 자리수의 합:"+sum);
	}
}
