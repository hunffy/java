package chap11;
/*
 * switch 구문에서 사용가능한 자료형
 * byte,short,int,char,String
 * Byte,Short,Integer,Character
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		Integer d = 0;
		switch(d) {
		default : System.out.println("switch 구문에서 사용되는 자료형");
		
		}
	}
}
/* java.lang 패키지의 클래스 : import 구문 생략 가능
 * 
 * Object 클래스 : 모든 클래스의 최상위 클래스.
 * 		equals 	: 내용비교를 위한 메서드 (오버라이딩 필수)
 * 		hashCode: 내용비교를 위한 메서드 (오버라이딩 필수)
 * 		toString: 객체의 문자열로 표시해 주기 위한 메서드(오버라이딩 필수)
 * 
 * String 클래스 : 문자열 객체. 정적문자열. final 클래스(상속받지못함)
 * 		대입연산자로 객체생성가능. +연산자 가능.
 * 
 * StringBuffer/StringBuilder : 동적문자열-> 객체자체가 바뀐다.
 * 		equals 메서드를 오버라이딩 하지 않았다. 내용비교를 위해서는 String변경 후 비교할수있다.
 * 
 * Math : 수치 계산용 메서드의 집합. 객체생성불가(생성자가 private), final클래스(상속받지 못함)
 * 
 * Wrapper : 8가지 기본자료형을 객체화를 하기 위한 클래스들을 통칭
 * 			기본자료형과 참조자료형으로 형변환 가능.
 * 			Boolean, Byte , Short, Integer , Long , Charater, Float , Double
 */
