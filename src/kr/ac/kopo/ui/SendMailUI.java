package kr.ac.kopo.ui;


import kr.ac.kopo.vo.MailVO;

public class SendMailUI extends BaseUI {

	private int type;

	@Override
	public void execute() throws Exception {
		System.out.println("*****메일보내기*****");
		String receiver = scanStr("보낼 사람 이메일을 입력하세요 : ");
		String title = scanStr("제목을 입력하세요 : ");
		String detail = scanStr("내용을 입력하세요 : ");
		
		

		eService.addBoard(new MailVO(receiver, title, detail));
		System.out.println("******메일을 보냈습니다 ********");

	}

	private int choiceMenu() {

		return type;
	}

}
