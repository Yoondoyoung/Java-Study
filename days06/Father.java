public class Father
{
	//field
	public String name = "ȫ�浿";  // ������ ���� ����
	protected String bank = "�Ѿ�����";  // protected = ��� ���� ���� package ���ٰ���
	String branch = "���ﵿ����"; // (         ) : ���� package�� ���ٰ���
	private int password = 1234; // private = �ڽŸ� ���� ����

	//Constructor
	public Father(){
	}

	//method
	/*
		������ field �Ʒ��� method�� ���� ���� ����
		�Ʒ��� ������ getter method�� �ǹ̸� ����
	*/

	public String getBank(int pwd){
		if(pwd != 7777){
			return "key���� ��Ȯ�� �Է��ϼ���";
		}else{
			return this.bank;
		}
	}


//���� ��й�ȣ�� �˱����� key�� �˰� ������ password�� return
	public int getPassword(int key){
		if(key != 7777){
			return 0;
		}else{
			return this.password;
		}
	}
	public String getName(){
		return name;
	}
	public String getBranch(){
		return branch;
	}
}



