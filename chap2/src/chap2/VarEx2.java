package chap2;
/*
 * 특수문자 예제
 * 특수 문자 : 특별한 기능을 가진 문자.
 *           \ 문자를 이용하여 표현  
 */
public class VarEx2 {
   public static void main(String[] args) {
	 //char 자료형의 변수는 작은따옴표(')로 표현함.  
	 //char형 : 한개의 문자만 저장할 수 있는 자료형  
	 char single = '\'' ; // \' : 문자 저장. 
	 System.out.println(single);
	 String dir = "c:\\";  // \\ : \ 문자를 저장
	 System.out.println(dir);
	 // \t : tab 출력
	 // \n : new line 출력. 다음줄 출력
	 System.out.println("안녕\t홍길동\n반갑습니다.");
   }
}