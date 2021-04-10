package test3;

public class Head extends Additional {
    Head (SalesTicket ticket){ super(ticket); }
    public void printTicket(){
       System.out.println("这是票据的台头！");
       ticket.printTicket();
   }
};
