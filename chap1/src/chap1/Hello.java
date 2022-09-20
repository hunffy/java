package chap1;
// 주석(Comment) : 프로그램 실행과 관련이 없는 영역. 컴파일되지 않는 영역
// 프로그램밍언어 -> 번역기(컴파일러)  ->기계어(0,1..):바이트코드
// 한줄 주석. // 이후 영역이 주석
/* ...  여러줄 주석 */

/* 1. java project chap1 프로젝트 생성. => module 생성 안함  
 * 2. src 폴더에 Hello class 생성. => 자바 소스 생성
 * 3. 소스이름 : Hello.java
 *    - public class Hello => 파일의 이름은 반드시 Hello.java여야함.
 *    - 자바는 대소문자 구분함.
 *    - 문장의 끝은 반드시 ;으로 종료함 
 *    - 컴파일 오류발생 : 앞쪽에 빨강색 ⓧ 표시됨. 실행안됨
 * 4. 컴파일 오류가 없는 경우 바이트 코드 생성함.
 *    - 바이트 코드는 확장자가 .class인 파일임
 *    - JVM(자바가상기계)에서 실행되는 기계어  
 *    - bin 폴더에 바이트코드가 생성됨.  
 */
// 클래스 : {    } 
// 메서드 : {    } 
// {   } 갯수가 맞아야 함
public class Hello {
	public static void main(String[] args) { //main 메서드. 프로그램시작
		//System.out.println :콘솔(화면) 출력
		// "문자열" : " " 내부에 내용을 문자열이라함.
		System.out.println("Hello World"); //한줄씩 출력
		// syso=>ctrl+spacebar
		System.out.println("Hello world"); //한줄씩 출력
		System.out.print("Hello world"); //한칸씩 출력
		System.out.print("Hello world"); //한칸씩 출력
	} //main 메서드 종료 
}

class A {
	
}