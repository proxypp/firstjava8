package co.micol.prj2;

public class CompanyFriend extends Friend{
	
	public CompanyFriend(String name, String tel, String address) {
		super(name, tel, address);
		
	}

//	public void modify() {
//		// 뭘 수정할건지를 나타내면서 + 
//		// 직장동료(어느회사를 다니는지를 표시)
//		// 수정할 때 여기서 회사를 수정할 수 있도록 해놨는데...
//		
//	}
	public String toString() {
		return "Friend [name= " + name + ", tel= " + tel + ", address= " + address + " 구분 : 직장동료]";
	}
	@Override
	public void friendPrint() {
		System.out.println("이름 : " +name);
		System.out.println("전화번호 : " +tel);
		System.out.println("주소 : " +address);
		System.out.println("구분 : 직장동료");
		
	}
	
	
	
}
