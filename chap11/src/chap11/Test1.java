package chap11;
/*
 * Outer10클래스의 내부 클래스 Inner1, inner2 의 멤버변수 iv,cv의 값 출력되도록
 * 구동 클래스를 완성하시오
 * 
 [결과]
 
Outer10.Inner1.iv:100
Outer10.Inner1.cv:10
Outer10.Inner2.iv:200
Outer10.Inner2.cv:20
*/

class Outer10 {
	class Inner1 {	//인스턴스내부클래스
		int iv = 100;
		static int cv = 10;
	}
  static class Inner2 {	//
		int iv = 200;
		static int cv = 20;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Outer10 o = new Outer10();
		Outer10.Inner1 il =  o.new Inner1();
		Outer10.Inner2 il2 = new Outer10.Inner2();
		System.out.println("Outer10.Inner1.iv:"+il.iv);
		System.out.println("Outer10.Inner1.cv:"+il.cv);
		System.out.println("Outer10.Inner2.iv:"+il2.iv);
		System.out.println("Outer10.Inner2.cv:"+il2.cv);
	}
} 