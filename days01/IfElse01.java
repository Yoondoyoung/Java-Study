class IfElse01
{
	public static void main(String[] args) 
	{
		boolean b1 = true;
		boolean b2;

		// ! 반전 연산자 사용
		b2 = !b1;
		int x = 1;
		int y = 2;

		// if-else 가 같이 쓰이는 경우
		// if(조건문) : 조건문은 반드시 boolean data type 일 것
		if( x < y ) {
			System.out.println(" x = "+x+" y = "+y+ " y 가 크네요");
	}else {
		System.out.println(" x = "+x+" y = "+y+" x가 크네요");
	}

	// if문 단독으로 쓰이는 경우
	if(x==y){
		System.out.println("x =" +x+ "y = "+y+ " x,y는 같아요.");
	}

	// if-else if가 쓰인 경우
	if(b2){
		System.out.println("if의 조건문이 b2=false입니다.");
	}else if(b1){
		System.out.println("if의 조건문이 b1=true입니다.");
	}

}
