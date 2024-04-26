package kr.ac.kopo.vo;

public class MemberVO {
	public static  MemberVO loginUser;
	private int member_cd;
	private String name;
	private String id;
	private String pwd;
	private String pn;
	private String bd;
	private String regdate;
	
	public MemberVO(int member_cd, String name, String id, String pwd, String pn, String bd, String regdate) {
		super();
		this.member_cd = member_cd;
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.pn = pn;
		this.bd = bd;
		this.regdate = regdate;
	}
	
	public MemberVO(String name, String id, String pwd, String pn, String bd) {
		super();
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.pn = pn;
		this.bd = bd;
	}

	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static MemberVO getLoginUser() {
		return loginUser;
	}
	public static void setLoginUser(MemberVO loginUser) {
		MemberVO.loginUser = loginUser;
	}
	public int getMember_cd() {
		return member_cd;
	}
	public void setMember_cd(int member_cd) {
		this.member_cd = member_cd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPn() {
		return pn;
	}
	public void setPn(String pn) {
		this.pn = pn;
	}
	public String getBd() {
		return bd;
	}
	public void setBd(String bd) {
		this.bd = bd;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "MemberVO [member_cd=" + member_cd + ", name=" + name + ", id=" + id + ", pwd=" + pwd + ", pn=" + pn
				+ ", bd=" + bd + ", regdate=" + regdate + "]";
	}
}
	
