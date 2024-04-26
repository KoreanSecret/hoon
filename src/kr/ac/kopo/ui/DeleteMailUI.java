package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MailVO;

public class DeleteMailUI extends BaseUI {


		

		@Override
		public void execute() throws Exception {
			String mail_cd = scanStr("삭제할 이메일을 입력하세요 : ");
			
			MailVO mailVO = new MailVO();
			
			mailVO.setMail_cd(mail_cd);
			 mailVO = eService.deleteBoard(mailVO);
					 
			
			
					
}
	
		
}