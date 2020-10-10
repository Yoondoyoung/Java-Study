class ContinueTest
{
	public static void main(String[] args) 
	{
		// 입력받은 data를 int 변환
		int inputData = Integer.parseInt(args[0]);

		//더한 값을 저장하기 위한 변수
		int sum = 0;

		for(int i = 0; i<inputData; i++){
			if(i%2==1){
				continue;
			}
			sum = sum+i;

			// 아래 내용은 for 순환문이 수행하며
			// 변수의 값은 변화를 확인하기 위한 출력문 (DEBUG)
			// System.out.println("i : "+i);
			// System.out.println("sum : "+sum);
		}

		System.out.println("0 ~"+inputData+"까지의 짝수의 합은 : "+sum);
	}
}
