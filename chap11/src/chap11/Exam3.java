package chap11;
/*
 * StringBuffer delChar(원본문자열,삭제문자열)
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println
	    (delChar("(1!2@3^4~5)","~!@#$%^&*()"));		//12345 
	System.out.println
	    (delChar("(1!2@3^4~5)","12345"));			//(!@^~)
	}
	static StringBuffer delChar(String str, String del) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(del.indexOf(ch)<0) {
				sb.append(ch);
			}
		}return sb;
	}
}


//i=0 일때 ch = str.charAt(0) ->  str = "(1!2@3^4~5) ->여기서 0번째는 "("
//if(del.indexOf( ) ) -> del에서 (의 index위치는 9번째
// del.indexOf가  9번째 <0  0보다 크기때문에 sb.append()에 의해 추가되지않음!


//i=1 일때 ch = str.charAt(1) ->  str = "(1!2@3^4~5) ->여기서 1번째는 "1"
//if(del.indexOf( ) 1 -> del에서 1의 index위치는 없다! 없을때는 -1
//del.indexOf가  del에 없는값이니 -1 <0  0보다 작기때문에 sb.append(str.charAt(1))에 의해 추가됨!
