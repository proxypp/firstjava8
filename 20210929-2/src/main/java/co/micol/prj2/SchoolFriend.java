package co.micol.prj2;


public class SchoolFriend extends Friend{
	
	public SchoolFriend() {
		
	}
//	
//	public void modify() {
//		// 뭘 수정할지를 넣어놨고
//	}
	public String toString() {
		return "Friend [name= " + name + ", tel= " + tel + ", address= " + address + " 구분 : 학교친구]";
	}
	public SchoolFriend(String name, String tel, String address) {
		super(name, tel, address);
	}
	public void friendPrint() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("구분 : 학교친구");

	}
}
