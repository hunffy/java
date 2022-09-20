package chap8;
/*
 * 인터페이스의 객체화 : 구현클래스로 객체화 가능
 * 					인터페이스 변수 = new 인터페이스() {추상메서드 오버라이딩;}
 * 추상클래스의 객체화 : 하위클래스의 객체로 객체화
 * 					추상클래스 변수 = new 추상클래스() {추상메서드 오버라이딩;}
 */
interface Action{
	void action(); //인터페이스 오버라이딩시 접근제한자는 public
}
abstract class Abs {
	abstract void method(); //접근제한자는 (default)
}
public class InterfaceEx3 {
	public static void main(String[] args) {
		//일회성 객체로 사용됨. =>이름없는 내부 클래스.
		Action a = new Action() { //Action 타입으로만 사용 가능
			public void action() {
				System.out.println("Action인터페이스의 객체 구현");
			}
		};
		a.action();
		Abs ab = new Abs() {
			public void method() { //오버라이딩시 접근제한자는 같거나 넓은 범위가능.( public,protected,default)
				System.out.println("Abs 클래스의 객체 구현");
			}
		};
		ab.method();
	}

}
