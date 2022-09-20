import java.util.Scanner;

/*
 * 강아지와 병아리 개체수의 합과 다리수의 합을 입력받아
 * 강아지,병아리의 각각의 개체수를 출력하는 프로그램 작성하기
 * 
 * [결과]
 * 강아지와 병아리 합
 * 10
 * 강아지와 병아리 다리의 합
 * 30
 * 강아지 5마리, 병아리 5마리
 * 
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		sum1 = n1 + n2;
		System.out.println("강아지와 병아리 합"+ "\n" + sum1);
		sum2 = ((4*n1) + (2*n2));
		System.out.println("강아지와 병아리 다리의 합" +"\n"+ sum2);
		System.out.println("강아지 "+n1+"마리,"+" 병아리 "+n2+"마리");
	}
}