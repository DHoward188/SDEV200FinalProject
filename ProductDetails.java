// Dylan Howard
// Final Project SDEV200
import javax.swing.*;
public class ProductDetails extends Product {
    // Constuctor
    public ProductDetails()
    {
        super(); 
    } 
    // The following three methods used to get user input to a variable
    @Override
    public void setProductName()
    {
        String entry; 
        entry = JOptionPane.showInputDialog (null, "Enter Product name ");
        productName = entry;
    }
    @Override
    public void setPrice()
    {
        String entry; 
        // Ensures the user inputs a number
        try 
        {
        entry = JOptionPane.showInputDialog (null, "Enter Product price ");
        price = Double.parseDouble(entry); 
        }
        // Catching the wrong input type and setting it to 0
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(null, "This field accepts digits only!");
            price = 0;
        }
    }
    @Override
    public void setOrderCount()
    {
        String entry;
        // Ensures the user inputs a number
        try
        {
            entry = JOptionPane.showInputDialog (null, "Enter the number of the product ordered "); 
            orderCount = Integer.parseInt(entry);
        }
        // Catching the wrong input type and setting it to 0
        catch(NumberFormatException exception) 
        { 
            JOptionPane.showMessageDialog(null, "This field accepts digits only!");
            orderCount = 0;
        }
    }
    // This method multipies the order count and the price to calculate the total price of the order
    @Override
    public void setTotPrice()
    {
        totPrice = orderCount * price;
    }
}
