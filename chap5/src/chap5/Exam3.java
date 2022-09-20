package chap5;


import java.util.Scanner;

/*
 * Command 숫자를 입력받아 자리수의 합을 출력하기
 * 
 * java Exam3 12345
 * 
 * 1+2+3+4+5 = 15
 */
public class Exam3 {
	public static void main(String[] args) {
		if(args.length ==0) {
			System.out.println("command 라인에 숫자를 입력하세요");
			return;
		}
	int sum = 0;
	String nums = args[0];//"12345"
	//'1'=nums.charAt(0): 49 -'0'(48) = 1
	for(int i=0; i<nums.length(); i++) {
		sum += nums.charAt(i) - '0';
		System.out.print(nums.charAt(i)+
				(i==nums.length()-1?"=":"+"));
		
		
	}
	System.out.println(sum);
	}

}
