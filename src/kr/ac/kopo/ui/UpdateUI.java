package kr.ac.kopo.ui;

public class UpdateUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		System.out.println("<<< 회원가입 서비스 >>>");
		String name = scanStr("이름을 입력하세요 : ");
		String id = scanStr("아이디를 입력하세요  : ");
		String pwd = scanStr("비밀번호를 입력하세요 : ");
		String pn     = scanStr("핸드폰 번호를 입력하세요 : ");
		String bd     = scanStr("생년월일을 입력하세요 : ");
		String member_cd = scanStr("한명이 추가되었습니다 ");
		
		//
		
		System.out.println("[" + member_cd + "]번 사람이 회원가입을 하였습니다.");
	}

}
