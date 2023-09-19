import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String firstName = "";
        String lastName = "";
        String fullName = "";
        String trash = "";
        int favNum = 0; //1 -10
        double salary = 0.0;

        Scanner in = new Scanner(System.in);

        //This is the way that we do a prompt using print instead of println
        System.out.print("Enter your first name: ");
        //ln makes it go to the next line print will make it display the prompt
        firstName = in.nextLine();

        System.out.println("You told me your first name is: " + firstName );

        System.out.print("Enter your last name: ");
        lastName = in.nextLine();

        System.out.println("You told me your last name is: " + lastName);

        fullName = firstName + " " + lastName;

        System.out.println("I am guessing that your full name is: " + fullName);

        //OK now lets read some numbers

        System.out.println("Enter your fav number [1 - 10]: ");
        if (in.hasNextInt())
        {
            favNum = in.nextInt();
            in.nextLine(); //Clear the newline / enter from the buffer
            System.out.println("you said your fav num is: " + favNum);
        }
        else // dont have a number Must read buffer as a trash string
        {
            trash = in.nextLine();
            System.out.println("You told me " + trash);
            System.out.println("Run the program again and do the input correctly");

        }
    }
}