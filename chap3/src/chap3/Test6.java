package chap3;

import java.util.Scanner;

//  반지름을 입력받아 원의 둘레와 면적을 구하시오                둘레 2 pi r       면적 pi r r
public class Test6 {
	public static void main(String[] args) {
		System.out.println("반지름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		System.out.println("둘레:"+(2*Math.PI*r)+", 면적:"+(Math.PI*r*r));
	}
}