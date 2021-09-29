package co.micol.prj2;

public abstract class Friend {
	
	public String name;
	public String tel;
	public String address;
	
	public abstract void friendPrint(); // 추상 method라고 해서, 선언만 해놓고 자식들이 알아서 쓰라고 주기만 하는 역할.
	
	public Friend() {
		
	}
	

	public Friend(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}


	public void modify() {
		System.out.println("수정할 내용을 입력하세요 : ");
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
