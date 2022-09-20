package chap6;
/*
 * 원(Circle2) 클래스 구현하기
 *  1. 멤버변수
 *       반지름(r),x좌표(x),y좌표(y), 원의번호(no)
 *       원의번호 생성 변수 count
 *  2. 생성자 : 구동 클래스에 맞도록 설정하기     
 *  3. 멤버메서드
 *     (1) double area()  : 원의 넓이 리턴. Math.PI 상수 사용
 *     (2) double length(): 원의 둘레 리턴. Math.PI 상수 사용
 *     (3) void move(int a, int b): x,y좌표를 x+a, y+b로 이동.
 *     (4) void scale(double m): 반지름을 m배 확대/축소. r=r*m
 *     (5) String toString() :
 *         1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
 *         ... */
class Circle2 {
	double r;    //반지름
	int x,y;  //좌표
	int no;   //원의번호
	static int count; //원의번호 생성
	Circle2(double r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		no = ++count;
	}
	Circle2(int x, int y) {
		this(1,x,y);
	}
	Circle2(double r) {
		this(r,0,0);
	}
	double area() {
		return r*r*Math.PI;
	}
	double length() {
		return 2*r*Math.PI;
	}
	void move(int a, int b) {
		this.x += a;
		this.y += b;
	}
	void scale(double m) {
//		r *= m;
		r = r * m;
	}
	//1번원 : 반지름:10, 좌표:(10,10), 넓이:314.xxx, 둘레:xxx.xxx
	public String toString() {
//		return no+"번원 : 반지름:"+r+", 좌표:("+x+","+y+"), 넓이:"+area()
//		     +", 둘레:"+length();
		//String.format() : 문자열에서 서식문자 사용함수
		//System.out.printf() 함수의 사용방법과 동일
		return String.format
		("%d번원:반지름:%.0f,좌표(%d,%d),넓이:%.2f,둘레:%.2f"
				,no,r,x,y,area(),length());
	}
}
public class Exam6 {
	public static void main(String[] args) {
		Circle2[] carr=new Circle2[3];
		//carr[0] :Circle2 타입의 참조변수 
		carr[0] = new Circle2(10,10,10); //반지름 : 10, (10,10) 좌표
		carr[1] = new Circle2(20,20);    //반지름 : 1, (20,20) 좌표
		carr[2] = new Circle2(100);      //반지름 : 100, (0,0) 좌표
		for(Circle2 a : carr) {
			System.out.println(a);
			a.move(10,10);
			System.out.println(a);
			a.scale(3);
			System.out.println(a);
		}
		System.out.println("기존 for 구문");
		for(int i=0;i<carr.length;i++) {
			System.out.println(carr[i]);
			carr[i].move(10,10);
			System.out.println(carr[i]);
			carr[i].scale(3);
			System.out.println(carr[i]);
		}
	}
}