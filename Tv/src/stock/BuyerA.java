package stock;

public class BuyerA implements Buyer {
	Stock stock;
    public BuyerA(Stock stock) {
		// TODO Auto-generated constructor stub
    	stock.addBuyer(this);
    	this.stock=stock;
    	System.out.println("����۸�"+this.stock.getPrice());
	}
	@Override
	public void update(double price) {
		// TODO Auto-generated method stub
        System.out.println("��Ʊ�¼۸�"+price);
	}

}
