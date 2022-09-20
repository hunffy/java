package chap3;
/*
 * 비트 연산자 : &(AND),|(OR),~(not),^(XOR)
 */
public class OpEx5 {
	public static void main(String[] args) {
		System.out.println(6 & 3);
		/*
		 * 6 : 00000110
		 * 3 : 00000011
		 * & : 00000010 => 2
		 */
		System.out.println(6 | 3);
		/*
		 * 6 : 00000110
		 * 3 : 00000011
		 * | : 00000111 => 7
		 */
		System.out.println(6 ^ 3);
		/*
		 * XOR:배타적 OR. 두개값이 다른경우 True(1),같은경우 False(0)
		 * 6 : 00000110
		 * 3 : 00000011
		 * ^ : 00000101 => 5
		 */
		System.out.println(~10); //-11
		/*
		 * ~ : not : 0->1,1->0 
		 * 10 : 00001010 
		 * ~  : 11110101  => 음수. 2의보수로 표현. -11의 표현
		 * 
		 * 2의보수 : 1의보수 + 1
		 * 보수의 보수 원래 숫자.
		 * 11110101 => 11 2의 보수 => -11
		 * 
		 *       11110101
		 *1의보수  00001010
		 *2의보수         1
		 *       00001011 => 11  
		 */
		System.out.println(true&false); //false
	}
}