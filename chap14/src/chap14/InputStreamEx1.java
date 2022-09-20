package chap14;

import java.io.IOException;
import java.io.InputStream;

/*
 * InputStream 예제
 * InputStream : 바이트형 입력 스트림의 최상단 클래스.
 * 		1.	FileInputStream, DataInputStream, ObjectInputStream.....
 * 		등의 클래스의 부모 클래스임.
 * 		2.	추상클래스임.(객체화는안됨)
 * 		3.	System.in(표준입력스트림)의 자료형임.
 * 		4.  바이트형 입력스트림은 1바이트단위를 읽음
 * 
 * 자바에서 제공하는 표준 입출력스트림 객체
 * 1.	표준 입력스트림 : InputStream System.in => 키보드 입력
 * 2.	표준 출력스트림 : PrintStream System.out => 화면 출력
 * 3.	표준 오류스트림 : PrintStream System.err => 화면 출력(빨간색으로 출력 됨)
 */	
public class InputStreamEx1 {
	public static void main(String[] args) throws IOException { 
		InputStream in = System.in;
		int data = 0;
		//in.read() : 키보드 입력값 읽기
		while((data=in.read()) != -1)//ctrl+z
			System.out.print((char)data);	//	한글출력시 깨짐 -> 바이트형스트림은 1바이트 단위로 읽기때문에..
										 	//	한글은 char(2바이트).. , 숫자와 알파벳은 아스키코드에 속해있기때문에 깨지지않음 
											//	한글과 일본어등등은 유니코드에속해있어서 깨짐!
	}
}
