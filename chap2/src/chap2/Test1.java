package chap2;

public class Test1 {
	public static void main(String[] args) {
     //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
        char       a='a';   
	    char       b='a';    
	    String     c="a";   
	    String     d="a"; 
	    char       e='a'; 
	    String     f="ab"; 
	    char       g = 0;
	    String     h = ""; 

	    byte   var1 = 127; //-128~127
		short  var2 = 128; 
		long    var3 = 28L;
		long   var4 = 128L;
		float  var5 = 1.2f;  
		double var6 = 1.2; 
	    float var9 = '1';   
	}
}
/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오. C
      변수이름으로 사용할 수 없는 이유를 작성하시오
      A. false		x 예약어는안됨
      B. default 	x 예약어는안됨
      C. _var		O _$특수문자는가능
      D. a-class	X	특수문자불가능 
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.C
    A. s#arp  	X 특수문자사용불가능
    B. static  	X 예약어 사용불가능
    C. _class 	O _는 사용가능
    D. class 	X 예약어는 사용불가능
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
     -128~127
 
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F; 		A
   B. float f2 = 1.0; 
   C. float f3 = '1';  
   D. float f4 = "1";  
   E. float f5 = 1.0d;      
*/
