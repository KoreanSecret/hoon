package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class  LoginUI extends BaseUI {

	
	@Override
	public void execute() throws Exception {
        
		System.out.println("<<< �α��� ���� >>>");
		String id = scanStr("���̵� �Է��ϼ���  : ");
		String pwd = scanStr("��й�ȣ�� �Է��ϼ��� : ");
		MemberVO all = new MemberVO();
		all.setId(id);
		all.setPwd(pwd);
		MemberVO Member = mService.searchAllBoard(all);
		// ���̵� ��� Ȯ��
		
		if(Member != null) {
			System.out.println(Member.getName() + "�� �α��ο� �����Ͽ����ϴ�");
			MailUI.loginUser = Member;
			new MailUI().execute();
		} else {
			System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���");
			
		}
		
	}

}

