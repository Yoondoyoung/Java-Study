package days30;

public class Account {
	// Field
	private String accountNo = "";
	private boolean creditLine = false;
	private int creditLineLimit = 0;
	private int balance = 0;

	// Constructor
	public Account() {
	}

	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		super();
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
	}

	// getter,setter
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	//Method

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("���¹�ȣ : ");
		builder.append(accountNo);
		builder.append(", �ܰ� : ");
		builder.append(balance+" ��");
		
		if(creditLine==true) {
			builder.append("\t[[ -"+creditLineLimit+"�� ���̳ʽ� ����  ]]");
		}
		
		return builder.toString();
	}
	
	public void withdraw(int withdraw) {
		balance -= withdraw;
		if(balance < -creditLineLimit) {
			throw new IllegalArgumentException("�ܰ���� ��ݺҰ��մϴ�.");
		}
		//System.out.println(accountNo+" ���� "+withdraw+" ��ݿ�û");
	}
	public void deposit(int deposit) {
		balance += deposit;
		//System.out.println(accountNo+"���� "+deposit+" �Աݿ�û");
	}
	

}
