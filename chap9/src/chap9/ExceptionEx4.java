package chap9;
/*
 * throws : 예외 처리
 * 			예외던지기 : 현재메서드를 호출한 메서드로 예외 전달.
 * 					  호출한 메서드로 예외 발생 전달.
 */
public class ExceptionEx4 {	//3-3)frist()를 호출한 곳에서 예외 try,catch 구문실행해서 숫자만가능합니다 마지막에 출력.
	public static void main(String[] args) {
		try {
			first(); //1
		}catch(Exception e) {
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace();
		}
	}
	private static void first() throws Exception { //3-2)second를 호출한 first() throws Exception first를 호출한 메서드로이동
		System.out.println("first 메서드"); //1
		second();//2
	}
//	throws Exception : 예외가 발생하면 나를 호출한 메서드로 예외 전달.
	private static void second() throws Exception { //3-1)second() throws Exception 를 호출한 메서드로 이동
		System.out.println("second 메서드");//2
		//int < = Integer.parseInt(숫자문자열)
		System.out.println(Integer.parseInt("abc")); //NumberFormatException 발생
	}

}
