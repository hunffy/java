package chap4;
	/*
	 * switch(변수) {
	 * 	case 값1 : 문장1
	 * 	case 값2 : 문장2
	 * 	default : 그외문장
	 * }
	 * break : switch 구문에서 빠짐.
	 */
public class SwitchEx1 {
	public static void main(String[] args) {
		int score = 100;
		String grade;
		switch(score/10) {
		case 10 :			//break가 없으니 밑으로 grade="A"를만나고 브레이크  결과는 100=A학점
		case 9 : grade = "A";
				break;		//switch 구문밖으로 제어 이동
		case 8 : grade = "B";
				break;
		case 7 : grade = "C";
				break;
		case 6 : grade = "D";
				break;
		default : grade = "F";	//그 외
		}
		System.out.println(score + "=" + grade + "학점");
	}

}
