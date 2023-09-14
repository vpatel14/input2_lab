import java.util.Scanner;

public class Input2
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String stringOne, stringTwo, stringThree;
        int intOne;

        System.out.print("Enter your first name: ");
        stringOne = keyboard.next();
        System.out.print("Enter your last name: ");
        stringTwo = keyboard.next();

        System.out.print("enter your favorite number");
        intOne = keyboard.nextInt();

        System.out.println("Hey" + stringOne  +stringTwo);
        System.out.println(intOne  +  "is a cool number");
    }
}