public class MethodSyntax
{
	//Field
	String name = "홍길동";
	String add = "한양";
	
	//Method
	//=> 브라우저를 여는 행위 정의
	public void browserOn(){
		System.out.println("browser를 켜다");
	}
	//==> 작업을 하고 작업유무를 boolean type으로 return 하는 행위
	public boolean documentWork(){
		System.out.println("document작업을 하고 작업완성 유무를 boolean return");
		return true;
	}
	public int sum(int i, int j){
		System.out.println("<<"+i+">> 와 << "+j+" >> 값을 받아 합 return");
		return(i+j);
	}

	//==> 이름을 return하는 행위
	public String getName(){
		System.out.println("이름을 전달합니다.");
		return name;
	}
	// ==> 주소를 return
	public String getAdd(){
		System.out.println("주소를 전달합니다.");
		return add;
	}
	public String[] getAllInformation(){
		String[] str = {name, add};
		//String[] str = {홍길동, 한양};
		return str;
	}
}
