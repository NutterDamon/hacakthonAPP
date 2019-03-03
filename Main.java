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
        // Create a Vector
        ArrayList<Rider> list = new ArrayList();

        // Create scanner to take input from users
        Scanner scan = new Scanner(System.in);

        // Declare variables
        String name;
        String address;
        int hour;
        int minutes;
        String time_end;
        String day;

        int i = 0;

        Rider[] array = new Rider[2];

        while(i != 2)
        {
            // Create Rider object
            Rider rider = new Rider();

            // Create a LinkedList
            //LinkedList<Rider> list = new LinkedList<Rider>();

            System.out.print("Enter your name: ");
            name = scan.nextLine();
            rider.set_name(name);

            System.out.print("Enter your address: ");
            address = scan.nextLine();
            rider.set_location_start(address);

            System.out.print("Enter the day: ");
            day = scan.nextLine();
            rider.set_day(day);

            //list.add(rider);
            list.add(rider);

            System.out.println();
            i++;
        }

        for (int j = 0; j < list.size(); j++)
        {
            list.get(j).print();
        }



    }
}
