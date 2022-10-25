import java.util.Scanner;

public class Perfectsquares {
    public static void main(String[] args)
    {
        double result;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter two input number");
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Perfect Square number between"+"\t"+n1+"\t" +"and"+"\t"+n2+"\t");
        int i;
        for (i=n1;i<=n2;i++)
        {
            result=Math.sqrt(i);
            if(result ==(int)Math.sqrt(i))
            {
                System.out.println(i);
            }
        }
    }
}
