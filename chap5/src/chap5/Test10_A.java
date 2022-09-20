package chap5;

import java.util.Scanner;

/*
동전의 종류와 동전의 갯수 지정하여, 지정된 갯수만큼만 동전 변경하기
500,100,50,10,5,1원짜리 동전이 각각 5개씩 있다고 가정할때,
입력된 금액을 동전으로 바꿔주고, 남은 동전을 출력하기

[결과] 
금액을 입력하세요
36000
동전이 부족합니다.

[결과] 
금액을 입력하세요
3010
500원:5
100원:5
50원:0
10원:1
5원:0
1원:0
남은 동전 500원:0개
남은 동전 100원:0개
남은 동전 50원:5개
남은 동전 10원:4개
남은 동전 5원:5개
남은 동전 1원:5개
*/

public class Test10_A {
	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scan.nextInt();
		int maxmoney = 0; 
		//동전의 최대금액 : 환전가능 금액
		for (int i = 0; i < coin.length; i++) {
			maxmoney += coin[i] * cnt[i];
		}
		if (money > maxmoney) {
			System.out.println("동전이 부족합니다.");
			return;  //main 메서드 종료
		} 
		//동전을 바꿔줄수 있는 경우
		for (int i = 0; i < coin.length; i++) { //10 원
		    int coinNum = money / coin[i];  //필요한 동전의 갯수
			if (cnt[i] < coinNum) { //동전의갯수 < 계산된 동전의 갯수 
				coinNum = cnt[i]; //소유하고 있는 동전갯수 
				cnt[i] = 0; //남아있는 동전갯수
			} else { //동전의갯수 > 계산된 동전의 갯수
				cnt[i] -= coinNum; //소유동전갯수-계산동전의갯수
			}
			money -= coinNum * coin[i]; //잔액계산
			System.out.println(coin[i] + "원:" + coinNum);
		  }
		  for (int i = 0; i < coin.length; i++) {
			System.out.println("남은 동전 " + coin[i] + "원:" + cnt[i] + "개");
		  }
	   }
}