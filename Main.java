//This program is built to help people in the city of San Bernardino
//     get around more easily by matching user information with other people. This will" +
//     effectively relieve traffic around the city by removing the need of using multiple cars" +
//     to travel, and will also allow people to get to their destinations faster by being" +
//     able to access the carpool lanes around the freeway.

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    // Create Rider object
        Rider rider = new Rider();


        // Declare variables
        String name;
        String location_start;
        String location_end;
        String time_start;
        String time_end;
        String day;


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scan.nextLine();
        rider.set_name(name);

        System.out.print("Enter your starting point: ");
        location_start = scan.nextLine();
        rider.set_location_start(location_start);

        System.out.print("Enter your destination: ");
        location_end = scan.nextLine();
        rider.set_location_end(location_end);

        System.out.print("Enter your time of departure: ");
        time_start = scan.nextLine();
        rider.set_time_leave(time_start);

        System.out.print("Enter your expected time of arrival: ");
        time_end = scan.nextLine();
        rider.set_time_arrive(time_end);

        System.out.print("Enter the day of your trip: ");
        day = scan.nextLine();
        rider.set_day(day);

        System.out.println("\nThe rider's information:");
        rider.print();



    }
}
