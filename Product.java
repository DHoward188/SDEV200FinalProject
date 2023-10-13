// Dylan Howard
// Final Project SDEV200
public abstract class Product 
{
    // Variable delaration 
    protected String productName;
    protected double price;
    protected int orderCount;
    protected double totPrice;
    // Constuctor 
    public Product(){
        // Use set methods to get user inputs
        setProductName();
        setPrice();
        setOrderCount();
        setTotPrice();
    }
    public abstract void setProductName();
    public abstract void setPrice();
    public abstract void setOrderCount();
    public abstract void setTotPrice();
    // the following four methods return the declared variables to be printed later 
    public String getProductName() 
    {
        return productName; 
    }
    public double getPrice()
    {
        return price;
    }
    public int getOrderCount()
    {
        return orderCount;
    }
    public double getTotPrice()
    {
        return totPrice;
    }
    // The message printed 
    public String toString() 
    {
        return("You ordered " + getOrderCount() + " " + getProductName() + ". Each worth $" + getPrice() + " Individually. The total cost is $" + getTotPrice() + ".");
    } 
}
