package chap6;
/*
 * this 예약어
 * 
 * this() 생성자 : 같은 클래스내에 다른 생성자 호출시 사용
 *               호출하는 생성자에 첫번째 줄에 구현해야함.
 * this 참조변수 : 자기참조변수. 자신의 객체를 참조하는 참조값 저장 변수
 *              클래스멤버에서 사용불가
 *              인스턴스메서드에 지역변수로 자동 설정됨.
 *              지역변수와 멤버변수의 구분시 사용됨.
 */
class Car2 {
	String color;
	int number;
	Car2(String color,int number) {
		System.out.println("(String,int) 생성자");
		this.color = color;
		this.number = number;
	}
	Car2() {
		this("white",1); //다른생성자 호출 (String,int) 생성자 호출됨
		System.out.println("() 생성자");
	}
	Car2(String color) {
		this(color,1);
		System.out.println("(String) 생성자");
	}
	Car2(int number) {
		this("white",number);
		System.out.println("(int) 생성자");
	}
	Car2(Car2 c) {
		this(c.color,c.number);
		System.out.println("(Car2) 생성자");
	}	
	public String toString() {  //인스턴스메서드
		return this.color+":" + this.number;
	}
	static void method() { //클래스멤버에서는 this 사용불가
	//	System.out.println(this);
	}
	void method1() {//인스턴스멤버에서는 this 사용가능
		//this 참조변수는 인스턴스메서드의 지역변수 자동설정
		System.out.println(this);
	}
}
public class ThisEx1 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue",3456);
		Car2 c3 = new Car2("red");
		Car2 c4 = new Car2(5678);
		Car2 c5 = new Car2(c1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}