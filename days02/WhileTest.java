class WhileTest
{
	public static void main(String[] args) 
	{
		// while 문
		int i = 0;  // 1. 순환문의 조건을 주기위한 int i 의 초기화
		while (i<10){ // #2 조건 boolean data Type )
		System.out.println("여기는 while문 내무 안임 i = "+ i);
		i++;		
		}

		//do-while문
		int j = 0;  // # 1. 순환문의 조건을 주기위한 int j의 초기화
		do{
			System.out.println("\n\t 여기는 do문 내부임 j = " +j);
			j++; //2. 증감식
	}while{ j<1 );  //3.조건 ( boolean daya type )
	System.out.println("\n===============================\n);

	// while 문을 이용하여 5단을 출력하는 프로그램
	int k = 1;
	while( k<10 ) {
		System.out.println("5 *"+k+"="+5*k);
		k++;
	}

	while(true){
		System.out.println("여기는 반복문 내부의 무한루프");
	}




}
