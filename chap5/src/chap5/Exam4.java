package chap5;

/*
 * arr 배열의 행의 합, 열의합,전체합 출력하기
 * 
 */
public class Exam4 {
	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40},{50,60}};
		/*
		 * 0행: 10+20 = 30
		 * 1행 : 30+40 = 70
		 * 2행 : 50+60 = 110
		 * 0열 : 10+30+50 =90
		 * 1열 : 20+40+60 = 120
		 * 전체합 : 210
		 */
			int[] colsum = new int[2];
			int totsum = 0;
			for(int i=0; i<arr.length; i++) { //i:0 i:1 i:2
				int sum = 0;
				for(int j=0; j<arr[i].length; j++) { //j:0/0<2
					sum +=arr[i][j]; //[0][0],[0][1]//[1][0],[1][1]//[2][0],[2][1]
					colsum[j] +=arr[i][j];//colsum[0]=[0][0],[0][1]//colsum[1]
					totsum += arr[i][j]; //합 [0] +=[0][0],[0][1]//[1][0],[1][1]//[2][0][2][1]
				}
				System.out.println(i+"행의합:"+sum);//0행의합 + 10+20//1행의합 30+40//2행의합:50+60
			}
			for(int i=0; i<colsum.length; i++) { //i=0 0<2 //i:1 1<2
				System.out.println(i+"열의 합:"+colsum[i]); //0열의합:
			}
			System.out.println("전체 합:"+totsum);//10+20+30+40+50+60
		}
		
}