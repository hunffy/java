package chap5;

public class ArrEx8 {
	public static void main(String[] args) {
		//2차원배열 초기화
		//arr[0] : {10,20} 	arr[0][0],arr[0][1]
		//arr[1] : {30,40}	arr[1][0],arr[1][1]
		//arr[2] : {50,60}	arr[2][0],arr[2][1]
		
		int[][] arr= {{10,20},{30,40},{50,60}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("arr["+i+"]["+j+"]=" + arr[i][j]);
				
			}
		}
		//개선된 for문
		System.out.println("개선된 for 문으로 출력");
		for(int[] ar1 : arr) { //ar1 :{10,20}
			for(int a : ar1) {
				System.out.println(a);
			}
		}
		

	}
}
