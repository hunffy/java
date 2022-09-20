package chap3;

import java.util.Scanner;

/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test3 {
	public static void main(String[] args) {
	System.out.println("점수를 입력하세요");
	Scanner scan = new Scanner(System.in);
	int score = scan.nextInt();
	switch(score/10){
	case 10 :
	case 9 :System.out.println("A학점"); break;
	case 8 :System.out.println("B학점"); break;
	case 7 :System.out.println("C학점"); break;
	case 6 :System.out.println("D학점"); break;
	default :System.out.println("F학점"); break;
		}
	}
}