package test3;

public class Foot extends Additional {
    Foot (SalesTicket ticket){ super(ticket); }
    public void printTicket(){
       ticket.printTicket();
       System.out.println("这是票据的脚注！");          
   }
};