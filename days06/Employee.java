public class Employee
{
	//field
	String part, name;
	int age, baseSalary;

	//Constructor
	public Employee(){
		System.out.println("Emp�� default Constructor");
	}
	public Employee(String str){
		name = str;
		System.out.println("Emp�� name�� �޴� Constructor");
		//String name
		//this.name = name;
		// �� �����ϴ�.
	}
	public Employee(String str1, String str2){
		this(str1);
		part = str2;
		System.out.println("Emp�� name.part�� �޴� Constructor");
		//String name, String part
		//this(name);
		//this.part = part;
		// �� �����ϴ�.
	}
	public Employee(String str1, String str2, int i){
		this(str1,str2);
		age = i;
		System.out.println("Emp�� name.part.age�� �޴� Constructor");
		//String name, String part, int age
		//this(name,part);
		//this.age = age;
		//�� �����ϴ�
	}
	
	//method
	public int salary(){
		System.out.println("Emp�� salary() method");
		baseSalary = 100;
		return baseSalary;
	}
}