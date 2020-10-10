/*
	<<Inner local Class�� ����>>

	1. inner local class�� method�� ������ local variable�� ���� level
	2. ������ �� inner class�� � ������ class�� �Ǵ��� Ȯ���� ��(~~~$1~~~ class)
*/

public class OuterClass02
{
	//Field
	private String outer = "outerClass �� Field";

	//Constructor
	public OuterClass02(){
	}

	//Method
	public void outerMethod(){

		System.out.println("::"+this.getClass().getName()+"start...");

		final String localVariable = "OuterClass  ���� outerMethod�� localVariable";

		//InnerLocalClass
		class InnerLocalClass
		{
			//Field
			private String inner = "inner class�� Field";
			//Constructor
			public InnerLocalClass(){
			}
			//method
			public void innerMethod(){
				System.out.println("==>"+this.getClass().getName()+"start..");
				//inner class���� outerClass�� �����ϱ�
				System.out.println(localVariable);
				System.out.println(outer);
				System.out.println(inner);
				System.out.println("==>"+this.getClass().getName()+"end..");
			}
		}
		System.out.println("::"+this.getClass().getName()+"start..");

		//inner local class �� �ѷ��� method���� �ν��Ͻ� ���� ����
		InnerLocalClass ilc = new InnerLocalClass();
		ilc.innerMethod();
	}

	//main method
	public static void main(String[] args){
		new OuterClass02().outerMethod();
	}
}