/*
	<<Inner local Class의 이해>>

	1. inner local class는 method와 내부의 local variable과 같은 level
	2. 컴파일 후 inner class는 어떤 형태의 class가 되는지 확인할 것(~~~$1~~~ class)
*/

public class OuterClass02
{
	//Field
	private String outer = "outerClass 의 Field";

	//Constructor
	public OuterClass02(){
	}

	//Method
	public void outerMethod(){

		System.out.println("::"+this.getClass().getName()+"start...");

		final String localVariable = "OuterClass  내의 outerMethod의 localVariable";

		//InnerLocalClass
		class InnerLocalClass
		{
			//Field
			private String inner = "inner class의 Field";
			//Constructor
			public InnerLocalClass(){
			}
			//method
			public void innerMethod(){
				System.out.println("==>"+this.getClass().getName()+"start..");
				//inner class에서 outerClass로 접근하기
				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==>"+this.getClass().getName()+"end..");
			}
		}
		System.out.println("::"+this.getClass().getName()+"start..");

		//inner local class 를 둘러싼 method에서 인스턴스 생성 가능
		InnerLocalClass ilc = new InnerLocalClass();
		ilc.innerMethod();
	}

	//main method
	public static void main(String[] args){
		new OuterClass02().outerMethod();
	}
}