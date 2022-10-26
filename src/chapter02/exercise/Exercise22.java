package chapter02.exercise;

public class Exercise22 {
	public static void main(String[] args) {
		// 지구 - 프록시마 센타우리 거리: 40e12km
		// 빛의 속도: 300,000km/s
		// 걸리는 시간 => 거리 / 속도(속력)
		double distance = 40e12;
		double speed = 300_000;
		double time = distance / speed / (60 * 60 * 24 * 365);
		System.out.println(time);
		
	}
}
