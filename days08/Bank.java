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
	// 은행명을 출력하는 display method 를 추상method로 정의
	public abstract void display();

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}