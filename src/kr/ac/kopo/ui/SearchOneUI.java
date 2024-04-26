package kr.ac.kopo.ui;

public class SearchOneUI extends BaseUI {

	@Override
	public void execute() throws Exception {

		int name = scanInt("이름을 입력하세요 : ");
		String id = scanStr("아이디를 입력하세요 : ");
		String pwd = scanStr("비밀번호를 입력하세요 : ");
		
		
		
		//
		
		System.out.println("----------------------------");
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " );
		System.out.println("----------------------------");
		
	}

}
