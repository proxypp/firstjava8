package co.micol.prj2;


public class SchoolFriend extends Friend{
	
	public SchoolFriend() {
		
	}
//	
//	public void modify() {
//		// �� ���������� �־����
//	}
	public String toString() {
		return "Friend [name= " + name + ", tel= " + tel + ", address= " + address + " ���� : �б�ģ��]";
	}
	public SchoolFriend(String name, String tel, String address) {
		super(name, tel, address);
	}
	public void friendPrint() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + tel);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : �б�ģ��");

	}
}
