class IfElse01
{
	public static void main(String[] args) 
	{
		boolean b1 = true;
		boolean b2;

		// ! ���� ������ ���
		b2 = !b1;
		int x = 1;
		int y = 2;

		// if-else �� ���� ���̴� ���
		// if(���ǹ�) : ���ǹ��� �ݵ�� boolean data type �� ��
		if( x < y ) {
			System.out.println(" x = "+x+" y = "+y+ " y �� ũ�׿�");
	}else {
		System.out.println(" x = "+x+" y = "+y+" x�� ũ�׿�");
	}

	// if�� �ܵ����� ���̴� ���
	if(x==y){
		System.out.println("x =" +x+ "y = "+y+ " x,y�� ���ƿ�.");
	}

	// if-else if�� ���� ���
	if(b2){
		System.out.println("if�� ���ǹ��� b2=false�Դϴ�.");
	}else if(b1){
		System.out.println("if�� ���ǹ��� b1=true�Դϴ�.");
	}

}
