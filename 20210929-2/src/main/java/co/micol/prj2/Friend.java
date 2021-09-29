package co.micol.prj2;

public abstract class Friend {
	
	public String name;
	public String tel;
	public String address;
	
	public abstract void friendPrint(); // �߻� method��� �ؼ�, ���� �س��� �ڽĵ��� �˾Ƽ� ����� �ֱ⸸ �ϴ� ����.
	
	public Friend() {
		
	}
	

	public Friend(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}


	public void modify() {
		System.out.println("������ ������ �Է��ϼ��� : ");
	}
	
	public abstract String toString();
//	public String toString() {
//		return "Friend [name=" + name + ", tel=" + tel + ", address=" + address + "]";
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
