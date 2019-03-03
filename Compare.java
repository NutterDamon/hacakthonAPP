
public class Compare {
  ArrayList<Rider> riders = new Arraylist();
  Rider rider_to_compare;
  int distance_between_addresses;

  Compare(Rider rider_to_compare, ArrayList<Rider> riders){
    this.rider_to_compare = rider_to_compare;
    this.riders = riders;
  }
  public int get_distance_between_addresses(){
    return distance_between_addresses;
  }
  public void set_distance_between_addresses(int distance_between_addresses;){
    this.distance_between_addresses = distance_between_addresses;
  }
  // Returns a string name of the matched individual and sets the distance_between_address to
  // the distance between the addresses.
  public String find_match(){
    String return_value = "NULL";
    int compare_time1;
    int compare_time2;
    for (int i = 0; i < riders.size(); i++){
      //Is someone a driver?
      if (rider_to_compare.get_is_driver() || riders.get(i).get_is_driver()){
        //Is Rider to compare <= array value?
      compare_time1 = Math.abs(riders.get(i).get_time_leave() - rider_to_compare.get_time_leave());
      compare_time2 = Math.abs(riders.get(i).get_time_return() - rider_to_compare.get_time_return());
        // Is time less than 30 minutes?
        if (compare_time1 <= 30 && compare_time2 <= 30){
          if(compare_address(rider_to_compare, riders.get(i)) <= rider_to_compare.get_driver_distance_preference()
          && compare_address(rider_to_compare, riders.get(i) <= riders.get(i).get_driver_distance_preference())){
            //Setting return value to name of match.
            return_value = riderget(i).get_name;
            //Setting distance between addresses to member value.
            this.distance_between_addresses = compare_address(rider_to_compare, riders.get(i));
            return return_value;
          }
        } else {
          return_value = "NULL";
        }
      } else {
        return_value = "NULL";
      }
    }
    return return_value;
  }
  // Return the miles between address 1 and address 2
  public int compare_address(Rider r1, Rider r2){
    
  }
}
