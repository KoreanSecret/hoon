package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.vo.MemberVO;

public class MemberDAO {

	public MemberVO insert(MemberVO Member) {

		StringBuilder sql = new StringBuilder();
		sql.append("insert into tbl_member(member_cd, name, id,pwd,pn,bd) ");
		sql.append(" values(seq_tbl_member_cd.nextval, ?, ?, ?, ?, ?) ");

		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			String name = Member.getName();
			String id = Member.getId();
			String pwd = Member.getPwd();
			String pn = Member.getPn();
			String bd = Member.getBd();
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pwd);
			pstmt.setString(4, pn);
			pstmt.setString(5, bd);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		MemberVO member = new MemberVO(Member.getName(), Member.getId(),Member.getPwd() ,Member.getPn(), Member.getBd());
		return member;

	}

	public MemberVO selectMember(MemberVO Member) {
		StringBuilder sql = new StringBuilder();
		sql.append("select * from tbl_member where id = ? and pwd = ?");
		MemberVO member = null;
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());
				){
			pstmt.setString(1, Member.getId());
			pstmt.setString(2, Member.getPwd());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String lname  = rs.getString("name");
				String lid = rs.getString("id");
				String lpwd = rs.getString("pwd");
				String lpn  = rs.getString("pn");
				String lbd  = rs.getString("bd");
				member = new MemberVO(lname,lid,lpwd,lpn,lbd);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	  /*public List<MemberVO> selectAll() {
	  
	  List<MemberVO> list = new ArrayList<>();
	  
	  StringBuilder sql = new StringBuilder();
	  sql.append("select member_cd, name, id,pwd,pn,bd ");
	  sql.append("     , to_char(regdate, 'yyyy-mm-dd') regdate ");
	  sql.append("  from tbl_member ");
	  
	 
		  
	 
	  try( Connection conn = new ConnectionFactory().getConnection();
	  PreparedStatement pstmt = conn.prepareStatement(sql.toString()); ) {
	  ResultSet rs = pstmt.executeQuery();
	  
	  while(rs.next()) { int member_cd = rs.getInt("member_cd"); String name =
	  rs.getString("name"); String id = rs.getString("id"); String pwd =
	  rs.getString("pwd"); String pn = rs.getString("pn"); String bd = rs.getString("bd"); 
	   String regdate = rs.getString("regdate");
	 
	  MemberVO board = new MemberVO(member_cd, name, id ,pwd ,pn , bd,
	  regdate); list.add(board); }
	  
	 
	  
	  
	  } catch (Exception e) { e.printStackTrace(); }
	  
	  return list; }*/
	 
}
}