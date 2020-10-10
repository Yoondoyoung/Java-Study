/*
	1. Array : 같은 Daya Type의 묶음, 고정 길이
	2. java.util Vector : 다른 Data type도 묶음, 가변 길이

*/

import java.util.*;

public class VectorTest01
{
		//Main method
		public static void main(String[] args){

			//Vector 생성 : API의 생정자를 확인, 인자로 전달된 10, 10 의미 확인.
			Vector vector = new Vector(10, 10);

			//Vector 에 Object 저장 ==> add(Object.obj) : Object를 인자로 받는다는 의미는?
			String s1 = new String("1.홍");
			vector.add(s1);
			vector.add(new String("2.동"));
			vector.add("3.님 안녕하세요.");

		for(int i = 0; i < vector.size(); i++){
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			//String s = (String)vector.capacity() 무엇을 return 하는가
			System.out.print(s);
			//System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> API 확인 ");
		vector.insertElementAt("4.길", 1);
		for(int i = 0; i < vector.size(); i++){
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> ApI 확인 ");
		vector.setElementAt("5. 홍길순", 3);
		for(int i = 0; i < vector.size(); i++){
			System.out.println((String)vector.elementAt(i));
		}

		System.out.println("\n ==> API 확인 ");
		vector.removeElementAt(3);
		for(int i = 0; i < vector.size(); i++){
			System.out.println((String)vector.elementAt(i));
		}
	}

}