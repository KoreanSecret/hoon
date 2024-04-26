package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class MailUI extends BaseUI{
	
	public static  MemberVO loginUser = null;
	
	
	private int choiceMenu() {
		System.out.println("***** MENU *****");
		System.out.println("1. 메일보내기\t");
		System.out.println("2. 받은 메일함\t");
		System.out.println("3. 보낸 메일함\t");
		System.out.println("4. 메일 삭제하기\t\t");
		System.out.println("5. 휴지통\t\t");
		//System.out.println("6. 개인정보 수정\t");
		System.out.println("0. 로그아웃");
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
				ui = new SendMailUI();
				break;
			case 2:
				ui = new ReceiveMailUI();
				break;	
	        case 3:
				ui = new SentMailUI();
				break;
			case 4:
				ui = new DeleteMailUI();
				break;
			
			case 5:
				ui = new TrashUI();
				break;
			//case 6:
			//	ui = new SentMailboxUI();
			//	break;
			case 0:
				System.out.println("로그아웃 되었습니다");
				return;
				
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("잘못선택하셨습니다");
			}
		}
	}
}

