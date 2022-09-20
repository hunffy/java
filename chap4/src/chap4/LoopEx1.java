package chap4;

/*
 * 반복문 예제
 * 12345 출력하기
 */
public class LoopEx1 {
	public static void main(String[] args) {
		//1
		System.out.println("반복문 없이 출력");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.println(5);
		
		System.out.println("for 구문으로 출력.");
		/*
		 * 1. int i=1 : 초기값 실행
		 * 2. i<=5 : 조건문. i=1 -> True
		 * 3. System.out.println(1); 실행
		 * 4.i++ i:2
		 * 2.i<=5 : 조건문. i=2 -> True
		 * 3. System.out.println(2); 실행
		 * 4.i++ i:3
		 * 2.i<=5 : 조건문. i=3 -> True
		 * 3. System.out.println(3); 실행
		 * 4.i++ i:4
		 * 2.i<=5 : 조건문. i=4 -> True
		 * 3. System.out.println(4); 실행
		 * 2.i++ i:5
		 * 2.i<=5 : 조건문. i=5 -> True
		 * 3. System.out.println(5); 실행
		 * i++ i:6
		 * 2.i<=5 : 조건문. i=6 -> False
		 */
		for(int i=1; i<=5; i++) {		//정형화된작업을 할때 많이사용
			System.out.println(i);
		}
		System.out.println();
		System.out.println("while 구문으로 출력");
		int i =1;
		while(i<=5) {					//끝을모를때,계속 반복되는작업을할때
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println("do while 구문으로 출력");
		i=1;
		do {							//조건에상관없이 일단 한번실행했으면 좋을때
			System.out.println(i);
			i++;
		} while(i<=5);
		System.out.println();
		
	}

}
