public class Rider
{
    String location_start;
    String location_end;
    String time_leave;
    String time_arrive;
    String name;
    String day;

    Rider()
    {
        name = "";
        location_start = "";
        location_end = "";
        time_leave = "";
        time_arrive = "";
        day = "";
    }

    public void set_name(String name)
    {
        this.name = name;
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

    public String get_name()
    {
        return name;
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
