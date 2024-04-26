package kr.ac.kopo.ui;

import kr.ac.kopo.vo.MemberVO;

public class  LoginUI extends BaseUI {

	
	@Override
	public void execute() throws Exception {
        
		System.out.println("<<< 로그인 서비스 >>>");
		String id = scanStr("아이디를 입력하세요  : ");
		String pwd = scanStr("비밀번호를 입력하세요 : ");
		MemberVO all = new MemberVO();
		all.setId(id);
		all.setPwd(pwd);
		MemberVO Member = mService.searchAllBoard(all);
		// 아이디 비번 확인
		
		if(Member != null) {
			System.out.println(Member.getName() + "님 로그인에 성공하였습니다");
			MailUI.loginUser = Member;
			new MailUI().execute();
		} else {
			System.out.println("아이디와 비밀번호를 확인하세요");
			
		}
		
	}

}

