package kr.ac.kopo.service;

import java.util.List;

import kr.ac.kopo.dao.MailDAO;
import kr.ac.kopo.vo.MailVO;
import kr.ac.kopo.vo.MemberVO;

public class MailService {
	private MailDAO dao;

	public MailService() {
		dao = new MailDAO();
	}

	public void addBoard(MailVO mail) {
		dao.insert(mail);
	}

	public  List<MailVO> searchMail(MemberVO loginUser) {
		List<MailVO> list = dao.selectMail(loginUser);
		return list;
	}

	public  List<MailVO> searchsMail(MemberVO loginUser) {
		List<MailVO> list = dao.selectsMail(loginUser);
		return list;
	}

	public MailVO deleteBoard(MailVO mailVO) {
		dao.deleteBoard(mailVO);
		return mailVO;
		
	}
	public List<MailVO> dieBoard(){
		List<MailVO> list = dao.dieBoard();
		return list;
	}

	
	

}
