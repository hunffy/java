package chap7;

import chap7.test.Modifier2;
/*
 * 접근 제한자
 * 
 * private < (default) < protected < public
 * 같은클래스안< 같은패키지안< 멤버에서만(상속관계)<아무거나 다 가능
 * 
 * 변수,상수,메서드 	: private,(default),protected,public
 * 생성자			: private,(default),protected,public
 * 				  Math 클래스 생성자의 접근 제한자가 private
 * 				  Math 클래스의 모든 멤버는 static.
 * 
 * 클래스			: (dafault),public만 가능.
 * 
 * 				파일명은 public 클래스의 이름과 같아야 한다.
 * 				하나의 파일에는 public 클래스가 한개만 가능하다.
 */

//Modifier3,Modifier2 클래스의 패키지가 다르다.
class Modifier3 extends Modifier2{
	void method() {
//		System.out.println("v1="+v1);//접근제어자가 private이라서 Modifier2 클래스 이외는 접근 불가.
//		System.out.println("v2="+v2);//chap7.test에 속한 클래스에서만 접근허용
		System.out.println("v3="+v3);//Modifier3가 Modifier2 하위클래스(상속관계) 이므로 접근허용
		System.out.println("v4="+v4);//모든 접근을 허용.
	}
}
public class ModifierEx2 {
	public static void main(String[] args) {
		Modifier3 m = new Modifier3();
		m.method();
//		System.out.println(m.v1); //불가능.
//		System.out.println(m.v2); //불가능.
//		System.out.println(m.v3); //불가능.
		System.out.println(m.v4); //가능
//		Math a = new Math();//객체 생성 못하게끔 막음. 생성자 접근제한자가 private
		System.out.println(Math.random());
	}

}