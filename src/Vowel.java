import java.util.Scanner;

public class Vowel {

    public static void main(String[] args)
    {
        boolean bool=false;

        System.out.println("Enter a charecter:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                bool = true;
        }
        if (bool == true) {
            System.out.println("Entered Charecter is Vowel");
        }
        else
        {
            System.out.println("Entered Charecter is Consonent");


        }

    }
}
