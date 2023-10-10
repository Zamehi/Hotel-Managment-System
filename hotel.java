import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hotel
{
    public
    ArrayList<rooms> hotel_rooms = new ArrayList<>();
    ArrayList<customer> customers;
    static int num;
    //rooms r [15];
    // constructor
    // --------------------------------
    public hotel()
    {
        this.num = 20;
        System.out.println("Making hotel\n");
        int p =1;
        for (int i =0; i < 20; i++)
        {
            rooms r = new rooms();
            r.number = p;
            r.status= "available";
            this.hotel_rooms.add(r);//.get(i).number = i+1;
            p=p+1;
        }
        System.out.println("Making hotel\n");
        this.customers=  new ArrayList<>();
    }

    // --------------------------------
    void add_rooms()
    {
        num += 1;
        rooms r1 = new rooms();
        this.hotel_rooms.add(r1);
        this.hotel_rooms.get(num-1).number= num;// setting number of room

    }

    // --------------------------------
    void get_available_rooms()
    {
        System.out.println("The available rooms are: \n");
        for (int i =0 ; i< num ; i++)
        {
            if ( this.hotel_rooms.get(i).status == "available")
            {
                System.out.print(this.hotel_rooms.get(i).number+"\n");
            }
        }
    } // on particular date

    // --------------------------------
 customer search_guest(String cnic)
    {
        int flag = 0;
        for (customer c : this.customers)
        {
            if (c.CNIC.equals(cnic))
            {
                c.display();
                flag = 0;
                return c;
                //break;
            }
            else
            {
                flag = 1;
            }
        }
        if (flag == 1)
        {
            System.out.println("Customer not found");
        }
        return null;
    }

    // -------------------------------- according to need
    void book_room(int x)
    {
        Scanner sc = new Scanner(System.in);
        int y =1;
        while (y ==1)
        {
            if (this.hotel_rooms.get(x - 1).status == "available")
            {
                String str = "";
                customer c = new customer();
                System.out.println("Room is avaialable.");
                System.out.println("Enter customer credentials");

                System.out.println("Enter name");
                str = sc.nextLine();
                c.name = str;
                System.out.println("Enter cnic");
                str = "";
                str = sc.nextLine();
                c.CNIC = str;
                str = "";
                System.out.println("Enter phone_number");
                str = sc.nextLine();
                c.phone_no = str;
                str = "";
                System.out.println("Pay bill");
                c.bill_status = "PAID";// bill will be only of food and services
                c.bill = 0;
                this.hotel_rooms.get(x - 1).status = "booked";
                // Add rooms to the customer profile
                c.c_rooms.add(this.hotel_rooms.get(x - 1));
                // Add customer to list of hotel data
                this.customers.add(c);
                System.out.println("Room booked successfully!");
                break;
            }
            else
            {
                System.out.println("Room is not available.\n Please enter a valid room number.");
            }
            //int input2 = 0;
            x = sc.nextInt();


        }
    }

    // --------------------------------
    void reserve_room(int x) // would be available to customer
    {
        Scanner sc = new Scanner(System.in);
        int y =1;
        while (y ==1)
        {
            if (this.hotel_rooms.get(x - 1).status == "available")
            {
                String str = "";
                customer c = new customer();
                System.out.println("Room is avaialable.");
                System.out.println("Enter customer credentials");

                System.out.println("Enter name");
                str = sc.nextLine();
                c.name = str;
                System.out.println("Enter cnic");
                str = "";
                str = sc.nextLine();
                c.CNIC = str;
                str = "";
                System.out.println("Enter phone_number");
                str = sc.nextLine();
                c.phone_no = str;
                str = "";
                c.bill_status = "NOT-PAID";// bill will be only of food and services
                c.bill = c.bill + 5000;
                this.hotel_rooms.get(x - 1).status = "reserved";
                // Add rooms to the customer profile
                c.c_rooms.add(this.hotel_rooms.get(x - 1));
                // Add customer to list of hotel data
                this.customers.add(c);
                System.out.println("Room reserved successfully!");
                break;
            }
            else
            {
                System.out.println("Room is not available.\n Please enter a valid room number.");
            }
            //int input2 = 0;
            x = sc.nextInt();


        }

    }

    // --------------------------------
    void inquiry()
    {
        String cnic = "";
        String inq= "";customer c = new customer();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the cnic to search guest.\n");
        cnic = sc.nextLine();
        c = this.search_guest(cnic);
        System.out.println("Enter the inquiry to store feedback.\n");
        inq = sc.nextLine();
        c.inquiry= inq;
    }

    // --------------------------------
    void food()
    {
        String cnic = ""; customer c  = new customer();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the cnic to search guest.\n");
        cnic = sc.nextLine();
        c = this.search_guest(cnic);
        c.f.number_of_services = c.f.number_of_services + 1;
       // System.out.println( "----------"+c.f.number_of_services);
        c.bill= c.f.number_of_services * c.f.cost_per_service;
        //System.out.println( "-----b----"+c.bill);
        c.display();
    }

    // --------------------------------
    void generate_bill(){}

}
