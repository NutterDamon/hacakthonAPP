public class Compare {
  ArrayList<Rider> riders = new Arraylist();
  Rider rider_to_compare;

  Compare(Rider rider_to_compare, ArrayList<Rider> riders){
    this.rider_to_compare = rider_to_compare;
    this.riders = riders;
  }
  public String find_match(){
    String return_value;
    //check if rider distance is compatible

    //check if rider times are compatible
    int compare_time;
    for (int i = 0; i < riders.size(); i++){
      //Is someone a driver?
      if (rider_to_compare.get_is_driver() || riders.get(i).get_is_driver()){
        //Is Rider to compare <= array value?
        if (rider_to_compare.get_time_leave() <= riders[i].get_time_leave()){
          compare_time = riders.get(i).get_time_leave() - rider_to_compare.get_time_leave();
          
        } else {
          compare_time = rider_to_compare.get_time_leave() - ridersget(i).get_time_leave();
        }
        // Is time less than 30 minutes?
        if (compare_time <= 30){
          return_value = riderget(i).get_name;
        } else {
          return_value = "NULL";
        }
        break;
      } else {
        return_value = "NULL";
      }
    }
    return return_value;
  }
  // Return the distance between address 1 and address 2
  public int compare_address(Rider r1, Rider r2){
    
  }
}
