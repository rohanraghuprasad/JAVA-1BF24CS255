import java.util.Scanner;
import java.lang.Math;
class quadratic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a, b and c coefficients");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==0)
        {
            System.out.println("Not a quadratic equation");
        }
        else
        {
            double r1, r2;
            int d=b*b-4*a*c;
            if(d==0)
            {
                System.out.println("Roots are real and equal");
                r1=-b/(2*a);
                System.out.println("r1=r2="+r1);
            }
            else if(d>0)
            {
                System.out.println("Roots are distinct");
                r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
                r2=((-b) - (Math.sqrt(d)))/(double)(2*a);
                System.out.println("r1="+r1);
                System.out.println("r2="+r2);
            }
            else if(d<0)
            {
                System.out.println("Roots are imaginary");
                r1=(-b)/(2*a);
                r2=Math.sqrt(-d)/(2*a);
                System.out.println("r1="+r1);
                System.out.println("r2="+r2);
            }
        }
    }
}