package chap6;
/*
 * Rectangle3 클래스 구현하기
 *  멤버변수 : width(가로),height(세로), sno(사각형번호),
 *          cnt(사각형의번호를 생성하기위한 static 변수)
 *  생성자 : 가로와 세로를 입력받고, 
 *         가로,세로 값을 초기화, 사각형의번호생성
 *  멤버메서드 : 
 *      int area()   : 넓이 값 리턴
 *      int length() : 둘레 값 리턴
 *      boolean isSquare() : 정사각형 여부 리턴
 *      void info() : 
 *          "1번사각형 :(10,10) 넓이:100, 둘레:40, 정사각형" 문자열을 출력하기
 *          "2번사각형 :(20,10) 넓이:200, 둘레:60, 직사각형" 문자열을 출력하기
 */ 
class Rectangle3 { //기본생성자 제공안됨. 생성자를 구현함.
	int width;
	int height;
	int sno;
	static int cnt; //클래스 변수
	Rectangle3(int w,int h) {   //생성자 
		width = w;
		height = h;
		sno = ++cnt;
	}
	int area() {
		return width * height;
	}
	int length() {
		return 2 * (width+height);
	}
	boolean isSquare() {
		return width == height;
	}
	//1번사각형 :(10,10) 넓이:100, 둘레:40, 정사각형
	void info() {
		System.out.println
		(sno+"번사각형:("+width+","+height+") 넓이:"+area()
		  +", 둘레:"+length()+","+(isSquare()?"정사각형":"직사각형"));
	}
	public String toString() {
		return sno+"번사각형:("+width+","+height+") 넓이:"+area()
		  +", 둘레:"+length()+","+(isSquare()?"정사각형":"직사각형");
	}
}
public class Exam5 {
	public static void main(String[] args) {
		//사각형 클래스 3개를 저장하는 배열 생성하기
		Rectangle3[] arr = new Rectangle3[3];
		arr[0] = new Rectangle3(10,10);
		arr[1] = new Rectangle3(20,10);
		arr[2] = new Rectangle3(20,20);
		for(Rectangle3 r : arr) {
			r.info();
			System.out.println(r);//toString() 메서드
		}
		for(int i=0;i<arr.length;i++) {
			arr[i].info();
			System.out.println(arr[i]); //toString() 메서드
		}
	}
}