

/*
	1. Encapsulation(information hiding0을 지원하는 Access Modifier 이해
	2. public / protected /      / private 의 사용 및 이해

	Son은 Father와 같은 package에 존재하며 상속관계이다.
	주석을 풀고 
	=> Compile 시 error를 확인하고, error의 의미 이해
	=> 각 Access Modifier의 접근 범위를 확인
*/

public class Son1 extends Father
{

	//Field

	//Constructor
	public Son1(){
		System.out.println(this.name); // => public String name = "홍길동"
		System.out.println(bank); // => protected String bank = "한양은행";
		System.out.println(branch); // => String branch = "역삼동지점";
		//System.out.println(password); //=> private int password = 1234;

		//Field(상태정보)는 method(행위)를 이용 접근
		System.out.println("은행 비밀번호 : "+this.getPassword(0));
	}
}

/*
	1. private을 사용해 다른 class로 부터 상태정보 은닉
	2. method를 통해 정보은닉 여부를 제어
*/