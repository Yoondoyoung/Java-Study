public abstract class Bank
{
	//Field
	private String name;

	//Constructor
	public Bank(){
	}
	public Bank(String name){
		this.name = name;
	}

	//Method
	// ������� ����ϴ� display method �� �߻�method�� ����
	public abstract void display();

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}