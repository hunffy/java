package chap8;
/*
 * jdk8.0 버전 이후에 인터페이스에서 구현부가 있는 메서드가 가능함
 * default 메서드 : 인스턴스 메서드
 * static 메서드  : 클래스 메서드
 */
interface MyInterface1 {
	void method();
	default void method1() { //dafault 메서드. 구현부 존재
		System.out.println("MyInterface1의 default 메서드:method1()");
	}
static void staticMethod() { //static 메서드. 구현부 존재.
	System.out.println("MyInterface1의 static 메서드:staticMethod()");
	}
}

interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 default 메서드:method1()");
	}
static void staticMethod() {
	System.out.println("MyInterface2의 static 메서드:staticMethod()");
	}
}

class Parent {
	public void method() {
		System.out.println("Parent 클래스의 멤버 메서드:method");
	}
}
//MyInterface1,MyInterface2 인터페이스에 같은 default가 존재.
//=> method1() 2개임. => 구현클래스에서 오버라이딩 필요
class Child extends Parent implements MyInterface1,MyInterface2{
	@Override
	public void method1() {
		System.out.println("Child의  메서드:method1()");
		//MyInterface1 메서드 호출
		MyInterface1.super.method1();
	}
	
}
public class InterfaceEx4 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		MyInterface1.staticMethod();
		
	}

}
