package chap4;

/*
 * 1부터 100까지의 짝수의 합 구하기
 * for
 * while
 * do while
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println("for문");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) sum +=i;
		}
		System.out.println("1부터 100까지의 짝수의 합:"+sum);
		
		System.out.println("while문");
		sum =0;
		int i=0;
		while(i<=100) {
			if(i%2==0)
				sum+=i;
			i++;
		}
		System.out.println("1부터 100까지의 작수의 합:"+sum);
	}
}


