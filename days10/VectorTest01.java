/*
	1. Array : ���� Daya Type�� ����, ���� ����
	2. java.util Vector : �ٸ� Data type�� ����, ���� ����

*/

import java.util.*;

public class VectorTest01
{
		//Main method
		public static void main(String[] args){

			//Vector ���� : API�� �����ڸ� Ȯ��, ���ڷ� ���޵� 10, 10 �ǹ� Ȯ��.
			Vector vector = new Vector(10, 10);

			//Vector �� Object ���� ==> add(Object.obj) : Object�� ���ڷ� �޴´ٴ� �ǹ̴�?
			String s1 = new String("1.ȫ");
			vector.add(s1);
			vector.add(new String("2.��"));
			vector.add("3.�� �ȳ��ϼ���.");

		for(int i = 0; i < vector.size(); i++){
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			//String s = (String)vector.capacity() ������ return �ϴ°�
			System.out.print(s);
			//System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> API Ȯ�� ");
		vector.insertElementAt("4.��", 1);
		for(int i = 0; i < vector.size(); i++){
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> ApI Ȯ�� ");
		vector.setElementAt("5. ȫ���", 3);
		for(int i = 0; i < vector.size(); i++){
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> API Ȯ�� ");
		vector.removeElementAt(3);
		for(int i = 0; i < vector.size(); i++){
			System.out.println((String)vector.elementAt(i));
		}
	}

}