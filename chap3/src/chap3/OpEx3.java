package chap3;
/*
 * 산술연산자 : +,-,*,/,%(나머지)
 */
public class OpEx3 {
	public static void main(String[] args) {
		int x=10,y=8;
		System.out.println("10+8=" + (x+y));
		System.out.println("10-8=" + (x-y));
		System.out.println("10*8=" + (x*y));
		System.out.println("10/8=" + (x/y));//1
		System.out.println("10%8=" + (x%y));//2
		//나누기 몫
		System.out.println(10/8); //1
		System.out.println(-10/8);//-1
		System.out.println(10/-8);//-1
		System.out.println(-10/-8);//1
		//나누기 나머지 : 결과의 부호는 피젯수의 부호를 따른다.
		System.out.println(10%8); //2
		System.out.println(-10%8);//-2
		System.out.println(10%-8);//2
		System.out.println(-10%-8);//-2
	}
}