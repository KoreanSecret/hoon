package kr.ac.kopo.ui;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< ȸ������ ���� >>>");
		String name = scanStr("�̸��� �Է��ϼ��� : ");
		String id = scanStr("���̵� �Է��ϼ���  : ");
		String pwd = scanStr("��й�ȣ�� �Է��ϼ��� : ");
		String pn     = scanStr("�ڵ��� ��ȣ�� �Է��ϼ��� : ");
		String bd     = scanStr("��������� �Է��ϼ��� : ");
		String member_cd = scanStr("�Ѹ��� �߰��Ǿ����ϴ� ");
		
		//
		
		System.out.println("[" + member_cd + "]�� ����� ȸ�������� �Ͽ����ϴ�.");
	}

}
