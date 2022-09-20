package chap4;


import java.util.Scanner;

/*
 * 1.삼각형의 높이를 입력받아서 *로 삼각형 출력하기
 * [결과]
 	삼각형의 높이:3
 	
  	*
  	**
  	***
  	
  	2. 삼각형의 높이를 입력받아서 *로 역삼각형 출력하기
  	
  	[결과]
  	***
  	**
  	*
  	
  	3.				i	j
  			 *		5	5	=> * i<=j
  			**		4	4	5
  		   ***		3	3	4	5
  		  ****		2	2	3	4	5
  		 *****		1	1	2	3	4	5
  		
  	
  	4.				i		j				=>
  	*****			1		1	2	3	4	5
  	 ****			2		2	3	4	5
  	  ***			3		4	5
  	   **			4		4	5
  	    *			5		5
  				
  				
  				
  				
 */
public class Exam8 {
	public static void main(String[] args) {
	System.out.println("삼각형의 높이를 입력해주세요");
	Scanner scan = new Scanner(System.in);
	int len = scan.nextInt();
	for(int i=1; i<=len; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("2번");
	for(int i=len; i>0; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	System.out.println("3");
	for(int i=len; i>=1; i--) {
		for(int j=1; j<=len; j++) {
			if(j>=i) System.out.print("*");
			else System.out.print(" ");
		}System.out.println();
	}
		
		
	System.out.println("4");
	for(int i=1; i<=len; i++) {
		for(int j=1; j<=len; j++) {
			if(j>=i) System.out.print("*");
			else System.out.print(" ");
		} System.out.println();
	}
	}
}

