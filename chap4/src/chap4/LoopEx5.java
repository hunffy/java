package chap4;

/*
 * break 	: switch,반복문에서 블럭 밖으로 제어 이동.
 * continue : 반복문에서 블럭의 끝(처음)으로 제어 이동. 반복문의 끝은 닫히는 중괄호-> 다시처음으로가기때문에 끝(처음)	
 */
public class LoopEx5 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			System.out.println("\n"+i+"단");
			for(int j=2; j<=9; j++) {
				if(j==5) break;//break가 속한 반복문의 밖으로 제어 이동
//				if(j==5) continue; //continue가 속한 반복문의 처음으로 제어 이동
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}

	}

}
