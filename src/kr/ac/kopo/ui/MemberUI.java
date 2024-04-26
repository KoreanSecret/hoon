package kr.ac.kopo.ui;

public class MemberUI extends BaseUI{
	
	private int choiceMenu() {
		System.out.println("***** MENU *****");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		//System.out.println("3. ID/PWã��");
		System.out.println("0. ���α׷� ����");
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
				System.out.println("�߸������ϼ̽��ϴ�");
			}
		}
	}
}


