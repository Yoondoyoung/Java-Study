public class Bank01
{
	// field
	int balance;
	int money;
	int command;
	String bankName;
	String userName;

	//Constructor
	public Bank01(){
	}
	public Bank01(String s1, String s2){
		bankName = s1;
		userName = s2;
	}
	public Bank01(String s1, String s2, String s3){
		bankName = s1;
		userName = s2;
		command = Integer.parseInt(s3);
	}
	public Bank01(String s1, String s2, String s3, String s4){
		bankName = s1;
		userName = s2;
		command = Integer.parseInt(s3);
		money = Integer.parseInt(s4);
	}

	public void deposit(){
		balance += money;
		System.out.println(money+" 원 입금함.");
	}

	public void displayMoney(){
		System.out.println("현재 잔고는 : "+balance+"입니다.");
	}
	public static void main(String[]args){
		if(args.length<2){
			System.out.println("[usage]:: java Bank [CustomerName][bankName][option][money]");
			System.out.println("[usage]:: 인자값이 최소 2개가 필요합니다.");
			System.out.println("O");
		}
		System.out.println(args[0]+"님의 주거래은행은"+args[1]+"입니다.");
		Bank01 b = new Bank01();

		switch(args.length){
			case 2:
				b = new Bank01(args[0],args[1]);
				break;
			case 4:
				b = new Bank01(args[0],args[1],args[2],args[3]);
				b.deposit();
				break;
			default:
				System.out.println("혹시 인자값이 너무 많거나, 적은것은 아닌지. 하여간에...");
				break;
		}

		b.displayMoney();
	}

}