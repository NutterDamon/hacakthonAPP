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
        String name;      // Name of user
        String street_number;   // Address of user
        String street_name;
        String city;
        String state;
        String address;
        int hour;         //
        int minutes;
        String day;       // Day of trip
        int driver;       // Determines whether the user is a driver
        int i = 0;
        int distance;

        while(i != 2)
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

            System.out.print("\nAre you a driver?(Enter 1 for Yes): ");
            driver = in.nextInt();
            rider.set_is_driver(driver == 1);
            if (rider.get_is_driver())
            {
                System.out.print("Enter your distance preference(In miles): ");
                distance = in.nextInt();
                rider.set_driver_distance_preference(distance);
            }

            // Prompt user for day
            in.nextLine();
            System.out.print("\nEnter the day: ");
            day = in.nextLine();
            rider.set_day(day);

            //list.add(rider);
            list.add(rider);

            System.out.println();
            i++;
        }

        System.out.println();
        System.out.println();
        for (int j = 0; j < list.size(); j++)
        {
            list.get(j).print();
        }

    }
}
