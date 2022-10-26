package chapter05.confirm;

public class Confirm55 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},	// array[0].length
				{83, 92, 96}, // array[1].length
				{78, 83, 93, 87, 88},	// array[2].length
		};
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = sum / (double) count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
