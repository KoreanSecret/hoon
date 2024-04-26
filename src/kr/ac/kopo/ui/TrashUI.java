package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public class TrashUI extends BaseUI {

	@Override
	public void execute() throws Exception {
       List<MailVO> list = eService.dieBoard();
       
       if(list.isEmpty()) {
    	   System.out.println("삭제된 메일이 없습니다");
       }else {
    	  System.out.println("--------------------------------------");
    	  System.out.println(" \t 휴지통 함 입니다");
    	  System.out.println("----------------------------------------");
    	  System.out.println("번호\t 보낸사람 \t 받은사람 \t\t 제목 \t\t내용");
    	  for(MailVO mailVO : list) {
    		  System.out.println(mailVO.getMail_cd()+"\t" +  mailVO.getSender()+ "\t\t" + mailVO.getReceiver()
    		  + "\t\t" +mailVO.getTitle() + "\t\t" + mailVO.getDetail());
    	   }
       }
       
  
		
		
	}

	
	
}
