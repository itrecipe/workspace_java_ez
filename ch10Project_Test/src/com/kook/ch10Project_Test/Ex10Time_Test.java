package com.kook.ch10Project_Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ex10Time_Test {
	//교재에 없는 내용 - 국쌤 추가설명 예제
	public static void main(String[] args) {
		//자바 1.8에서 추가된 time패키지의 클래스들
		LocalDate myobj = LocalDate.now(); //현재 날짜(년,월,일)을 나타내는 객체
		System.out.println(myobj); //2023-01-16
		//LocalDate클래스의 Object에서 상속한 toString()를 재정의(오버라이딩)됨
		//ex)System.out.println(myobj.toString());
		
		LocalTime myobj1 = LocalTime.now(); //현재 시간을 나타내는 객체
		System.out.println(myobj1); //21:49:53.926021400(10억분의 1초까지 표시)
		//LocalTime클래스의 Object에서 상속한 toString()가 재정의 됨
		//ex)System.out.println(myobj1.toString());
		
		LocalDateTime myobj2 = LocalDateTime.now(); //현재 날짜 + 시간을 표시하는 객체
		System.out.println(myobj2); 
		//2023-01-16T21:54:23.247806800 날짜와 시간 사이에 T가 첨가됨
		
		//myDateObj 객체 생성
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting : " + myDateObj);
		
		DateTimeFormatter myformatObj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		
		//형식화 객체를 이용해 날짜시간 객체를 변환
		//SimpleDateFormat과는 달리 날짜객체.format(형변환객체)
		String formattedDate = myDateObj.format(myformatObj);
		System.out.println("After formatting : " + formattedDate);
	}
}