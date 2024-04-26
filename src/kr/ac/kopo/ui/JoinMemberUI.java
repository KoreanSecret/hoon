package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class JoinMemberUI extends BaseUI {

	private int type;

	@Override
	public void execute() throws Exception {
		System.out.println("*****회원가입*****");
		String name = scanStr("이름을 입력하세요 : ");
		String id = scanStr("아이디를 입력하세요 : ");
		String pwd = scanStr("비밀번호를 입력하세요 : ");
		String pn = scanStr("핸드폰 번호를 입력하세요 : ");
		String bd = scanStr("생년월일을 입력하세요 : ");

		mService.addBoard(new MemberVO(name, id, pwd, pn, bd));
		System.out.println("******회원가입이 완료되었습니다 ********");

	}

	private int choiceMenu() {

		return type;
	}

}
