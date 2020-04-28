import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      for(int i=1;i<=a;i++)
      {
        if(i%2==0)
        {
          continue;
        }
        else
        {
          System.out.println(i);
        }
      }
      
	}
}