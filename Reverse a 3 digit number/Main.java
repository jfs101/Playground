import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int last = n % 10;
    int s_last = (n / 10) % 10;
    int first = n / 100;
    int rev = last * 100 + s_last * 10 + first;
    System.out.print(rev);
  }
}