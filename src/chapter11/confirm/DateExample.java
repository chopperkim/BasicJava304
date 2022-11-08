package chapter11.confirm;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
//		"2022-11-07 12:17:32"
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String dateStr = format.format(date);
		System.out.println(dateStr);
		
		// Date -> LocalDate or LocalDateTime으로 사용
		LocalDateTime now = LocalDateTime.now();
		String dateStr2 = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초"));
		System.out.println(dateStr2);
	}
}











