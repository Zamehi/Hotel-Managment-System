import java.util.Iterator;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        hotel h = new hotel();

        Scanner sc = new Scanner(System.in);
        int t =1;
        while (t== 1)
        {
            System.out.printf("Hello and welcome!");

            System.out.println("Choose an option");
            System.out.println("1. Add rooms \n" + "2. Get Available Rooms\n" + "3. Search Guest\n" + "4. Book Room\n" + "5. Reserve Room\n" + "6. Avail food services\n"+ "7. Make Inquiry\n"+ "8. Exit");
            int option = sc.nextInt();
            if (option == 1)
            {
                h.add_rooms();

            }
            else if (option == 2)
            {
                h.get_available_rooms();
            }
            else if (option == 3)
            {
                String cnic = "";
                System.out.println("Enter the cnic to search guest.\n");
                cnic = sc.nextLine();
                cnic = sc.nextLine();
                h.search_guest(cnic);
            }
            else if (option == 4)
            {
                // book room , add payment
                int input2 = 0;
                h.get_available_rooms();
                System.out.print("Enter the room number to book");
                input2 = sc.nextInt();

                h.book_room(input2);
            }
            else if (option == 5)
            {
                // book room , add payment
                int input2 = 0;
                h.get_available_rooms();
                System.out.print("Enter the room number to reserve");
                input2 = sc.nextInt();

                h.reserve_room(input2);
            }
            else if (option == 6)
            {
                System.out.println("Avail food services.");

                h.food();

            }
            else if (option == 7)
            {
                System.out.println("Making Inquiry.");

                h.inquiry();

            }
            else if (option ==8)
            {
                System.out.println("Exitting");
                break;
            }
        }
    }
}