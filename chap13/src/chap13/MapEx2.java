package chap13;

import java.util.TreeMap;

/*
 * TreeMap 예제 : Key 객체로 정렬됨
 */
public class MapEx2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<>(); //key값 Integer value 값 String
		scores.put(87, "홍길동"); scores.put(98, "이몽룡");
		scores.put(75, "임꺽정"); scores.put(94, "김삿갓");
		scores.put(80, "성춘향"); scores.put(88, "향단이");
		
		System.out.println(scores); //75=임꺽정 , 80=성춘향, 87=홍길동, 88=향단이
		System.out.println("첫번째 key :"+scores.firstKey());
		//Map.Entry : (key,value) 쌍인 객체의 자료형
		System.out.println("첫번째 entry :"+scores.firstEntry());
		System.out.println("첫번째 entry key :"+scores.firstEntry().getKey());//75
		System.out.println("첫번째 entry value :"+scores.firstEntry().getValue());//첫엔트리에서 value값 가져오기.임꺽정
		System.out.println("마지막 entry : "+scores.lastEntry());
		
		
		System.out.println("94점 아래점수:");
		System.out.println(scores.lowerEntry(94));
		
		System.out.println("95점 위 점수:");
		System.out.println(scores.higherEntry(95));
		
		System.out.println("95점 아래 점수 95점 포함:");
		System.out.println(scores.floorEntry(95));
		
		System.out.println("95점 위 점수 95점 포함:");
		System.out.println(scores.ceilingEntry(95));
	}
}
