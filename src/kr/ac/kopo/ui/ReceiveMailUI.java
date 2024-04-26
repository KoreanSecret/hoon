package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public class ReceiveMailUI extends BaseUI {
	
	
	@Override
	public void execute() throws Exception{
		List<MailVO> list = eService.searchMail(MailUI.loginUser);
		
		if(list.isEmpty()) {
			System.out.println("���� ������ �����ϴ�");
		}else {
			for(MailVO mail : list) {
				System.out.println("--------------------------");
				System.out.println("������� : " + mail.getReceiver());
				System.out.println("���� : " + mail.getTitle());
				System.out.println("���� : " + mail.getDetail());
			}
		}
	}
}

    
