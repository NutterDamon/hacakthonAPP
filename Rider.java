public class Rider
{
    String location_start;
    String location_end;
    String time_leave;
    int time_return;
    String time_arrive;
    String name;
    String day;
    bool no_smoke;
    int driver_distance_preference;
    bool is_driver;
    
    Rider()
    {
        name = "";
        location_start = "";
        location_end = "";
        time_leave = "";
        time_arrive = "";
        time_return = 0;
        day = "";
        no_smoke = false;
        driver_distance_preference = 0;
        bool is_driver = false;
        
    }
    // Set functions -----------------------------------------------------------------------------
    public void set_name(String name)
    {
        this.name = name;
    }
    public void set_time_return(String time_return){
        this.time_return = time_return;
    }
    public void set_location_start(String location_start)
    {
        this.location_start = location_start;
    }

    public void set_location_end(String location_end)
    {
        this.location_end = location_end;
    }

    public void set_time_leave(String time_leave)
    {
        this.time_leave = time_leave;
    }

    public void set_time_arrive(String time_arrive)
    {
        this.time_arrive = time_arrive;
    }

    public void set_day(String day)
    {
        this.day = day;
    }
    public void set_no_smoking (bool no_smoke) {
        this.no_smoke = no_smoke;
    }
    public void set_driver_distance_preference(int set_driver_distance_preference) {
        this.driver_distance_preference = driver_distance_preference;
    }
    //Get functions-------------------------------------------------------
    public String get_name()
    {
        return name;
    }
    public int get_driver_distance_preference(){
        return driver_distance_preference;
    }
    public int get_time_return(){
        return time_return;
    }
    public int get_time_leave(){
        return time_leave;
    }
    public String get_day(){
        return day;
    }
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Location Start: " + location_start);
        System.out.println("Location End: " + location_end);
        System.out.println("Time of Departure: " + time_leave);
        System.out.println("Expected time of arrival: " + time_arrive);
        System.out.println("Day: " + day);
    }
}
