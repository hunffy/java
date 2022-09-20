package chap11;
/*
 * String.format 메서드 : 형식화된 문자열 리턴.
 * 						Static 메서드 -> 객체화와 상관없음
 * String.format ("형식화문자를 사용한 문자열",값들,....)
 * 형식화문자 : %d,%c,%s,%f,....		
 * 
 * 
 * 		->System.out.printf() 함수에서 사용하는방법과 동일.	
 */
public class StringEx4 {
	public static void main(String[] args) {
		//%f : 부동소숫점숫자표시. 실수형식출력
		//%.2f : 소숫점2자리만 출력. 소숫점이하 3번째자리에서 반올림 출력
		String sf = String.format("%.2f", 0.142); // 문자열
		System.out.println(sf);//0.14
		
		sf = String.format("%.2f", 0.145);
		System.out.println(sf);//0.15
		
		//%d : 10진 정수 출력
		System.out.println(String.format("%d", 12345));
		System.out.printf("%d\n", 12345);
		
		//%d : 최소 10자리 확보하여 10진정수 출력
		System.out.println(String.format("%10d", 12345));
		System.out.printf("%10d\n", 12345);
		System.out.println(String.format("%3d", 12345)); //5자리출력 12345출력
		
		//%-10d : 최소 10자리 확보하여 10진정수를 좌측정렬 출력
		System.out.println(String.format("%-10d", 12345));
		System.out.printf("%-10d\n", 12345);
		
		//%010d : 최소 10자리 확보하여 10진정수를 빈자리는 0을 채워 출력, -표시못함
		System.out.println(String.format("%010d", 12345));
		System.out.printf("%010d\n", 12345);
		
		//%,10d : 최소 10자리 확보하여 세자리 마다, 표시하여 10진정수를 출력
		System.out.println(String.format("%,10d", 12345));
		System.out.printf("%,10d\n", 12345);
		
		//%,10d : 최소 10자리 확보하여 세자리 마다, 표시하여 좌측정렬하여 10진정수를 출력
				System.out.println(String.format("%-,10d", 12345));
				System.out.printf("%-,10d\n", 12345);
		
		//%X,%x : 16진 정수 출력. X:대문자로표시 x:소문자로표시
		System.out.printf("%X\n", 255); //10진수 255를 16진수로바꿔 ->FF
		System.out.printf("%x\n", 255); //10진수 255를 16진수로바꿔 ->ff
		
		//%o : 8진 정수 출력
		System.out.printf("%o\n",10); //10진수 10은 8진수 12.
		//%s : 문자열출력
		System.out.printf("%s\n","홍길동");
		//%c : 문자출력
		System.out.printf("%c%c%c\n",'홍','길','동');
		
		System.out.printf("%s의 학점은 %c입니다. 점수는 %d입니다.\n",  "홍길동",'A',95);
		
		System.out.println(String.format("%s의 학점은 %c입니다. 점수는 %d입니다.\n",  "홍길동",'A',95));

	}
}
