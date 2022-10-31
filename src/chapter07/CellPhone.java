package chapter07;

public abstract class CellPhone extends Phone {

	public CellPhone(String owner) {
		super(owner);
	}
	
	public void hangOn() {
		System.out.println("전화 통화를 시작합니다.");
	}
	public void hangOut() {
		System.out.println("전화 통화를 종료합니다.");
	}
}
