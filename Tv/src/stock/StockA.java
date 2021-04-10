package stock;

import java.util.ArrayList;

public class StockA implements Stock {
    ArrayList<Buyer> list;
    double price;
    
     public StockA(double price) {
		// TODO Auto-generated constructor stub
    	 list=new ArrayList<Buyer>();
    	 this.price=price;
	}
	@Override
	public void addBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
       list.add(buyer);
	}

	@Override
	public void deleteBuyer(Buyer buyer) {
		// TODO Auto-generated method stub
        list.remove(buyer);
	}

	@Override
	public void noticeBuyer() {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			Buyer buyer=list.get(i);
			buyer.update(this.price);
		}
	}
	
	public void setPrice(double price) {
		if(this.price!=0 &&(Math.abs(this.price-price))/this.price>0.05) {
			this.price=price;
			this.noticeBuyer();
		}
		else {
			this.price=price;
		}
	}
	
	public double getPrice() {
		return this.price;
	}

}
