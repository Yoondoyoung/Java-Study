import java.util.*;

public class VectorTest03
{

	//Main method
	public static void main(String[] args){

		//Vector ��ü ������ ����(����, ����)�� �ν��Ͻ� DataType ���
		List<String> vector = new Vector<String>(10,10);

		//Vector�� String ����
		// add(E obj) : E�� ���ڷ� �޴´ٴ� �ǹ̴�? :: Generic ������� ������ ����ȿ
		String s1 = new String("1.ȫ");
		vector.add(s1);
		vector.add(new String("2.��"));
		vector.add("3.�� �ȳ�");

		//vector ����� ���� ���
		for(int i = 0; i<vector.size(); i++){
			//Generic ������� ����� ����ȭ ���ʿ�
			String s = vector.get(i);
			System.out.print(s);
			//System.out.print(vector.elementAt(i);
		}

		System.out.println("\n JDK 1.5 �߰���� :: Generic , Enhanced For Loop ���");
		//=> ���� for ���� ���Ͽ� ��������. JDK1.5�� �߰���� :: Enhanced For Loop
		// Vector ���ο� ����� ���� size() ��ŭ �ݺ�. 1EA �� ���� String �ش�.(Grneric �������...)

		for(String value : vector){
			System.out.print(value);
		}

		System.out.println("\n ==> API Ȯ��");
		vector.add(1, "4.��");
		for(String value : vector){
			System.out.print(value);
		}

		System.out.println("\n ==> API Ȯ��");
		vector.set(3, "5.ȫ���");
		for(int i = 0; i<vector.size(); i++){
			System.out.print(vector.get(i));
		}

		System.out.println("\n ==> API Ȯ��");
		vector.remove(3);
		for(int i = 0; i < vector.size(); i++){
			System.out.print(vector.get(i));
		}
	}
}
