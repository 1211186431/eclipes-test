package test3;

public class Additional extends SalesTicket{
	   SalesTicket  ticket;
	   Additional(SalesTicket  ticket) { this.ticket = ticket;}
	   public  void  printTicket(){
	        ticket.printTicket();
	      }
	};