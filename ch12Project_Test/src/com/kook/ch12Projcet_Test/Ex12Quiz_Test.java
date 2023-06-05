package com.kook.ch12Projcet_Test;
//feat.���
import java.util.*;//uitil ���� ���� import.

public class Ex12Quiz_Test {

   public static void main(String[] args) {
      //2. main�ż��� �ȿ��� Level��ü myVar ����� ���� MEDIUM�� �����Ѵ�
      Level myVar = Level.MEDIUM;
      
      //3. myVar��ü�� ����Ʈ �Ѵ�
      System.out.println("//3. myVar��ü�� ����Ʈ �Ѵ�");
      System.out.println("   "+myVar);
      System.out.println();
      
      //4. myVar��ü�� �Ķ���ͷ� �ϴ� switch���� �����
      //��case���� LOW, MEDIUN, HIGH�� ����Ѵ�
      System.out.println("//4. myVar��ü�� �Ķ���ͷ� �ϴ� switch���� �����\r\n"
            + "//��case���� LOW, MEDIUN, HIGH�� ����Ѵ�");
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
      
      //5. enhanced for���� �̿��Ͽ� enum Level�� �� ������� ����Ѵ�
      System.out.println("//5. enhanced for���� �̿��Ͽ� enum Level�� �� ������� ����Ѵ�");
      Level[] myArr = Level.values();
      for (Level str : myArr) {
         System.out.println("   "+str);
      }
      System.out.println();
      
      //6. ����Ÿ���Ķ��Ͱ� string�� Arraylist��ü cars�� ���� ���� 2�� ���� �߰� �غ���.
      ArrayList<String> cars = new ArrayList<String>();
      cars.add("VolVo");cars.add("SAMSUNG");
      
      //7. �����Ķ���Ͱ� string�� Linkedlist��ü cars1�� ���� ���� 2�� ���� �߰� �غ���
      //cars1�� ù��° ��ҷ� sonata�� �߰��ѵڿ� ������ ��ҷ� santafe�� �߰�����
      //cars1�� ù��°�� ������ ��Ҹ� ���غ���
      LinkedList<String> cars1 = new LinkedList<String>();
      cars1.add("sonata");cars1.add("santafe");
      
      System.out.println("//7. �����Ķ���Ͱ� string�� Linkedlist��ü cars1�� ���� ���� 2�� ���� �߰� �غ���\r\n"
            + "//   cars1�� ù��° ��ҷ� sonata�� �߰��ѵڿ� ������ ��ҷ� santafe�� �߰��Ѵ�\r\n"
            + "//   cars1�� ù��°�� ������ ��Ҹ� ���غ���");
      System.out.println("   "+cars1.getFirst());
      System.out.println("   "+cars1.getLast());
      System.out.println();
      
//      8.����Ÿ���Ķ�޴��� string�� Integer�� HashMap��ü people ����� 2������ �߰��غ���(�̸�, ����)
      HashMap<String, Integer> people = new HashMap<String, Integer>();
      people.put("KRL", 27);people.put("LKR", 72);
//      9. enhanced for���� �̿��� key�� Set�� ���� ���� key�� ���� ���ؼ� ��� �غ���
      System.out.println("//9. enhanced for���� �̿��� key�� Set�� ���� ���� key�� ���� ���ؼ� ��� �غ���");
      for(String string : people.keySet()) {
         System.out.println("   "+string);
      }
      System.out.println();
      
      //10. ����Ÿ���Ķ�޴��� Integer�� Hashset��ü numbers �� ��Ʋ�� 2�� ���� �߰��Ѵ�(4�� 7)
      // for���� �ݺ��� i�� 1���� 10���� �ݺ��ϸ鼭 numbers�� i���� ������ ������ ������ ���� +i �� ����ϰ�
      // ������ �Ȱ����� ���� + i �� ���
      
      System.out.println("//10. ����Ÿ���Ķ�޴��� Integer�� Hashset��ü numbers �� ��Ʋ�� 2�� ���� �߰��Ѵ�(4�� 7)\r\n"
            + "// for���� �ݺ��� i�� 1���� 10���� �ݺ��ϸ鼭 numbers�� i���� ������ ������ ������ ���� +i �� ����ϰ�\r\n"
            + "// ������ �Ȱ����� ���� + i �� ���");
      
      HashSet<Integer> number = new HashSet<Integer>();
      number.add(4);number.add(7);
      
      for (int i = 1; i < 11; i++) {
         if (number.contains(i)) {
            System.out.println("   "+i+". ������ ����"+i);
         }else {
            System.out.println("   "+i+". �Ȱ����� ����"+i);
         }
      }
      System.out.println();
      
      //11. 6���� cars��ü�� �̿��� Iterator��ü it�� ����� ����Ÿ�Ժ����� �̿��Ͽ� �����
      //    it �� �̿��� cars�� ��ҵ鸦 ��� �غ���
      
      System.out.println("//11. 6���� cars��ü�� �̿��� Iterator��ü it�� ����� ����Ÿ�Ժ����� �̿��Ͽ� �����\r\n"
            + "//    it �� �̿��� cars�� ��ҵ鸦 ��� �غ���");
      Iterator it = cars.iterator();
      while (it.hasNext()) {
         String str = (String) it.next();
         System.out.println("   "+str);
      }
      System.out.println();
      System.out.println("      �׷� ��� ����ϼ̽��ϴ�!!");
      System.out.println("             ��!");
   }
   
}
//1. ������ Level�� ����� ���� ����� LOW, MEDIUM,HIGH�� �Ѵ�
enum Level {
   LOW,MEDIUM,HIGH
}