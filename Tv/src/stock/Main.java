package stock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       Stock stockA=new StockA(100);
       Buyer buyerA=new BuyerA(stockA);
       stockA.setPrice(101);
       stockA.setPrice(120);
       stockA.setPrice(200);    		   
	}

}
