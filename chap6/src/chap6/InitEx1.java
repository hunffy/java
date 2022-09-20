package chap6;
/*
 * 초기화 블럭
 *  static 초기화 블럭 
 *    - 클래스 변수의 초기화
 *    - 클래스 정보 로드될때 한번 실행
 *  
 *  인스턴스 초기화 블럭
 *    - 인스턴스 변수의 초기화. 생성자와 기능 겹침  
 *    - 객체 생성시 생성자 호출전에 먼저 호출됨
 */
public class InitEx1 {
	static int cv; //클래스변수
	int iv;        //인스턴스 변수
	InitEx1() {  //생성자
		System.out.println("5.생성자 호출됨");
	}
	static { //static 초기화 블럭
		cv = (int)(Math.random() * 100); //클래스변수 초기화
		System.out.println("1. 클래스 초기화 블럭 cv=" + cv);
	}
	{ //인스턴스초기화블럭
	   iv = (int)(Math.random() * 100);
		System.out.println("4. 인스턴스 초기화 블럭 iv=" + iv);
	}
	public static void main(String[] args) {
		System.out.println("2.main 메서드 시작");
		System.out.println("3.main 메서드 ie1 객체 생성");
		InitEx1 ie1 = new InitEx1();
		System.out.println("3.main 메서드 ie2 객체 생성");
		InitEx1 ie2 = new InitEx1();
		System.out.println("6.main 메서드 종료");
	}

}