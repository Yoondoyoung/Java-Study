/*
	1. TopSecret01.class 문제점
	 : secretNo는 중요한 attribute이다 그러나 누구나 접근 및 변경이 가능
	 ==> Access Modifier 를 통한 information hiding 과 Method를 통한 접근
	*/






class TopSecret02
{
	//Field
	//=> access modifier를 활용한 information hiding
	// private 접근제어를 사용, 직접 접근할 수 없도록 하고 getter method 통해 접근

	private int secretNo = 7777;

	//Constructor
	public TopSecret02(){
	}

	//method
	//getter method
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else{
			return 0;
		}
	}
}

public class ModifierTest02
{
	//main
	public static void main(String[]args){

		TopSecret02 topSecret = new TopSecret02();

		//=> private Field는 information hiding 되어 있어 접근 및 변경이 불가능
		// Method를 통해 접근만 가능 / 변경불가
		// System.out.println(topSecret.secretNo);
		// topSecret.secretNo = 1234;

		System.out.println(topSecret.getSecretNo(0));
	}
}

// TopSecret의 문제점
// secretNo는 중요한 attribute이다 그러나 누구나 접근 및 변경