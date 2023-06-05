package com.kook.ch12Projcet_Test;
//feat.경록
import java.util.*;//uitil 안의 모든걸 import.

public class Ex12Quiz_Test {

   public static void main(String[] args) {
      //2. main매서드 안에서 Level객체 myVar 만들고 값은 MEDIUM요 대입한다
      Level myVar = Level.MEDIUM;
      
      //3. myVar객체를 프린트 한다
      System.out.println("//3. myVar객체를 프린트 한다");
      System.out.println("   "+myVar);
      System.out.println();
      
      //4. myVar객체를 파라메터로 하는 switch문을 만든다
      //각case별로 LOW, MEDIUN, HIGH를 출력한다
      System.out.println("//4. myVar객체를 파라메터로 하는 switch문을 만든다\r\n"
            + "//각case별로 LOW, MEDIUN, HIGH를 출력한다");
      switch (myVar) {
      case LOW:
         System.out.println("   "+"LOW");
         break;
      case MEDIUM:
         System.out.println("   "+"MEDIUM");
         break;
      case HIGH:
         System.out.println("   "+"HIGH");
         break;
      default:
         System.out.println("   "+"NOVAR");
         break;
      }
      System.out.println();
      
      //5. enhanced for문을 이용하여 enum Level의 각 상수값을 출력한다
      System.out.println("//5. enhanced for문을 이용하여 enum Level의 각 상수값을 출력한다");
      Level[] myArr = Level.values();
      for (Level str : myArr) {
         System.out.println("   "+str);
      }
      System.out.println();
      
      //6. 대입타입파라레터가 string인 Arraylist객체 cars를 만든 다음 2개 값을 추가 해본다.
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("VolVo");cars.add("SAMSUNG");
      
      //7. 대입파라메터가 string인 Linkedlist객체 cars1을 만든 다음 2개 값을 추가 해본다
      //cars1의 첫번째 요소로 sonata를 추가한뒤에 마지막 요소로 santafe를 추가현다
      //cars1의 첫번째와 마지막 요소를 구해본다
      LinkedList<String> cars1 = new LinkedList<String>();
      cars1.add("sonata");cars1.add("santafe");
      
      System.out.println("//7. 대입파라메터가 string인 Linkedlist객체 cars1을 만든 다음 2개 값을 추가 해본다\r\n"
            + "//   cars1의 첫번째 요소로 sonata를 추가한뒤에 마지막 요소로 santafe를 추가한다\r\n"
            + "//   cars1의 첫번째와 마지막 요소를 구해본다");
      System.out.println("   "+cars1.getFirst());
      System.out.println("   "+cars1.getLast());
      System.out.println();
      
//      8.대입타입파라메더가 string과 Integer인 HashMap객체 people 만들고 2개값을 추가해본다(이름, 나이)
      HashMap<String, Integer> people = new HashMap<String, Integer>();
      people.put("KRL", 27);people.put("LKR", 72);
//      9. enhanced for문을 이용해 key의 Set를 구한 다음 key로 값을 구해서 출력 해본다
      System.out.println("//9. enhanced for문을 이용해 key의 Set를 구한 다음 key로 값을 구해서 출력 해본다");
      for(String string : people.keySet()) {
         System.out.println("   "+string);
      }
      System.out.println();
      
      //10. 대입타입파라메더가 Integer인 Hashset객체 numbers 를 만틀고 2개 값을 추가한다(4와 7)
      // for문을 반복값 i로 1부터 10까지 반복하면서 numbers가 i값을 가지고 있으면 가지고 있음 +i 를 출력하고
      // 없으면 안가지고 있음 + i 를 출력
      
      System.out.println("//10. 대입타입파라메더가 Integer인 Hashset객체 numbers 를 만틀고 2개 값을 추가한다(4와 7)\r\n"
            + "// for문을 반복값 i로 1부터 10까지 반복하면서 numbers가 i값을 가지고 있으면 가지고 있음 +i 를 출력하고\r\n"
            + "// 없으면 안가지고 있음 + i 를 출력");
      
      HashSet<Integer> number = new HashSet<Integer>();
      number.add(4);number.add(7);
      
      for (int i = 1; i < 11; i++) {
         if (number.contains(i)) {
            System.out.println("   "+i+". 가지고 있음"+i);
         }else {
            System.out.println("   "+i+". 안가지고 있음"+i);
         }
      }
      System.out.println();
      
      //11. 6번의 cars객체를 이용한 Iterator개체 it를 만들되 대입타입변수를 이용하여 만든다
      //    it 를 이용해 cars의 요소들를 출력 해본다
      
      System.out.println("//11. 6번의 cars객체를 이용한 Iterator개체 it를 만들되 대입타입변수를 이용하여 만든다\r\n"
            + "//    it 를 이용해 cars의 요소들를 출력 해본다");
      Iterator it = cars.iterator();
      while (it.hasNext()) {
         String str = (String) it.next();
         System.out.println("   "+str);
      }
      System.out.println();
      System.out.println("      그럼 모두 고생하셨습니다!!");
      System.out.println("             끗!");
   }
   
}
//1. 열겨형 Level을 만들고 구성 상수는 LOW, MEDIUM,HIGH로 한다
enum Level {
   LOW,MEDIUM,HIGH
}