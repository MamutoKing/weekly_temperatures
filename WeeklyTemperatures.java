import java.util.Scanner;

public class WeeklyTemperatures { 
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        //Declare Arrays and index
        String weekDay[] = {"Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int tempAVG[] = {79, 81, 77, 83, 85, 83, 86};
        String input;
        int i;

        //Propt user to enter Average temperatures
        System.out.println("Enter \"week\" to see average teperatures for each day this week.");
        input = scnr.nextLine();

        //initiate scnr input and loop execution
        if (input.equalsIgnoreCase("week")) {
            for (i = 0; i < weekDay.length; ++i) {
                System.out.println(weekDay[i] + ": " + tempAVG[i] + "°F");
            }
        }
        else { 
            System.out.println("Invalid input.");
        }

        scnr.close();
    }

}