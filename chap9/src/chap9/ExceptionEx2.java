package chap9;
/*
 *  다중 catch 구문
 *   - 한개의 try블럭에 여러개의 catch 블럭이 존재
 *   - try블럭내에 발생가능한 예외가 여러개 있는 경우, 예외별로 다른 예외처리를 가능하게 해줌.
 *   - 상위 예외클래스는 catch 구문의 하단에 배치해야 한다.
 *  예외별로 다른메세지를 처리할 때 사용가능.
 *  
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
//		System.out.println(args[0]); // try 구문 밖에서 발생된 예외는 catch 구문을 실행하지 못함
		try {
			System.out.println(args[0]);//args0번지 값이 없기때문에 불러오지못함. ->ArrayIndexOutOfBoundsException 예외 발생 ->해결: run->커맨드라인->args에 직접 값넣기
			System.out.println(10/1);  //ArithmeticException 예외 발생
			String s=null;	//객체 생성 안함.
			System.out.println(s.trim()); //NullPointerException 예외 발생. 전산부로 연락하세요 메세지 출력
		}catch (ArrayIndexOutOfBoundsException e) { //e는 =ArrayIndexOutOfBoundsException 만 참조할수있음.
			System.out.println("command 라인에 값을 입력하세요");
		}catch (ArithmeticException e) {
				System.out.println("0으로 나누지 마세요");
		}catch(Exception e) { //그외 모든 예외 처리.
			System.out.println("전산부로 연락하세요");
			e.printStackTrace();
		}
	}
}


