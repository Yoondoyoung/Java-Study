public class MethodSyntaxTestApp
{
	public static void main(String[] args){
		//MethodSyntax class�� ���(instance ���� :: new ������ ���)
		MethodSyntax methodSyntax = new MethodSyntax();

		//methodSyntax �ĺ����� ���� instance�� method�� �����ڷ� ���� ���
		System.out.println("\n=======================");
		methodSyntax.browserOn();

		System.out.println("\n=======================");
		boolean result = methodSyntax.documentWork();
		System.out.println("doc�۾����� : "+result);

		System.out.println("\n=======================");
		int value = methodSyntax.sum(1,1);
		System.out.println("��� ����� : "+value);
		// ==> ���� �� ������ �Ʒ��� ���� ǥ���ߴ�. �ּ� Ǯ�� ��°���� Ȯ���ϸ�...
		 System.out.println("��� ����� : "+methodSyntax.sum(1,1));

		System.out.println("\n=======================");
		String name = methodSyntax.getName();
		System.out.println("Field���� name : "+name);
		// ==> ���� �� ������ �Ʒ��� ���� ǥ���ߴ�. �ּ� Ǯ�� ��°���� Ȯ���ϸ�..
		 System.out.println("Field ���� name : "+methodSyntax.getName());

		System.out.println("\n=======================");
		String[] info = methodSyntax.getAllInformation();
		System.out.println("Field ���� ��� ���");

		//for(int i = 0; i<info.length; i++){
			for(int i=0; i<2; i++){ // <== info.length�� ���� 2�� ��������??
			System.out.println((i+1)+"��° ���� : "+info[i]);
		}
	}
}
		
