public class MethodSyntax
{
	//Field
	String name = "ȫ�浿";
	String add = "�Ѿ�";
	
	//Method
	//=> �������� ���� ���� ����
	public void browserOn(){
		System.out.println("browser�� �Ѵ�");
	}
	//==> �۾��� �ϰ� �۾������� boolean type���� return �ϴ� ����
	public boolean documentWork(){
		System.out.println("document�۾��� �ϰ� �۾��ϼ� ������ boolean return");
		return true;
	}
	public int sum(int i, int j){
		System.out.println("<<"+i+">> �� << "+j+" >> ���� �޾� �� return");
		return(i+j);
	}

	//==> �̸��� return�ϴ� ����
	public String getName(){
		System.out.println("�̸��� �����մϴ�.");
		return name;
	}
	// ==> �ּҸ� return
	public String getAdd(){
		System.out.println("�ּҸ� �����մϴ�.");
		return add;
	}
	public String[] getAllInformation(){
		String[] str = {name, add};
		//String[] str = {ȫ�浿, �Ѿ�};
		return str;
	}
}
