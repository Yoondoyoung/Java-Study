class BreakTest
{
	public static void main(String[] args) 
	{
		int inputData = Integer.parseInt(args[0]);

		// while 문의 초기화 변수 선언
		int i = 0;

		// 더한값을 저장하기 위한 변수 선언
		int sum = 0;

		while(true){
			i++;
			sum = sum+i;

			if (i==inputData){
				break;
			}
		}// end of while
		System.out.println("0 ~ "+inputData+"까지의 합은 : "+sum+"입니다.");
	}

}