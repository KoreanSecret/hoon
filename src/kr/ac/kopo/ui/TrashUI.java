package kr.ac.kopo.ui;

import java.util.List;

import kr.ac.kopo.vo.MailVO;

public class TrashUI extends BaseUI {

	@Override
	public void execute() throws Exception {
       List<MailVO> list = eService.dieBoard();
       
       if(list.isEmpty()) {
    	   System.out.println("������ ������ �����ϴ�");
       }else {
    	  System.out.println("--------------------------------------");
    	  System.out.println(" \t ������ �� �Դϴ�");
    	  System.out.println("----------------------------------------");
    	  System.out.println("��ȣ\t ������� \t ������� \t\t ���� \t\t����");
    	  for(MailVO mailVO : list) {
    		  System.out.println(mailVO.getMail_cd()+"\t" +  mailVO.getSender()+ "\t\t" + mailVO.getReceiver()
    		  + "\t\t" +mailVO.getTitle() + "\t\t" + mailVO.getDetail());
    	   }
       }
       
  
		
		
	}

	
	
}
