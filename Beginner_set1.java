import java.util.Scanner;
class Beginner_set1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<0)
        {
            System.out.println("Negative");
        }
        else if(a>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Zero");
        }
    }
    
}
