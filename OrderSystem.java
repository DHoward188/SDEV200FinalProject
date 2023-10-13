// Dylan Howard
// Final Project SDEV200
import java.io.PrintWriter;
import javax.swing.*; 
public class OrderSystem 
{
    public static void main(String[] args)
    {
        // Used to display array later
        String display = "";
        // Used to set array size
        String size = JOptionPane.showInputDialog("How Many different orders will you make");
        int orderSize = Integer.parseInt(size);
        // Creating an array 
        ProductDetails[] products = new ProductDetails[orderSize];
        // For loop to add input by the number of the order size
        for (int i = 0; i < orderSize; i++)
        {
            // Get inputs
            products[i] = new ProductDetails();
            // Adds inputs to the display variable to display later
            display = display + products[i] + "\n";
        }
        // Displays the array
        JOptionPane.showMessageDialog(null, "\nOrder descriptions:\n" + display);
        try
        {
            // Creating a file for the inputed data
            PrintWriter pr = new PrintWriter("ProductDescription.txt");    
            // Prints the array in the newly created file
            for (int i=0; i<products.length ; i++)
            {
                pr.println(products[i]);
            }
            pr.close();
        }
        // Exception if the file is not found
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }
    }
}