package chapter05;

public class InputDataArrayExample {
	public static void main(String[] args) {
		byte[] bytes; // 배열 선언
		// 배열에서 리터럴 형식으로 초기화할 때는 선언과 동시에만 가능
//		bytes = {1, 2, 3, 4, 5};
		bytes = new byte[] {1, 2, 3, 4, 5};
		
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] nums = new int[10];
		
		numArr[4] = 100;
		
		nums[6] = 40;
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "]: " + nums[i]);
		}
	}
}
