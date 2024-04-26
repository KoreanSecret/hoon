package kr.ac.kopo.ui;

import java.util.Scanner;

import kr.ac.kopo.service.MailService;
import kr.ac.kopo.service.MailServiceFactory;
import kr.ac.kopo.service.MemberService;
import kr.ac.kopo.service.MemberServiceFactory;

public abstract class BaseUI implements IBoardUI{

	protected Scanner sc ;
	protected MemberService mService;
	protected MailService eService;
	
	public BaseUI() {
		sc = new Scanner(System.in);
		//service = new BoardService();
		mService = MemberServiceFactory.getInstance();
		eService = MailServiceFactory.getInstance();
		}
	
	protected String scanStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
	protected int scanInt(String msg) {
//		System.out.print(msg);
//		return Integer.parseInt(sc.nextLine());
		return Integer.parseInt(scanStr(msg));
	}

}
