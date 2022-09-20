import java.util.Scanner;

/*
 * 1 ~ 100사이의 임의의 값을 시스템이 저장하고, 사용자는 숫자를 입력받아 
 * 저장된 숫자를 맞추는 프로그램 작성하기
[결과]
1과100사이의 값을 입력 : 50
더작은수를 입력하세요
1과100사이의 값을 입력 : 25
더작은수를 입력하세요
1과100사이의 값을 입력 : 10
더큰수를 입력하세요
1과100사이의 값을 입력 : 15
더큰수를 입력하세요
1과100사이의 값을 입력 : 20
더작은수를 입력하세요
1과100사이의 값을 입력 : 18
더작은수를 입력하세요
1과100사이의 값을 입력 : 17
맞췄습니다.
시도 횟수는 7입니다.
 */

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = (int)(Math.random()*100)+1;
		int i = 0;
		System.out.println("숫자를 입력하세요");
		while(true) {
			int n1 = scan.nextInt();
			
				if(n1==num1) {
				System.out.println("맞췄습니다."+"\n"+"시도 횟수는 "+(i+1)+"입니다");
				break;
				}
				if(n1>num1) {
					System.out.println("더작은수를 입력하세요.");
				}else {
					System.out.println("더큰수를 입력하세요.");	
				}
				i++;
			} 
		
		}
		
	}

