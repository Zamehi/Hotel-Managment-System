public class food_services
{
    int number_of_services;
    static int cost_per_service;
    public food_services()
    {
        this.cost_per_service=  20;
        number_of_services= 0;
    }

    void diplay()
    {
        System.out.println("\nNumber of services used "+ this.number_of_services+"\n");
    }


}
