package chap5;

/*
 * 1.정수형 배열 5개를 생성하여 , 
 * 2.1~10사이의 임의수를 5개를 저장하는 배열을 만들기
 * 3.배열의 숫자의 합계,평균 출력하기
 */
public class Exam1 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			System.out.println(arr[i]);
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("배열의 숫자의 합계,평균"+sum+","+(double)(sum/arr.length));
	}

}
