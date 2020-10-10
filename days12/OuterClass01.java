/*
	<<Inner Member Class>>
	1. innermember class�� class �� �����ϴ� field, method �� ���� class�� �����ϴ�
		Member�� �� �� �ִ�.
	2. ��������� : OuterClass�� ������ ����
	3. ������ �� InnverClass�� � ������ class�� �Ǵ��� Ȯ��(~~~$~~~.class)
*/

public class OuterClass01
{
	//Field
	private String outer = "OuterClass�� Field";

	//Constructor
	public OuterClass01(){
	}

	//method

	public void outerMethod(){
		System.out.println("::"+this.getClass().getName()+"start..");
		//innerClass�� ������ ��� �ν��Ͻ� ���� �� ����..
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("::" + this.getClass().getName()+"end..");
	}

	//InnerMember Class
	public class InnerClass{
		//Field
		private String inner = "innerClass�� Field";
		//Constructor
		public InnerClass(){
		}
		//Method
		public void innerMethod(){
		//innerClass ���� outer class�� ����
		//OuterClass�� Field, Method�� ���� ���� :: ���۷��� ���ʿ�
		System.out.println("==> "+this.getClass().getName()+"start..");
		//==> outer class�� field ���� ��� :: 2����
		System.out.println(outer);
		System.out.println(OuterClass01.this.outer);
		//==> �Ʒ��� ���๮�� �ּ� Ǯ�� Compile error�� �߻��Ѵ�. ������...
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
