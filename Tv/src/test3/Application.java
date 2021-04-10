package test3;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesTicket t = new SalesTicket();
		   t.printTicket();
		   System.out.println("-----------------");
		   SalesTicket f = new Foot(t);
		   SalesTicket b = new Head(f);
		   b.printTicket(); 
	}

}
