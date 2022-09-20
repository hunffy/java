package chap5;

/*
 * 1.정수형 배열 10개를 생성
 * 2.각각의 요소의 1~100사이의 임의의 수(난수)를 저장
 * 3.배열의 요소의 합 출력하기.
 */
public class ArrEx2 {
	public static void main(String[] args) {
	int arr[] = new int[10];
	for(int i=0; i<arr.length; i++) {
		arr[i] = (int)(Math.random()*100)+1;
	}
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		sum+=arr[i];
		}
	System.out.println("배열의 요소의 합:" + sum);
	}
}
