package chap8;

//인터페이스가 리턴타입으로 사용
class LazerZet implements Printerable {
	@Override
	public void print() {
		System.out.println("레이저 printer로 출력");
	}
}
class InkZet implements Printerable {
	@Override
	public void print() {
		System.out.println("잉크젯 printer로 출력");
	}
}
class PrinterManager {
	public static Printerable getPrinter(String type) {
		if(type.equals("INK")) return new InkZet();
		else return new LazerZet();
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		Printerable a = PrinterManager.getPrinter("INK");
		a.print();
		
		a =  PrinterManager.getPrinter("LAZER");
		a.print();
	}

}
