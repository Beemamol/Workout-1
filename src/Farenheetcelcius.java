import java.util.Scanner;
public class Farenheetcelcius {

    public static void main(String arg[])
    { float c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature:");
        float f=s.nextFloat();
        c=((f-32)*5)/9;
        System.out.println("Celsius temperature is :"+c);
    }



}
