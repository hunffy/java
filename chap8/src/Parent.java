<접근제한자>

1.접근 권한이 다음과 같이 지정되어 있을 경우 문제가 발생하는 문장을 찾으시오.
(숫자가 기술되어 있습니다. 몇 번 문장이 잘못 된 것인지 번호를 기술하시오. 
class Parent {
private int a;
int b; 
protected int c;
public int d;
}
class Child extends Parent {
public Child(int a, int b, int c, int d){
this.a=a; //(1) private은 같은클래스내에서만 접근가능
this.b=b; //(2) 가능 같은패키지내에서만 접근가능.
this.c=c; //(3) 가능
this.d=d; //(4) 가능
}
void func( ){
System.out.println(a); //(5) private은 같은클래스내에서만 접근가능
System.out.println(b); //(6)가능
System.out.println(c); //(7)가능
System.out.println(d); //(8)가능
}
}

<메소드>
2. setVar 메소드를 오버로딩한 메소드의 형태를 2개만 고르시오.
//조건 메서드명이 같고(setVar),매개변수(자료형)가 달라야함
 public class MethodOver { 
   public void setVar (int a, int b, float c) { } 
 } 
(1) private void setVar (int a, float c, int b) {o} 
(2) protected void setVar (int a, int b, float c) {x} 
(3) public int setVar (int a, float c, int b) {return a;} o
(4) public int setVar (int a, int b, float c) {return a;}x 
(5) protected float setVar (int a, int b, float c) {return c;}x 

3. 결과를 예측하시오. // 답(5)
1. public class Test { 
2. int x= 12; 
3. public void method(int x) { //method(int x) 니까 x=12;가 아닌 밑에 구동클래스의 t.method(10) x=10 결국 x= 10+10= 20
4. x+=x; 
5. System.out.println(x); 
6. } 
7. } 
8 class Test1 {
9 public static void main(String[] args) {
10. Test t = new Test(); 
11. t.method(10); 
12 }
13}
(1). 5    (2). 10     (3). 12      (4). 17       (5). 20

4 다음 중 맞는 것을 2개 고르시오.  //답(2),(3)
10. class Foo { 
11. static void alpha() { /* more code here */ } 
12. void beta() { /* more code here */ } 
13. } 
(1). Foo.beta() 문장으로 beta() 메서드 호출이 가능하다. //beta가 인스턴스메서드라서 불가능
(2). Foo.alpha() 문장으로 alpha() 메서드 호출이 가능하다. // 가능 static붙어서
(3). beta() 메서드에서 직접 alpha() 메서드 호출이 가능하다. //인스턴스멤버에서 클래스멤버 호출가능
(4). alpha() 메서드에서 직접 beta() 메서드 호출이 가능하다. //불가능 객체화필요

<생성자>
5. Product 클래스에 생성자를 추가하시오. 
class Product{ 
  String name; 
  int price;
 Product(String name,int price){
	 this.name = name;
	 this.price = price;
 }
 Product(String name){      //문자열,정수형
	 this(name,1000);
 }
 Product(int price){ 
	 this("물",price)
 }
 Product(){
	 this("물",1000)
 }
}
public class ConEx02 { 
  public static void main(String[] args) { 
    Product p1=new Product("웰치스", 700); 
    Product p2 =new Product("커피"); 
    Product p3 =new Product(500); 
    Product p4 =new Product( );  
    System.out.println(p1.name + ", " + p1.price); 
    System.out.println(p2.name + ", " + p2.price); 
    System.out.println(p3.name + ", " + p3.price); 
    System.out.println(p4.name + ", " + p4.price); 
  } 
} 

6 다음은 Thing 클래스를 설계한 것입니다. 
  new Thing()와 같이 기술해서 성공적으로 객체가 생성되는 Thing 클래스를  
  (1)부터  (5) 중에서 고르시오. //(1),(2)
  
(1) public class Thing { } //기본생성자 제공
 
(2) public class Thing {
public Thing() {}
}
 (3) public class Thing { //컴파일 오류->매개변수가없으면 void쓰지않고 아무것도 쓰지않아야함.
public Thing(void) {}
}
 (4) public class Thing { //class는 정상적이지만 new Thing() 생성 불가
public Thing(String s) {}
}
(5) public class Thing {
public void Thing() {}	//생성자는 return타입이 없다. void 빼야함.
public Thing(String s) {}
}

<상속>
7. 접근 권한이 다음과 같이 지정되어 있을 경우 문제가 발생하는 문장찾기.([ ] 안에 숫자가 기술되어 있다. [ ] 몇 번 문장이 잘못 된 것인지 번호를 기술하라. 

class  Parent { 
  private      int  a; 
                   int  b;  
  protected  int  c; 
  public       int  d; 
} 
class Child extends Parent { 
  public Child(int a, int b, int c, int d){ 
     this.a=a;    //[1] 
     this.b=b;    //[2] 
     this.c=c;    //[3] 
     this.d=d;    //[4] 
  } 
  void func( ){ 
    System.out.println(a); //[5] 
    System.out.println(b); //[6] 
    System.out.println(c); //[7] 
    System.out.println(d); //[8] 
  } 
} 

8. 다음 클래스 A의 상속을 받는 서브 클래스에 (1)~(4)와 같이 메서드를 정의할 경우 
컴파일 에러 없이 수행되는 메서드 두 개를 고르시오 //오버로딩,오버라이딩 문제
1. class A {            //답 (1),(3),
2. protected int method1(int a, int b) { return 0; } 
3. } 
(1) public int method1(int a, int b) { return 0; } //정상적인 오버라이딩
(2) private int method1(int a, int b) { return 0; }  //접근제한자가 오류.오버라이딩
(3) private int method1(int a, long b) { return 0; } //정상적인 오버로딩
(4) public short method1(int a, int b) { return 0: } //리턴타입 오류 오버라이딩.
(5) static protected int method1(int a, int b) { return 0; } //static이붙어있음 오류 오버라이딩

9. 다음과 같이 Super의 상속을 받는(확장한)Sub 클래스에 
 보기와 같이 메서드를 정의할 경우 컴파일 에러를 발생시키는 메서드는 어느 것일까요?
 class Super {                         //답 (1),
 public float getNum( ) { return 3.0f; } 
 } 
 public class Sub extends Super { 
 } 
(1) public void getNum( ) { }  // 컴파일오류 발생, 리턴타입이 달라서
(2) public void getNum(double d) { } //이름이같고 매개변수다름->오버로딩됨
(3)public float getNum( ) { return 4.0f; } //접근제한자 같고 리턴타입같고 이름같고 매개변수같고 오버라이딩 잘 됨
(4)public double getNum(float d) { return 4.0d; } //이름같고 매개변수다름 ->오버로딩됨.

10. 클래스 SubEx06에 추가해서 정의할 수 있는 메서드 2개를 고르시오.
			//답 (3),(5)
class X {              
 public X aMethod( ) { return this;}      
}                      
public class SubEx06 extends X { 
  // insert code here                
}  
(1) public  void aMethod( ) {}            //리턴타입 오류            
(2) private void aMethod( ) {}           //접근제한자 오류
(3) public  void aMethod(String s) {}    //오버로딩 됨            
(4) private Y aMethod( ) { return null; }         //접근제한자 오류  
(5) public  X aMethod( ) { return new SubEx06( ); }  //오버라이딩 됨

11.  클래스 SubEx08에 setVar( ) 메서드를 오버라이딩한 것으로 적합한 형태를 2개만 고르시오. 
class BaseClass{  //답 (3),(5)
  private float x= 1.0f; 
  protected void setVar (float f) {x = f;} 
} 
class SubEx08 extends BaseClass { 
  private float x = 2.0f; 
  //insert code here 
} 
(1) void setVar(float f) {x = f;} //접근제한자 default 오류
(2) public void setVar(int f) {x = f;} //매개변수오류
(3) public void setVar(float f) {x = f;} //정상 오버라이딩
(4) public double setVar(float f) {x = f;} //리턴타입오류 void여야함
(5) public final void setVar(float f) {x = f;} //final 나까지만 변경할게. 부모클래스가 final이 안 붙었기때문에 오버라이딩 가능, 자손클래스에 final 가능
(6)  protected float setVar( ) {x=3.0f; return 3.0f; } //매개변수오류 

<추상클래스>
12 다음 예제는 컴파일 에러가 발생합니다. 
성공적으로 컴파일하기 위해서 어떤 부분을 수정해야 하는지 적합한 설명을 3개만 고르시오.
1. public abstract class Test {        
2. public abstract void methodA();
3. public abstract void methodB()
4. { 
5. System.out.printIn("Hello");
6. } 
7. }

(1) methodA 메서드에 body 부분을 추가한다.//탈락
(2) 4 - 6 라인을 semicolon (";")으로 대체한다.//정상
(3) 클래스 Test를 선언할 때 붙인 예약어 abstract를 제거한다. //method A때문에 안됨
(4) 메서드 methodA를 선언할 때 붙인 예약어 abstract를 제거한다. 
(5) 메서드 methodB를 선언할 때 붙인 예약어 abstract를 제거한다. //정상
(6) 1 라인의 abstract class를 interface로 고치고 메서드 methodB를 제거한다.//정상

<인터페이스>
13. 인터페이스 내에 메서드를 적합하게 선언한 형태 2개를 고르시오. 
(1) void methoda(); //(1),(2)
(2) public double methoda();
(3) public final double methoda(); //final 오류 (나를 절대로 오버라이딩하지마)
(4) static void methoda(double d1);//객체를만들어야되는데 static오류, static 쓰려면 구현부가필요하다.
(5) protected void methoda(double d1);//protected 오류 인터페이스의 모든 멤버는 public// 써주면 public 안써주면 (public)

14. 2번째 줄과 동일한 의미를 갖는 문장 3개를 고르시오.//인터페이스문제
1. public interface Foo {  //(1),(2),(3)
2. int k = 4;
3. } //1번,2,3 public static final 생략되어있음. 
(1) final int k = 4;      (2) public int k = 4;
(3) static int k = 4;   (4) abstract int k = 4;//abstract오류 메서드에 붙어야함.
(5) volatile int k = 4; (6) protected int k = 4;
//5번 volatile 오류			protected때문에 오류
15. 다음 프로그램의 수행 결과를 예측하시오.
1. interface Beta {} //답 (3)
2. class Alpha implements Beta { //알파가 베타를 구현.
3. String testIt() {
4. return "Tested";
5. }
6. }
7. public class InterfaceEx01{
8. static Beta getIt() {
9. return new Alpha();
10. }
11. public static void main( String[] args ) {
12. Beta b = getIt();
13. System.out.println( b.testIt() ); //베타타입의 참조변수 b로는 testIt() 호출 불가.컴파일 오류
14. }
15. }
(1) 정상적으로 실행되며 Tested가 출력된다.
(2)정상적으로 실행되나 아무것도 출력되지 않는다.
(3)컴파일 오류가 발생한다. //Beta 타입의 멤버가없다. 
(4)컴파일 오류는 발생하지 않으나 실행시 exception.이 발생한다.

16. 다음 소스를 보고 보기 중 16라인에 추가되면 
java.lang.ClassCastException을 발생시키는 문장을 선택하시오. //답(2)
10. interface Foo {}
11. class Alpha implements Foo { } //알파가 푸를 구현. 알파타입은 푸타입으로 형변환
12. class Beta extends Alpha {} //베타는 알파를 상속. 베타는 알파,푸로 형변환가능.
13. class Delta extends Beta { //델타는 베타를 상속. 델타는 베타,알파,푸로 형변환가능
14. public static void main( String[] args) { 
15. Beta x = new Beta(); //x는 델타빼고 다 참조가능.
16. // insert code here 
17. } 
18. } 
(1). Alpha a = x; //부모타입이기때문에 자동형변환
(2). Foo f= (Delta)x; //x를 형변환하는순간 오류. x(베타객체)를 델타로 형변환 불가능.
(3). Foo f= (Alpha)x; //알파로바꿔서 알파로 구현한 푸로 바꾸는것 가능.
(4). Beta b = (Beta)(Alpha)x; //x는 베타니까 가능.

17. 다음 A 인터페이스를 상속 받아서 새로운 B 인터페이스를 생성하고
자 한다. 다음 보기 중 올바른 문장을 선택하시오. //답(1)
1. public interface A { 
2. String DEFAULT_GREETING = “Hello World”; 
3. public void method1(); 
4. } 
(1). public interface B extends A { } //가능 
(2). public interface B implements A {} //인터페이스 클래스간에 구현안됨.
(3). public interface B instanceOf A {} 
(4). public interface B inheritsFrom A { } 