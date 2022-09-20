package chap5;

/*
 * arr 배열의 행의 합, 열의합, 전체합 출력하기
 */
public class Exam5 {
	public static void main(String[] args) {
		int[][] arr = {{1},{10,20},{30,40,5,6,7},{50,60,70}};
		/*
		 * 0행:1
		 * 1행:10+20=30
		 * 2행:30+40+5+6+7=88
		 * 3행:50+60+70=180
		 * 1열:1+10+30+50=91
		 * 2열:20+40+60=120
		 * 3열:5+70=75
		 * 4열:6
		 * 5열:7
		 * 전체합:xxx
		 */
		int maxcol = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxcol <arr[i].length)
				maxcol = arr[i].length;
		}
		int [] colsum = new int[maxcol]; //최대값으로 가져옴
		
		
		int totsum = 0;
		for(int i=0; i<arr.length; i++) { //arr.length=4
			int sum =0;
			for(int j=0; j<arr[i].length; j++) {
				sum +=arr[i][j];//행의합
				colsum[j] +=arr[i][j];//열의합
				totsum += arr[i][j]; //전체합
			}
			System.out.println(i+"행의 합"+sum);
		}
		for(int i=0; i<colsum.length; i++) {
			System.out.println(i + "열의 합" +colsum[i]);
		}
		System.out.println("전체합"+totsum);
	}
}
