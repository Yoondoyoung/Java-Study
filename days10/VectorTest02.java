/*
	1. Vector�� ���� ���ڿ� ���� ����ϴ� for ���� Method �� ����, ����
	2. Vector �� Ȯ���Ͽ� �ʿ��� ���(Method)�� �߰�
*/

import java.util.*;

//Vector�� final class �� �ƴ϶�� Ȯ�� ����
//VectorTest02 is a Vector :: ~ is a ~

public class VectorTest02 extends Vector
{

	//Field

	//Constructor
	public VectorTest02(){
		super();
	}
	public VectorTest02(int initialCapacity, int capacityIncrement){
		super(initialCapacity, capacityIncrement);
	}

	//method
	// Vecotr�� ����(? , ����) �� ���ڿ� ���� ����ϴ� method ����
	public void printString(Vector vector){

		//for(int i = 0; i < vector.size(); i++){
			//System.out.println((String)vector.elementAt(i));
		//}

		//���� for ���� ���Ͽ� ��������. / JDK1.5�� �߰��� ��� :: Enchanced For Loop
		//Vector ���ο� ����� ���� size() ��ŭ �ݺ�, 1EA �� ����, Object �� ���(?)�ش�.
		for(Object object : vector){
			//�� for���� elementAt() �� Casting �� �Ͱ� ���Ͽ� ����
			System.out.print((String)object);
		}
	}
	
	//Main method

public static void main(String[] args){

	VectorTest02 vectorTest = new VectorTest02(10,10);

	//Vector�� Object ����
	String s1 = new String("1.ȫ");
	vectorTest.add(s1);
	vectorTest.add(new String("2.��"));
	vectorTest.add("3.�� �ȳ��ϼ���");

	//Vector�� ����� ���� ���
	vectorTest.printString(vectorTest);

	System.out.println("\n ==> API Ȯ��");
	vectorTest.insertElementAt("4.��", 1);
	vectorTest.printString(vectorTest);

	System.out.println("\n ==> API Ȯ��");
	vectorTest.setElementAt("5.ȫ���",3);
	vectorTest.printString(vectorTest);

	System.out.println("\n ==> API Ȯ��");
	vectorTest.removeElementAt(3);
	vectorTest.printString(vectorTest);
	}



}
