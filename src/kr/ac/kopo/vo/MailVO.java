package kr.ac.kopo.vo;

public class MailVO {
		
		private String mail_cd;
	    private String sender;
	    private String receiver;
	    private String title;
	    private String detail;
	    private int    status;
	   // private String eliminate;
	   // private String prchange;
	   // private String store;
	    //private String trash;
	   // private String inbox;
	    //private String sent;
	    
	   
	  public MailVO(String sender,String receiver,String title,String detail) {
		  super();
		  this.sender = sender;
		  this.receiver = receiver;
		  this.title = title;
		  this.detail = detail;
	  }
	  
	    
	    
		






		public MailVO(String mail_cd, String sender, String receiver, String title, String detail) {
		super();
		this.mail_cd = mail_cd;
		this.sender = sender;
		this.receiver = receiver;
		this.title = title;
		this.detail = detail;
	}





		public MailVO() {
			super();
		}

		public MailVO(String sender,String receiver, String title, String detail,int status) {
			super();
			this.sender = sender;
			this.receiver = receiver;
			this.title = title;
			this.detail = detail;
			this.status = status;
			//this.eliminate = eliminate;
			//this.prchange = prchange;
			//this.store = store;
			//this.trash = trash;
			//this.inbox = inbox;
			//this.sent = sent;
		}
		
		

		public String getMail_cd() {
			return mail_cd;
		}




		public void setMail_cd(String mail_cd) {
			this.mail_cd = mail_cd;
		}




		public MailVO(String mail_cd,String sender, String receiver, String title, String detail, int status) {
			super();
			this.mail_cd = mail_cd;
			this.sender = sender;
			this.receiver = receiver;
			this.title = title;
			this.detail = detail;
			this.status = status;
			
			
		}




		

		public MailVO(String receiver, String title, String detail) {
			super();
			this.receiver = receiver;
			this.title = title;
			this.detail = detail;
		}




		public String getSender() {
			return sender;
		}

		public void setSender(String sender) {
			this.sender = sender;
		}
		public String getReceiver() {
			return receiver;
		}

		public void setReceiver(String receiver) {
			this.receiver = receiver;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDetail() {
			return detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}
		
		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		/*public String getEliminate() {
			return eliminate;
		}

		public void setEliminate(String eliminate) {
			this.eliminate = eliminate;
		}

		public String getPrchange() {
			return prchange;
		}

		public void setPrchange(String prchange) {
			this.prchange = prchange;
		}
		

		public String getTrash() {
			return trash;
		}

		public void setTrash(String trash) {
			this.trash = trash;
		}

		public String getInbox() {
			return inbox;
		}

		public void setInbox(String inbox) {
			this.inbox = inbox;
		}

		public String getSent() {
			return sent;
		}

		public void setSent(String sent) {
			this.sent = sent;
		}*/

		@Override
		public String toString() {
			return "MailVO [sender=" + sender +",receiver=" +receiver + ", title=" + title 
					+ ", detail=" + detail +", status =" +status +"]";
		}
}
		

    