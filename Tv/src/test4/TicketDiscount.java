package test4;

public class TicketDiscount {
      Discount discount;
      public void setDiscount(Discount discount) {
    	  this.discount=discount;
      }
      public double BuyTicket(double price) {
    	  return this.discount.discountMethod(price);
      }
}
