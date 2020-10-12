package days34;

public class User {
	//Field
	private String name;
	private String address;
	private String cellularNumber;
	private boolean male;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String address, String cellularNumber, boolean male) {
		super();
		this.name = name;
		this.address = address;
		this.cellularNumber = cellularNumber;
		this.male = male;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("�̸� : ");
		builder.append(name);
		builder.append(", �ڵ��� : ");
		builder.append(cellularNumber);
		builder.append(", ���� : ");
		if(male == true) {
			builder.append("��");
		}else {
			builder.append("��");
		}
		builder.append(", �ּ� : ");
		builder.append(address);
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellularNumber() {
		return cellularNumber;
	}

	public void setCellularNumber(String cellularNumber) {
		this.cellularNumber = cellularNumber;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

}
