package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MailVO;

public class DeleteMailUI extends BaseUI {


		

		@Override
		public void execute() throws Exception {
			String mail_cd = scanStr("������ �̸����� �Է��ϼ��� : ");
			
			MailVO mailVO = new MailVO();
			
			mailVO.setMail_cd(mail_cd);
			 mailVO = eService.deleteBoard(mailVO);
					 
			
			
					
}
	
		
}