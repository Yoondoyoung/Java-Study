class JuniorHighSchool
{

	//field
	String name = "���ѹα����б�";

	//Constructor
	public JuniorHighSchool(){
	}

	//method
	public void schoolName(){
		System.out.println("���б� �̸� : "+name);
	}

}

class HighSchool extends JuniorHighSchool {
	//field
	String name = "���ѹα������б�";
	
	//Constructor
	public HighSchool(){
	}

	//Constructor O/R
	public HighSchool(String str){
		name = str;
	}

	//==> �� �����ڿ� �Ʒ� �����ڸ� readability ���鿡�� ���캸��...
	//public HighSchool(String name){
	//	this.name = name;
	//}

	//method
	public void schoolName(){
		System.out.println("���б� �̸� : "+super.name);
		System.out.println("�����б� �̸� : "+this.name);
		System.out.println("�����б� �̸� : "+name);
	}
}

public class SuperThisTest
{
	//main method
	public static void main(String[]args){

		HighSchool hs01 = new HighSchool();

		hs01.schoolName();
		System.out.println("================");

		HighSchool hs02 = new HighSchool("��������б�");
		hs02.schoolName();
	}
}