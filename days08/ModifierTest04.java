/*
	1. TopSecret02 가 중요한 class 라면 modifier를 통해 상속할 수 없도록 했으며,
	 : secretNo 를 readOnly를 명확히 함
	 2. 또한 중요한 class라면 객체 생성을 불가능하게 한다.
	 ==> 아래의 coding을 이해하자. 생성자를 외부에서 접근하지 못하게 private 선언
	 예 : java.lang.System.class 의 소스와 API를 통해 확인)
	 3. static method를 통해 인스턴스를 리턴할 수 있도록 한다.
	 ==> 단.. 조건을 만족할 경우만 인스턴스를 리턴함.
	*/




// final modifier 상속불가
final class TopSecret04
{
	//Field
	//=> access modifier를 활용한 information hiding
	// final modifier 를 활용한 수정불가

	private int secretNo = 7777;

	//Constructor
	//==> Access modifier를 통한 객체생성불가 (private Constructor를 사용한 이유 이해)
	public TopSecret04(){
	}

	//method
	//getter method
	//method를 통해 조건을 충족할 경우만 secretNo를 return
	public int getSecretNo(int pwd){
		if(pwd == 0){
			return secretNo;
		}else{
			return 0;
		}
	}


	//static method를 이용한 instance return 하게하며 다른 class에서 사용가능하게 함
	public static TopSecret04 getInstance(int managerNo){
		if(managerNo == 1234){
			return new TopSecret04();
		}else{
			return null;
		}
	}
}

	public class ModifierTest04
	{
		//main
		public static void main(String[]args){

			//TopSecret03 topSecret = new TopSecret03();

			//=> private Field는 information hiding 되어 있어 접근 및 변경이 불가능
			// Method를 통해 접근만 가능 / 변경불가
			// System.out.println(topSecret.secretNo);
			// topSecret.secretNo = 1234;
			TopSecret04 topSecret = TopSecret04.getInstance(1234);
			System.out.println(topSecret.getSecretNo(0));
		}
	}
