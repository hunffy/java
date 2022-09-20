package chap8;
/*
구동 클래스 실행시 다음의 결과가 나오도록 
DataAccessObject 인터페이스와 OracleDao,MySqlDao 클래스를 구현하기.

[결과]
Oracle DB에서 검색
Oracle DB에 삽입
Oracle DB에 수정
Oracle DB에서 삭제
Mysql DB에서 검색
Mysql DB에 삽입
Mysql DB에 수정
Mysql DB에서 삭제 
 */
public class Test2 {
	public static void main(String[] args) {
	      dbWork(new OracleDao());
	      dbWork(new MySqlDao());
	}
   private static void dbWork(DataAccessObject dao) {
         dao.select(); //DataAccessObject 내부에 추상메서드로 가지고있어야한다
         dao.insert();//DataAccessObject 내부에 추상메서드로 가지고있어야한다
         dao.update();//DataAccessObject 내부에 추상메서드로 가지고있어야한다
         dao.delete();//DataAccessObject 내부에 추상메서드로 가지고있어야한다
   }
}