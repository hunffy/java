package chap11;
/*
 * count 메서드 구현하기
 * int count(문자열소스,찾는 문자열) : 문자열 소스에서 찾는 문자열의 갯수를 리턴
 */
public class Exam2 {
	public static void main(String[] args) {
		
		System.out.println(count("12345AB12AB345AB","12")); //2
		System.out.println(count("12345AB12AB345AB","AB")); //3
		System.out.println(count("12345",("6"))); //0
	}
	static int count(String s1, String s2) {	//main이 static이니까
		//s1 = "12345AB12AB345AB" s2="12"
		//s1 = "12345AB12AB345AB" s2="AB"
		//s1 = "12345" s2="6"
		int cnt=0; //갯수
		int index=0;
		while(true) {
			index = s1.indexOf(s2,index);
			if(index <0) break;
			cnt++;
			index++;
		}
		return cnt; //갯수를 리턴
	}
}
