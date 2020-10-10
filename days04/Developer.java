public class Developer
{

// => Field == 특성,속성(Attribute) 표현
		String name = "홍길동"; // 
		String job = "개발자";
		int avgIncome = 100;
		int projectCareer;  // Field 선언만 한 경우 (변수를 선언만 한 경우) 초기화 유무는 ?


		// Method ==> 기능, 행위(behavior) 표현
		/*
		project에 참여하여 수입의 증가 및 경력을 쌓음을 나타내는 method
		1. income을 증가
		2. projectCareer를 증가
		*/
	public void participateProject(){
		System.out.println("프로그램 개발로 수입증가, 경력쌓음");
		avgIncome++;
		projectCareer++;
	}

	public void instruct(){
		System.out.println("강의를 통한 수입증가");
		avgIncome++;
	}
	
}
