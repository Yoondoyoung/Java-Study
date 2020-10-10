class ForTest
{
	public static void main(String[] args) 
	{
		int j = 5;
		System.out.println(j+"단을 출력합니다.");

		//for 문은 while 문과는 달리 초기화를 for 문 내부에서 한다.
		for(int i=1 ; i<10 ; i++){
			System.out.println( j + "*" +i+ " = " + j*i);
		}


		//==> 반복문 for / while 사용 과 차이점 이해
		// int k = 1;
		// while ( k<10 ){
			// System.out.println("5 * " +k+ "="+5*k);
			//k++;
	//}
	// System.out.println("i 의 최종 변경값 : "+i);
	// System.out.println("k 의 최종 변경값 : "+k);

	// 무한루프와 무한루프후단의 실행문에서 compile erroor 를 이해하면
	for (; ; ){
		System.out.println("여기는 반복문내부의 무한 루프");
	}
	// 아래 주석을 풀면 comepile error가 발생한다. 이유는...
	// System.out.println("error가 발생한다. 이유는...");

	}
}
