package chapter05;

public class MainStringArrayArgument {
	public static void main(String[] args) {// String[] args = {10, 20};
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println(num1 + num2);
	}
}
