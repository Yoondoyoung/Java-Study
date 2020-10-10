/*
	
	1.ModifierTest01.ModifierTest02,Modifier03,ModifierTest04를 통해
	Class 구현시 Modifier / Access Modifier 어떻게 활용, 응용되는지 살펴보면..
	
	TopSecret01.class를 Access Modifier, Modifier 로 어떻게 변경시키는지 이해
*/

class TopSecret01
{
	//Field
	int secretNo = 7777;

	//Constructor
	public TopSecret01(){
	}

	//method
	//getter method
	public int getSecretNo(){
		return secretNo;
	}
}

public class ModifierTest01
{
	//main
	public static void main(String[]args){

		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.getSecretNo());
	}
}

// TopSecret의 문제점
// secretNo는 중요한 attribute이다 그러나 누구나 접근 및 변경이 가능