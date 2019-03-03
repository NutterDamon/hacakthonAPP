public class Rider {
    String name;
    String address;
    int time_leave_hour;
    int time_leave_minute;
    int time_return_hour;
    int time_return_minute;
    int time_leave;
    int time_return;
    String day;
    int driver_distance_preference;
    bool is_driver;
    
    Rider() {
        name = "";
        address = "";
        time_leave_hour = 0;
        time_leave_minute = 0;
        time_return_hour = "";
        time_return_minute = 0;
        day = "";
        driver_distance_preference = 0;
        bool is_driver = false;
    }
    // Set functions -----------------------------------------------------------------------------
    public void set_name(String name) {
        this.name = name;
    }
    public void set_time_return(int time_return_hour, int time_return_minute){
        this.time_return_hour = time_return_hour;
        this.time_return_minute = time_return_minute;
        this.time_return = time_return_hour * 60 + time_return_minute;
    }
    public void set_address(String address) {
        this.address = address;
    }
    public void set_time_leave(int time_leave_hour, int time_leave_minute) {
        this.time_leave_hour = time_leave_hour;
        this.time_leave_minute = time_leave_minute;
        this.time_leave = time_leave_hour * 60 + time_leave_minute;
    }
    
    public void set_day(String day) {
        this.day = day;
    }
    public void set_driver_distance_preference(int set_driver_distance_preference) {
        this.driver_distance_preference = driver_distance_preference;
    }
    public void set_is_driver(bool is_driver){
        this.is_driver = is_driver;
    }
    //Get functions-------------------------------------------------------
    public String get_name() {
        return name;
    }
    
    public int get_driver_distance_preference(){
        return driver_distance_preference;
    }
    public int get_time_return_hour(){
        return time_return_hour;
    }
    public int get_time_return_minute(){
        return time_return_minute;
    }
    public int get_time_leave_hour(){
        return time_leave_hour;
    }
    public int get_time_leave_minute(){
        return time_leave_minute;
    }
    public String get_day(){
        return day;
    }
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Location Start: " + address);
        System.out.println("Time of Departure: " + time_leave);
        System.out.println("Expected time of arrival: " + time_arrive);
        System.out.println("Day: " + day);
    }
}
