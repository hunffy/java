package chap4;
/*
 * 1부터 100까지의 수중 2의배수도 아니고, 3의 배수도 아닌 수의 합을 구하기
 * 합계"1633
 */
public class Exam7 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2!=0 && i%3!=0) {
				sum += i;
			}
		}System.out.println("합계:"+sum);
	}
}


