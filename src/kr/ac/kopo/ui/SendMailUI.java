package kr.ac.kopo.ui;


import kr.ac.kopo.vo.MailVO;

public class SendMailUI extends BaseUI {

	private int type;

	@Override
	public void execute() throws Exception {
		System.out.println("*****���Ϻ�����*****");
		String receiver = scanStr("���� ��� �̸����� �Է��ϼ��� : ");
		String title = scanStr("������ �Է��ϼ��� : ");
		String detail = scanStr("������ �Է��ϼ��� : ");
		
		

		eService.addBoard(new MailVO(receiver, title, detail));
		System.out.println("******������ ���½��ϴ� ********");

	}

	private int choiceMenu() {

		return type;
	}

}
