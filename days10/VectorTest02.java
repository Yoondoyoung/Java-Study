/*
	1. Vector가 갖는 문자열 값을 출력하는 for 문을 Method 로 추출, 정의
	2. Vector 를 확장하여 필요한 기능(Method)를 추가
*/

import java.util.*;

//Vector가 final class 가 아니라면 확장 가능
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
	// Vecotr가 관리(? , 자장) 한 문자열 값을 출력하는 method 정의
	public void printString(Vector vector){

		//for(int i = 0; i < vector.size(); i++){
			//System.out.println((String)vector.elementAt(i));
		//}

		//위의 for 문과 비교하여 이해하자. / JDK1.5에 추가된 기능 :: Enchanced For Loop
		//Vector 내부에 저장된 값은 size() 만큼 반복, 1EA 씩 추출, Object 에 담아(?)준다.
		for(Object object : vector){
			//위 for문의 elementAt() 후 Casting 한 것과 비교하여 이해
			System.out.print((String)object);
		}
	}
	
	//Main method

public static void main(String[] args){

	VectorTest02 vectorTest = new VectorTest02(10,10);

	//Vector에 Object 저장
	String s1 = new String("1.홍");
	vectorTest.add(s1);
	vectorTest.add(new String("2.동"));
	vectorTest.add("3.님 안녕하세요");

	//Vector에 저장된 값을 출력
	vectorTest.printString(vectorTest);

	System.out.println("\n ==> API 확인");
	vectorTest.insertElementAt("4.길", 1);
	vectorTest.printString(vectorTest);

	System.out.println("\n ==> API 확인");
	vectorTest.setElementAt("5.홍길순",3);
	vectorTest.printString(vectorTest);

	System.out.println("\n ==> API 확인");
	vectorTest.removeElementAt(3);
	vectorTest.printString(vectorTest);
	}



}
