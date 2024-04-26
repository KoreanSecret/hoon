package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class MailUI extends BaseUI{
	
	public static  MemberVO loginUser = null;
	
	
	private int choiceMenu() {
		System.out.println("***** MENU *****");
		System.out.println("1. ���Ϻ�����\t");
		System.out.println("2. ���� ������\t");
		System.out.println("3. ���� ������\t");
		System.out.println("4. ���� �����ϱ�\t\t");
		System.out.println("5. ������\t\t");
		//System.out.println("6. �������� ����\t");
		System.out.println("0. �α׾ƿ�");
		int type = scanInt("�׸��� �����ϼ��� : ");
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
				System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				return;
				
			}
			
			if(ui != null) {
				ui.execute();
			} else {
				System.out.println("�߸������ϼ̽��ϴ�");
			}
		}
	}
}

