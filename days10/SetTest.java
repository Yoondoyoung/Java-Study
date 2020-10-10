import java.util.HashSet;
import java.util.Set;

/*
	java.util.HashSet : data�� �ߺ��� ������� �ʴ� �ڷ�����
	������ Set(interface) / HashSet API �� Ȯ���ϰ� ������ method �ǹ̸� Ȯ��
	�Ʒ��� ��°���� ���� �� Ȯ��
*/

public class SetTest
{

	//main method
	public static void main(String[] args){

		Set<String> hs = new HashSet<String>();

		String str = new String("A");
		boolean isAddOk = hs.add(str);
		System.out.println("�������� : "+isAddOk);

		isAddOk = hs.add("b");
		System.out.println("�������� : "+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("�������� : "+isAddOk);

		isAddOk = hs.add("B");
		System.out.println("�������� : "+isAddOk);

		System.out.println("����� data ���� : "+hs.size());
		if(hs.contains("b")){
			System.out.println("����� data b �� ������");
			hs.remove("b");
		}
		System.out.println("����� Data ���� : "+hs.size());
	}

}