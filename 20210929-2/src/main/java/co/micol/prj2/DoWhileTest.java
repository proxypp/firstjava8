package co.micol.prj2;


import co.micol.prj2.ScanUtil;




public class DoWhileTest {
	Friend[] friends = new Friend[100];
	
	// friend[0,1,2,3,4,5,] <<-- Index번호 안에 데이터를 집어 넣을 수 있어요.
	private void mainMenu() {
		System.out.println("=============");
		System.out.println("== 1. 입력 하기 ===");
		System.out.println("== 2. 수정 하기 ===");
		System.out.println("== 3. 조회 하기 ===");
		System.out.println("== 4. 종료 하기 ===");
		System.out.println("=================");
		System.out.println("원하는 작업번호를 입력하세요?");

	}

	private void firstMenu() {
		System.out.println("=============================");
		System.out.println("== 여기는 입력하는 화면입니다. ===");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("=============================");
		System.out.println("1.학교친구 2. 회사친구");
		int choice = ScanUtil.readInt("번호를 선택하세요.");
		// 그냥 Friend, SchoolFriend, CompanyFriend
		/*
		 * 추상 Class = 자식한테 메소드들을 상속해주기 위한 Class라서 실제로 그 기능을 가지고 있지는 않는 Class.
		 * 그래서 , 자바에서 이 Class는 불완전하다고 판단해서 인스턴스화를 시키지 못하게 막아놨어요.
		 * 그래서 친구 종류가 SchoolFriend, CompanyFriend 밖에 안되요.
		 * 
		 */
		String name = ScanUtil.readStr("이름 입력");
		String tel = ScanUtil.readStr("연락처 입력");
		String address = ScanUtil.readStr("주소 입력");
		
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
		System.out.println("등록 성공.");

	}
		


	private void secondMenu() {
		System.out.println("=============================");
		System.out.println("== 여기는 수정하는 화면입니다. ===");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("=============================");
		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("친구를 선택하세요(숫자로 입력해주세요).");
		String tel = ScanUtil.readStr("바꿀 번호를 입력하세요.");
		if (!tel.equals(""))
			friends[num].setTel(tel);
		
//		friends[num].modify(); 로도 가능하다.
		// instanceof = 학교친구냐 회사친구냐...
		//friends[num].modify();
		if (friends[num] instanceof SchoolFriend) {
			String address = ScanUtil.readStr("바꿀 주소를 입력하세요.");
			if (!address.equals(""))
				((SchoolFriend) friends[num]).setAddress(address);

		}
		if (friends[num] instanceof CompanyFriend) {
			String address = ScanUtil.readStr("바꿀 주소를 입력하세요.");
			if (!address.equals(""))
				((SchoolFriend) friends[num]).setAddress(address);

		}
		System.out.println("수정완료.");
	}

	private void thirdMenu() {
		System.out.println("=============================");
		System.out.println("== 여기는 조회하는 화면입니다. ===");
		System.out.println("==메인메뉴는 아무키나 누르세요.==");
		System.out.println("=============================");
		String name = ScanUtil.readStr("친구이름 입력");
		String tel = ScanUtil.readStr("연락처를 입력");
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
						//friends[i]가 학교친구인지 회사친구인지도 모르는데 
					// tostring이 지금 추상 method라서 그래요.
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
		boolean b = false; // 대부분 초기값을 false로 설정한다
		do {
			mainMenu();
			int key = ScanUtil.readInt("번호를 선택해주세요.");
			
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
