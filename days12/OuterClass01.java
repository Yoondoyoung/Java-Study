/*
	<<Inner Member Class>>
	1. innermember class는 class 를 구성하는 field, method 와 같이 class가 구성하는
		Member가 될 수 있다.
	2. 사용이유는 : OuterClass와 밀접한 관련
	3. 컴파일 후 InnverClass는 어떤 형태의 class가 되는지 확인(~~~$~~~.class)
*/

public class OuterClass01
{
	//Field
	private String outer = "OuterClass의 Field";

	//Constructor
	public OuterClass01(){
	}

	//method

	public void outerMethod(){
		System.out.println("::"+this.getClass().getName()+"start..");
		//innerClass에 접근할 경우 인스턴스 생성 후 접근..
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("::" + this.getClass().getName()+"end..");
	}

	//InnerMember Class
	public class InnerClass{
		//Field
		private String inner = "innerClass의 Field";
		//Constructor
		public InnerClass(){
		}
		//Method
		public void innerMethod(){
		//innerClass 에서 outer class로 접근
		//OuterClass의 Field, Method에 쉽게 접근 :: 레퍼런스 불필요
		System.out.println("==> "+this.getClass().getName()+"start..");
		//==> outer class의 field 접근 방식 :: 2가지
		System.out.println(outer);
		System.out.println(OuterClass01.this.outer);
		//==> 아래의 실행문을 주석 풀면 Compile error가 발생한다. 이유는...
		//System.out.println(this.outer);
			System.out.println(inner);
			System.out.println("==>"+this.getClass().getName()+"end..");
		}
	}
	//main method
	public static void main(String[] args){
		new OuterClass01().outerMethod();
	}	
}
