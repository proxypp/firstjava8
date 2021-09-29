package co.micol.prj2;


import co.micol.prj2.ScanUtil;




public class DoWhileTest {
	Friend[] friends = new Friend[100];
	
	// friend[0,1,2,3,4,5,] <<-- Index��ȣ �ȿ� �����͸� ���� ���� �� �־��.
	private void mainMenu() {
		System.out.println("=============");
		System.out.println("== 1. �Է� �ϱ� ===");
		System.out.println("== 2. ���� �ϱ� ===");
		System.out.println("== 3. ��ȸ �ϱ� ===");
		System.out.println("== 4. ���� �ϱ� ===");
		System.out.println("=================");
		System.out.println("���ϴ� �۾���ȣ�� �Է��ϼ���?");

	}

	private void firstMenu() {
		System.out.println("=============================");
		System.out.println("== ����� �Է��ϴ� ȭ���Դϴ�. ===");
		System.out.println("==���θ޴��� �ƹ�Ű�� ��������.==");
		System.out.println("=============================");
		System.out.println("1.�б�ģ�� 2. ȸ��ģ��");
		int choice = ScanUtil.readInt("��ȣ�� �����ϼ���.");
		// �׳� Friend, SchoolFriend, CompanyFriend
		/*
		 * �߻� Class = �ڽ����� �޼ҵ���� ������ֱ� ���� Class�� ������ �� ����� ������ ������ �ʴ� Class.
		 * �׷��� , �ڹٿ��� �� Class�� �ҿ����ϴٰ� �Ǵ��ؼ� �ν��Ͻ�ȭ�� ��Ű�� ���ϰ� ���Ƴ����.
		 * �׷��� ģ�� ������ SchoolFriend, CompanyFriend �ۿ� �ȵǿ�.
		 * 
		 */
		String name = ScanUtil.readStr("�̸� �Է�");
		String tel = ScanUtil.readStr("����ó �Է�");
		String address = ScanUtil.readStr("�ּ� �Է�");
		
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				 if (choice == 1) {
					friends[i] = new SchoolFriend(name, tel, address);
					break;
				} else if (choice == 2) {
					friends[i] = new CompanyFriend(name, tel, address);
					// friends = new CompanyFriend();
					break;
				}
			}
		}
		System.out.println("��� ����.");

	}
		


	private void secondMenu() {
		System.out.println("=============================");
		System.out.println("== ����� �����ϴ� ȭ���Դϴ�. ===");
		System.out.println("==���θ޴��� �ƹ�Ű�� ��������.==");
		System.out.println("=============================");
		System.out.println("[ģ�����]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("ģ���� �����ϼ���(���ڷ� �Է����ּ���).");
		String tel = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���.");
		if (!tel.equals(""))
			friends[num].setTel(tel);
		
//		friends[num].modify(); �ε� �����ϴ�.
		// instanceof = �б�ģ���� ȸ��ģ����...
		//friends[num].modify();
		if (friends[num] instanceof SchoolFriend) {
			String address = ScanUtil.readStr("�ٲ� �ּҸ� �Է��ϼ���.");
			if (!address.equals(""))
				((SchoolFriend) friends[num]).setAddress(address);

		}
		if (friends[num] instanceof CompanyFriend) {
			String address = ScanUtil.readStr("�ٲ� �ּҸ� �Է��ϼ���.");
			if (!address.equals(""))
				((SchoolFriend) friends[num]).setAddress(address);

		}
		System.out.println("�����Ϸ�.");
	}

	private void thirdMenu() {
		System.out.println("=============================");
		System.out.println("== ����� ��ȸ�ϴ� ȭ���Դϴ�. ===");
		System.out.println("==���θ޴��� �ƹ�Ű�� ��������.==");
		System.out.println("=============================");
		String name = ScanUtil.readStr("ģ���̸� �Է�");
		String tel = ScanUtil.readStr("����ó�� �Է�");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				if (!name.equals("") && !tel.equals("")) {
					if (friends[i].getName().indexOf(name) != -1 && friends[i].getTel().indexOf(tel) != -1)
						System.out.println(friends[i].toString());
				} else if (!tel.equals("")) {
					if (friends[i].getTel().indexOf(tel) != -1) {
						System.out.println(friends[i].toString());
					}
				} else if (!name.equals("")) {
					if (friends[i].getName().indexOf(name) != -1)
						System.out.println(friends[i].toString());
						//friends[i]�� �б�ģ������ ȸ��ģ�������� �𸣴µ� 
					// tostring�� ���� �߻� method�� �׷���.
				} else {
					System.out.println(friends[i].toString());
				}
				// friends[i].toString() <<<==== 

			}
		}
		
		
	}

	private void endMenu() {
		System.out.println("=====Good bye=====");
	}

	private void dowhileMenu() {
		boolean b = false; // ��κ� �ʱⰪ�� false�� �����Ѵ�
		do {
			mainMenu();
			int key = ScanUtil.readInt("��ȣ�� �������ּ���.");
			
			switch (key) {
			case 1:
				firstMenu();
				break;
			case 2:
				secondMenu();
				break;
			case 3:
				thirdMenu();
				break;
			case 4:
				endMenu();
				b = true; // true
				break;
			}

		} while (!b); // (!b)
	}

	public void run() {
		dowhileMenu();
		
	}


}
