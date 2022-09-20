package chap6;

class Rectangle{
	int width;
	int height;
void area() {
	System.out.print("면적:"+width*height);
}
void length() {
	System.out.print("둘레:"+(width+height)*2);
}
}


/*
 * 가로(width),세로(height)의 멤버변수를 가지고 있는 직사각형(Rectangle)클래스 구현하기
 * 멤버메서드는 void area(), void length() 를 가진다.
 */
public class Exam1 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.width = 10;
		r.height = 10;
		r.area();
		r.length();
		
		System.out.println();
		
		Rectangle r2 = new Rectangle();
		r2.width = 5;
		r2.height = 5;
		r2.area();
		r2.length();
	}

}
