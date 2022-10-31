package chapter08;

public interface MyInterface {
	
	// 데이터는 저장 불가능
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 모든 메소드가 추상메소드
	// public abstract 생략해준다.
	void turnOn();
	void turnOff();

}
