import java.util.ArrayList;
import java.util.List;

public class customer
{
    String name;
    String CNIC;
    String phone_no;
    List<rooms> c_rooms;
    String bill_status;
    int bill;
    food_services f;
    String inquiry;
    public customer()
    {
        this.inquiry= "";this.f= new food_services();this.bill= 0;this.bill_status= "";
        this.c_rooms = new ArrayList<>();
        this.bill = this.f.number_of_services * this.f.cost_per_service;
    }
    void display()
    {
        System.out.println("******************************");
        System.out.println("Name:"+ this.name);
        System.out.println("CNIC:"+ this.CNIC);
        System.out.println("Phone:"+ this.phone_no);
        System.out.println("Bill:"+ this.bill);
        System.out.println("Bill Status:"+ this.bill_status);
        System.out.println("Rooms Booked");
        for (rooms r :this.c_rooms)
        {
            System.out.println(r.number+" ");
        }
        this.f.diplay();
        System.out.println("Inquiry is "+ this.inquiry+"\n");
        System.out.println("******************************");
    }

}
