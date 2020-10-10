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
		builder.append("계좌번호 : ");
		builder.append(accountNo);
		builder.append(", 잔고 : ");
		builder.append(balance+" 원");
		
		if(creditLine==true) {
			builder.append("\t[[ -"+creditLineLimit+"원 마이너스 통장  ]]");
		}
		
		return builder.toString();
	}
	
	public void withdraw(int withdraw) {
		balance -= withdraw;
		if(balance < -creditLineLimit) {
			throw new IllegalArgumentException("잔고부족 출금불가합니다.");
		}
		//System.out.println(accountNo+" 계좌 "+withdraw+" 출금요청");
	}
	public void deposit(int deposit) {
		balance += deposit;
		//System.out.println(accountNo+"계좌 "+deposit+" 입금요청");
	}
	

}
