package chap4;
/*
 * 구구단을 가로로 출력
 */
public class Exam6 {
	public static void main(String[] args) {
		/*
		 * 블럭 : {}
		 * 지역변수 : 블럭내부에서 선언된 변수
		 */
		for(int k=2; k<=9; k++) {
			System.out.print(k+"단\t");
		}
		System.out.println();
		for(int j=2; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}
