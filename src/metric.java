import java.util.Scanner;

public class metric
{

    public static void main(String[] args)
    {
	// convert meters to miles, feet, inches
        Scanner in = new Scanner(System.in);
        double meters = 0;
        double miles; // meters * 0.000621
        double feet; // meters * 3.28084
        double inches; // meters * 39.37
        String trash;


        System.out.print(" Please enter a measurement in meters: ");

        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine(); // Clear buffer
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid number and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        miles = meters * 0.000621;
        feet = meters * 3.28084;
        inches = meters * 39.37;

        System.out.println("You entered the measurement " + meters + " meters. \n This converts to " + miles + " miles, or " + feet + " feet, or " + inches + " inches. ");
    }
}
