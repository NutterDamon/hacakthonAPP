//This program is built to help people in the city of San Bernardino
//     get around more easily by matching user information with other people. This will" +
//     effectively relieve traffic around the city by removing the need of using multiple cars" +
//     to travel, and will also allow people to get to their destinations faster by being" +
//     able to access the carpool lanes around the freeway.

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        // Create an ArrayList to hold all objects
        ArrayList<Rider> list = new ArrayList();

        // Create scanner to take input from users
        Scanner in = new Scanner(System.in);

        // Declare variables
        String name;
        String street_number;
        String street_name;
        String city;
        String state;
        String address;
        int hour;
        int minutes;
        String day;       // Day of trip
        int driver;       // Determines whether the user is a driver
        int i = 0;
        double distance;     // Preferred radius distance for driver



        while(i++ != 2)
        {

            // Create Rider object
            Rider rider = new Rider();



            // Prompt the user for a name
            System.out.print("Enter your name: ");
            name = in.nextLine();
            rider.set_name(name);

            // Prompt user for address
            System.out.println("\nEnter your address");
            System.out.print("Street Number: ");
            street_number = in.nextLine();
            System.out.print("Street Name: ");
            street_name = in.nextLine();
            System.out.print("City: ");
            city = in.nextLine();
            System.out.print("State: ");
            state = in.nextLine();
            rider.set_address(street_number, street_name, city, state);

            // Ask user whether he or she will be driving
            System.out.print("\nAre you a driver?(Enter 1 for Yes): ");
            driver = in.nextInt();
            rider.set_is_driver(driver == 1);

            // If user will be drving, then ask for radius distance preference
            if (rider.get_is_driver())
            {
                System.out.print("Enter your distance preference(In miles): ");
                distance = in.nextInt();
                rider.set_driver_distance_preference(distance);
            }

            // Prompt user for day of trip
            in.nextLine();
            System.out.print("\nEnter the day: ");
            day = in.nextLine();
            rider.set_day(day);

            // Prompt user for time of trip
            System.out.println("Enter the time of departure");
            System.out.print("Enter the hour: ");
            hour = in.nextInt();
            System.out.print("Enter the minutes: ");
            minutes = in.nextInt();
            rider.set_time_leave(hour, minutes);

            System.out.println("Enter the time of return");
            System.out.print("Enter the hour: ");
            hour = in.nextInt();
            System.out.print("Enter the minutes: ");
            minutes = in.nextInt();
            in.nextLine();
            rider.set_time_return(hour, minutes);

            // Add the Rider object into an ArrayList of Rider objects
            list.add(rider);

            System.out.println();
        }

        System.out.println();
        System.out.println();
//        for (int j = 0; j < list.size(); j++)
//        {
//            list.get(j).print();
//            System.out.println();
//        }


        // Create Compare object to compare the information of the riders
        // and find a match between them
        Compare comp = new Compare(list.get(0), list);

        try {
            if (comp.find_match() != "NULL") {
                System.out.println("There was a match!");
                System.out.println("The following is the information of your match:");
                System.out.println("Name: " + comp.find_match());
                System.out.println(comp.find_match() + " lives " + comp.get_distance_between_addresses()
                        + " miles away from you.");
            } else
                System.out.println("Sorry, there was no match for your specific settings.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

