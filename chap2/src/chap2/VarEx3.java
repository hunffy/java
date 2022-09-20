package chap2;
/*
 * 형변환 예제
 * 1. 기본자료형과 참조자료형 사이의 형변환 불가 (Wrapper 클래스 예외)
 * 2. 기본자료형 중 boolean을 제외한 7개의 자료형은 서로 형변환 가능함.
 * 3. 자동형변환 : 형변환 연산자 생략 가능
 *    명시적형변환 : 형변환 연산자 생략 불가
 *    ----> 자동형변환 : 작은자료형에서 큰자료형으로 변환
 *    <---- 명시적형변환 : 큰자료형에서 작은자료형으로 변환
 *    byte(1) short(2) int(4) long(8) float(4) double(8)
 *            char(2)
 */
public class VarEx3 {
	public static void main(String[] args) {
		String str = "abc";  //문자열(문자 여러개) 객체. 참조형
		char c = 'd';        //문자(문자한개) 변수   기본형
//		String s1 = c;       //참조형 <- 기본형 불가
//		char c1 = str;       //기본형 <- 참조형 불가
		byte b1 = 10;
		short s1 = 100;
		//자동형변환 : 형변환 연산자 생략 가능
		short s2 = (short)b1;//short <- byte 
		int i1 = (int)s2;         //int <- short
		float f1 = (float)i1;       //float <- int 
		System.out.println("f1="+f1);  //10.0
		//명시적 형변환 : 형변환 연산자 생략 불가
		short s3 = (short)f1;  // short <- float
		char c1 = (char)s1;    // char <- short/byte
		//s1=100
		// a:97,b:98,c:99,d:100
		// A:65
		System.out.println("c1="+c1 ); //d
		System.out.println("100="+(char)100 ); //d
		
		//리터널값
		long l1 = (long)1000;
		long l2 = 1000L;  //long형 리터널
		int i2 = (int)1000;
		int i3 = 1000;   // int형 리터널
		float f2 = (float)10.5; //실수형 리터널의 기본형은 double임 
		float f3 = 10.5f; //10.5F float형 리터널
		double d1 = 10.5;
		double d2 = 10d;
		/*
		 * 리터널에 사용되는 접미사
		 * L,l : long 형 리터널
		 * F,f : float형 리터널
		 * D,d : double형 리터널, 실수형 기본값
		 */
	}

}