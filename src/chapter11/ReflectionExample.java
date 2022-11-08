package chapter11;

import java.lang.reflect.Field;

public class ReflectionExample {
	public static void main(StringExample[] args) {
		/*
		 * 
		 */
		try {
			Class class2 = Student.class;
			Class class1 = Class.forName("chapter11.Student");
			Field[] fields = class1.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Student student = new Student();
		Class class3 = student.getClass();
		System.out.println("name: " + class3.getName());
		System.out.println("simple name: " + class3.getSimpleName());
		
	}
}






