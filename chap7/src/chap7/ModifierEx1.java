package chap7;

import chap7.test.Modifier2;

/*
 * 		제한자(Modifier)
 * 
 * 	접근제한자 : private < (default) < protected < public
 * 				(default) : 접근제한자 구현 안함.
 * 				멤버의 접근 허용 범위를 설정해주는 제한자.
 * 	그외제한자 : static,abstract(추상화),final(상수값 표시할 때)
 */

class Modifier{
	
	private int v1=100;	  //private   접근제한자 설정   : 동일클래스내에서만 접근 허용
	int v2=200;			  //default   접근제한자 	    : 동일패키지내에서만 접근 허용
	protected int v3=v1;  //protected 접근제한자		: 상속된 객체에서만 접근 허용
	public int v4=v2;	  //public 	  접근제한자		: 무조건 접근 허용
	
	public void method() {
		System.out.println("chap7.Modifier 클래스의 method()");
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m = new Modifier();
		//v1 변수는 Modifier클래스내에서만 가능
//		System.out.println("m.v1="+m.v1);
		System.out.println("m.v2="+m.v2);//Modifier,ModifierEx1 같은 패키지에 속해있어서 접근가능
		System.out.println("m.v3="+m.v3);
		System.out.println("m.v4="+m.v4);
		m.method();
		
		Modifier2 m2 = new Modifier2(); //MordifierEx1 클래스와 다른 패키지의 클래스
//		System.out.println("m2.v1="+m2.v1);	//private 접근불가.
//		System.out.println("m2.v2="+m2.v2);	//default는 같은패키지만 접근가능한데, 패키지가 달라서 접근불가.
//		System.out.println("m2.v3="+m2.v3);	//protected 상속관계가 아니여서 접근 불가.
		System.out.println("m2.v4="+m2.v4);	//public이기 때문에 무조건 접근 허용
		System.out.println(m2);	//m2.toString() 호출 Modifier2에 있는 
	}
}
