package chapter11;

public class WrapperExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int result = a + b;
		
		Integer aa = new Integer(10);
		Integer bb = new Integer(20);
		Integer result2 = Integer.sum(aa, bb);
		
		String str = "홍길동";
		String str2 = new String("홍길동");
		
		Integer aaa = 10; // 자동으로 박싱 autoboxing
		Integer bbb = 20; // autoboxing
		
		int aaaa = new Integer(10); // autounboxing
		int bbbb = new Integer(20);
		
		Integer obj = new Integer(100);
		int value1 = obj; // autounboxing
		int value2 = obj + 100; // obj를 기본타입으로 바꾸고 + 한뒤 기본타입에 대입
		
		// 실제로 어떻게 써야하나?
		long startTime1 = System.nanoTime();
		int sum1 = 0;
		for (int i = 1; i <= 1_000_000; i++) {
			sum1 += i;
		}
		long endTime1 = System.nanoTime();
		
		System.out.println("걸린 시간: " + (endTime1 - startTime1));
		
		long startTime2 = System.nanoTime();
		Integer sum2 = 0;
		for (Integer i = 1; i <= 1_000_000; i++) {
			sum2 = sum2 + i;
		}
		long endTime2 = System.nanoTime();
		
		System.out.println("걸린 시간: " + (endTime2 - startTime2));

		Integer aaaaa = 10;
		Integer bbbbb = 20;
		if (aaaaa != bbbbb) {
			
		}
	}
}









