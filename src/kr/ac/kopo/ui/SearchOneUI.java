package kr.ac.kopo.ui;

public class SearchOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int name = scanInt("�̸��� �Է��ϼ��� : ");
		String id = scanStr("���̵� �Է��ϼ��� : ");
		String pwd = scanStr("��й�ȣ�� �Է��ϼ��� : ");
		
		
		
		//
		
		System.out.println("----------------------------");
		System.out.println("�̸� : " + name);
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " );
		System.out.println("----------------------------");
		
	}

}
