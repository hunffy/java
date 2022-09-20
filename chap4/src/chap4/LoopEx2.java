package chap4;

/*
 * 반복문을 이용하여 1~10까지 합 구하기
 */
public class LoopEx2 {
	public static void main(String[] args) {
		int sum=0,i=0;
		System.out.println("for 구문");
		//반복문 내부에 실행되는 문장이 한개인 경우 {} 생략 가능
		for(i=1; i<=10; i++)
			sum += i;		//sum += i; => sum= sum+i =>결국 1+2+3+4+....+9+10
		System.out.println("1~10까지의 합:" + sum);
		
		System.out.println("while 구문");
		sum=0; i=1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1~10까지의 합"+sum);
		
		System.out.println("do while구문");
		sum=0;i=1;
		do {
			sum += i;
			i++;
		}while(i<=10);
		System.out.println("1~10까지의 합"+sum);
	}

}
