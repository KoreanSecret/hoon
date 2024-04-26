package kr.ac.kopo.ui;

public class MemberUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("***** MENU *****");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		//System.out.println("3. ID/PW찾기");
		System.out.println("0. 프로그램 종료");
		int type = scanInt("항목을 선택하세요 : ");
		return type;
	}
	
	@Override
	public void execute() throws Exception {
		while (true) {
			IBoardUI ui = null;
			int type = choiceMenu();
			switch (type) {
			case 1:
				ui = new JoinMemberUI();
				break;
			case 2:
				ui = new LoginUI();
				break;
			//case 3:
			//	ui = new DeleteUI();
			//	break;
					case 0:
				ui = new ExitUI();
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못선택하셨습니다");
			}
		}
	}
}


