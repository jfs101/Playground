import java.util.Scanner;

class Item
{
  private String product_id;
  private int price;
    
  public void set_price(int p)
  {
      price = p;
  }
  
  public String return_product_id()
  {
    return product_id;
  }
  public int return_price()
  {
      return price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  
  public void Customer_data(String p ,int q)
  {
      product = p;
      quantity = q;
  }
  public int quantity()
  {
      return quantity;
  }
}

class Bill
{
//  Item i = new Item();
//  Customer c = new Customer();
  
  public void print()
  {
      //System.out.println(i.return_price());
  }
}
class Main {
	public static void main (String[] args){
    //Scanner sc = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
        String p_id = sc.nextLine();
        int p = sc.nextInt();
        int q = sc.nextInt();
        
        Item i = new Item();
        Customer c = new Customer();
        Bill b = new Bill();
        
        i.set_price(p);
        c.Customer_data(p_id ,q);
        //b.print();
        System.out.println("Total Price is : "+i.return_price()*c.quantity());
    
  }
}