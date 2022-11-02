package chapter09;

import chapter09.OuterClass.InnerClass;
import chapter09.OuterClass.StaticInnerClass;

public class OuterClassExample {
	public static void main(String[] args) {
//		OuterClass outerClass = new OuterClass();
//		outerClass.name = "새로 저장된 데이터";
//		System.out.println(outerClass.name);
		
		InnerClass innerClass = new OuterClass().new InnerClass();
		System.out.println(innerClass.name);
		
		StaticInnerClass staticInnerClass = new StaticInnerClass();
		System.out.println(staticInnerClass.age);
		
		OuterClass outerClass = new OuterClass();
		outerClass.methodA();
	}
}








