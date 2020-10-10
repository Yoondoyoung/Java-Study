public class Employee
{
	//field
	String part, name;
	int age, baseSalary;

	//Constructor
	public Employee(){
		System.out.println("Emp의 default Constructor");
	}
	public Employee(String str){
		name = str;
		System.out.println("Emp의 name을 받는 Constructor");
		//String name
		//this.name = name;
		// 도 가능하다.
	}
	public Employee(String str1, String str2){
		this(str1);
		part = str2;
		System.out.println("Emp의 name.part를 받는 Constructor");
		//String name, String part
		//this(name);
		//this.part = part;
		// 도 가능하다.
	}
	public Employee(String str1, String str2, int i){
		this(str1,str2);
		age = i;
		System.out.println("Emp의 name.part.age를 받는 Constructor");
		//String name, String part, int age
		//this(name,part);
		//this.age = age;
		//도 가능하다
	}
	
	//method
	public int salary(){
		System.out.println("Emp의 salary() method");
		baseSalary = 100;
		return baseSalary;
	}
}