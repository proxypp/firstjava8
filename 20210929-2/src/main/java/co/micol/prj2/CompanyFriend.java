package co.micol.prj2;

public class CompanyFriend extends Friend{
	
	public CompanyFriend(String name, String tel, String address) {
		super(name, tel, address);
		
	}

//	public void modify() {
//		// �� �����Ұ����� ��Ÿ���鼭 + 
//		// ���嵿��(���ȸ�縦 �ٴϴ����� ǥ��)
//		// ������ �� ���⼭ ȸ�縦 ������ �� �ֵ��� �س��µ�...
//		
//	}
	public String toString() {
		return "Friend [name= " + name + ", tel= " + tel + ", address= " + address + " ���� : ���嵿��]";
	}
	@Override
	public void friendPrint() {
		System.out.println("�̸� : " +name);
		System.out.println("��ȭ��ȣ : " +tel);
		System.out.println("�ּ� : " +address);
		System.out.println("���� : ���嵿��");
		
	}
	
	
	
}
