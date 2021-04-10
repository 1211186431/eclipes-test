package stock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Buyer buyerA=new BuyerA();
       Stock stockA=new StockA(100);
       stockA.addBuyer(buyerA);
       stockA.setPrice(200);    		   
	}

}
