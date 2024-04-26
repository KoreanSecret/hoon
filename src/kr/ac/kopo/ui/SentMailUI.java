package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public  class SentMailUI extends BaseUI {
	
	@Override
	public void execute() throws Exception{
		List<MailVO> list = eService.searchsMail(MailUI.loginUser);
		
		if(list.isEmpty()) {
			System.out.println("보낸 메일이 없습니다");
		}else {
			for(MailVO mail : list) {	
				System.out.println("----------------------");
				System.out.println("받은 사람 : " + mail.getReceiver());
				System.out.println("제목 : " + mail.getTitle());
				System.out.println("내용 : " + mail.getDetail());
			}
			
		}
	}

	
	
}
