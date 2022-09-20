package chap6;
/*
 * 클래스 변수 사용
 * static 변수를 이용하여 자동차 serial 번호 설정하기
 * 
 * [결과]
 * 	c1자동차자동차고유번호:1,white:1234(250,150)=> 생산번호:1
	c1자동차자동차고유번호:1,white:1234(250,150)=> 생산번호:2
	c2자동차자동차고유번호:2,red:2345(250,150)=> 생산번호:2
 */
class Car{
	String color;
	int number;
	int sno;
	static int cnt;
	static int width = 250;
	static int height = 150;

public String toString(){
	return "자동차고유번호:" + sno+","+color+":"+number+"("+width+","+height+")"+"=>"+"생산번호:"+sno;
	}
}
public class CarEx1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.number = 1234;
		c1.sno = ++Car.cnt;
		//c1.sno = ++Car.cnt;
		System.out.println("c1자동차"+c1);

		Car c2 = new Car();
		c2.color = "red";
		c2.number = 2345;
		c2.sno = ++Car.cnt;
		//c2.sno = ++c2.cnt;
		System.out.println("c1자동차"+c1.toString());
		System.out.println("c2자동차"+c2);

	}

}
