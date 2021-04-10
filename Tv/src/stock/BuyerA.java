package stock;

public class BuyerA implements Buyer {
    Stock stock;
	@Override
	public void update(double price) {
		// TODO Auto-generated method stub
        System.out.println("股票价格变化："+price);
	}

}
