package chap6;

import java.util.Scanner;

/*
삼각형의 높이를 입력받아, 다음과 같은 역 직각삼각형을 출력하기 

[결과] 
삼각형의 높이를 입력하세요
5
15 14 13 12 11
  10  9  8  7
      6  5  4
         3  2
            1
*/
public class Test1 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int hei = scan.nextInt();
		for(int i=1; i<=hei; i++) {
			for(int j=1; j<=hei; j++) {
				if(i<=j) System.out.print("+");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}