import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int birthMonth = 0;

        System.out.println("Enter your birth month: ");

        //if (in.hasNextInt()) // user entered a number correctly
        //{
           // favNum = in.nextInt();
           // in.nextLine();
        if (scanner.hasNextInt()) {
            birthMonth = scanner.nextInt();
            scanner.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("your month is " + birthMonth);
            } else {
                System.out.println("you said your fav num is: " + birthMonth);
                System.out.println("But, that is not in the range of [1 - 12]");
            }
        }
        //else {
            //System.out.println("Invalid input. Please enter a valid number.");
           // birthMonth = scanner.nextInt();
        //}

        scanner.close();
    }
}

//step one: get user to enter birth month[1 - 12]
// step two: if correct input will say the number
// step three: will say invalid and force them to retry