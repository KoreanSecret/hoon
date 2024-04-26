package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ui.MailUI;
import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MailVO;
import kr.ac.kopo.vo.MemberVO;

public class MailDAO {

	public void insert(MailVO board) {

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO Mail(mail_cd,sender, receiver,title,detail) ");
		sql.append("VALUES(SEQ_MAIL_MAIL_CD.nextval, ?, ?, ?, ?) ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			
	
			pstmt.setString(1, MailUI.loginUser.getId());
			pstmt.setString(2, board.getReceiver());
			pstmt.setString(3, board.getTitle());
			pstmt.setString(4, board.getDetail());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public  List<MailVO> selectMail(MemberVO loginuser) {
		
		List<MailVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM MAIL WHERE receiver = ? and status = 1");
		
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
		pstmt.setString(1, loginuser.getId());
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String sender = rs.getString("sender");			
			String title = rs.getString("title");
			String detail = rs.getString("detail");
			MailVO mail = new MailVO(sender,title,detail);
			list.add(mail);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	
	}
	
	public  List<MailVO> selectsMail(MemberVO loginuser) {
		
		List<MailVO> list = new ArrayList<>();
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM MAIL WHERE sender = ? and status = 1");
		
		
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
		pstmt.setString(1, loginuser.getId());
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String receiver = rs.getString("receiver");
			String title = rs.getString("title");
			String detail = rs.getString("detail");
			MailVO mail = new MailVO(receiver,title,detail);
			list.add(mail);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		return list;
	
	}
	
		public MailVO deleteBoard(MailVO mailVO) {
			StringBuilder sql = new StringBuilder();
			sql.append("update mail ");
			sql.append("set status = 0 ");
			sql.append("where mail_cd = ?");
		
			try (Connection conn = new ConnectionFactory().getConnection();
					PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
				pstmt.setString(1, mailVO.getMail_cd());
				int cnt = pstmt.executeUpdate();
				
				if(cnt >0) {
					System.out.println("******삭제가 완료되었습니다*******");
				}else {
					System.out.println("찾을수 없는 메일입니다 다시 시도해주세요");
				}
			}
			 catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}	
		
        public List<MailVO> dieBoard(){
        	List<MailVO> list = new ArrayList<>();
        	StringBuilder sql = new StringBuilder();
        	sql.append(" SELECT * ");
        	sql.append("   from MAIl ");
        	sql.append("  where status = 0");
        	sql.append("    and ( sender = ? or");
        	sql.append("          receiver = ? ) ");
        	
        	try( Connection conn = new ConnectionFactory().getConnection(); 
        			PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
        		pstmt.setString(1, MailUI.loginUser.getId());
        		pstmt.setString(2, MailUI.loginUser.getId());
        		ResultSet rs = pstmt.executeQuery();
        		while(rs.next()) {
        			String mail_cd = rs.getString("mail_cd");
        			String sender = rs.getString("sender");
        			String receiver = rs.getString("receiver");
        			String title = rs.getString("title");
        			String detail = rs.getString("detail");
        			MailVO mail = new MailVO(mail_cd,sender,receiver,title,detail);
        			list.add(mail);
        		}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
        	return list;
        }
		
			
}