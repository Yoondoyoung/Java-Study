public class Developer1
{
	String name = "홍길동";
	String job = "개발자";
	int avgIncome = 100;
	int projectCareer; // Field 선언만 한 경우 (변수를 선언만 한 경우) 초기화 유무는??
 
	//Method ==> 기능, 행위(behavior)표현
	/*
		project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
		1. income 을 1 증가
		2. projectCareer를 1 증가
		*/

	public void participateProject(){
		System.out.println("프로그램 개발로 수입증가, 경력 쌓음");
		avgIncome++;
		projectCareer++;
	}
	/* ========== 추가된 method(OverLoading Method) =========
		project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
		1. income 을 1 증가
		2. projectCareer을 1 증가
		행위 및 참여 project의 name을 디스플레이 하는 행위

	*/

	public void participateProject(String project){
		System.out.println(project + "==> project 참여로 수입증가, 경력 쌓음");
		avgIncome++;
		projectCareer++;
	}
	/*
		강의를 통해 수입의 증가
		1. Income을 1 증가
		행위
	*/

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avgIncome++;
	}

	// 추가된 method(OverLoading Method) ==========

	public void instruct(int lectureCount){
		System.out.println(lectureCount+"개 강의를 통한 수입증가");
		avgIncome += lectureCount;
	}

}

