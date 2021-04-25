package stock;

public interface Stock {
    public void addBuyer(Buyer buyer);
    public void deleteBuyer(Buyer buyer);
    public void noticeBuyer();
    public void setPrice(double price);
    public double getPrice();
}
