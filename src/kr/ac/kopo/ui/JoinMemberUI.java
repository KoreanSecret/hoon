package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinMemberUI extends BaseUI {

	private int type;

	@Override
	public void execute() throws Exception {
		System.out.println("*****ȸ������*****");
		String name = scanStr("�̸��� �Է��ϼ��� : ");
		String id = scanStr("���̵� �Է��ϼ��� : ");
		String pwd = scanStr("��й�ȣ�� �Է��ϼ��� : ");
		String pn = scanStr("�ڵ��� ��ȣ�� �Է��ϼ��� : ");
		String bd = scanStr("��������� �Է��ϼ��� : ");

		mService.addBoard(new MemberVO(name, id, pwd, pn, bd));
		System.out.println("******ȸ�������� �Ϸ�Ǿ����ϴ� ********");

	}

	private int choiceMenu() {

		return type;
	}

}
