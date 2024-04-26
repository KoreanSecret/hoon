package kr.ac.kopo.service;

import kr.ac.kopo.dao.MemberDAO;
import kr.ac.kopo.vo.MailVO;
import kr.ac.kopo.vo.MemberVO;

public class MemberService {
	private MemberDAO dao;
	
	public MemberService() {
		dao = new MemberDAO();
	}
	
	public void addBoard(MemberVO board) {
		
		dao.insert(board);
	}

	

	public MemberVO searchAllBoard(MemberVO Member) {
		
		MemberVO member = dao.selectMember(Member);
		return member;
	}

	public void addBoard(MailVO mailVO) {
		
	}
	
	/*public List<MemberVO> searchAllBoard() {
		List<MemberVO> list = dao.selectAll();
		return list;*/
	}

