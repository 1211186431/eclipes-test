package test3;

public class Head extends Additional {
    Head (SalesTicket ticket){ super(ticket); }
    public void printTicket(){
       System.out.println("����Ʊ�ݵ�̨ͷ��");
       ticket.printTicket();
   }
};
