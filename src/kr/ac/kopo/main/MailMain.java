package kr.ac.kopo.main;

import kr.ac.kopo.ui.MemberUI;

public class MailMain {

	public static void main(String[] args) {
          MemberUI ui = new MemberUI();
          try {
        	  ui.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
