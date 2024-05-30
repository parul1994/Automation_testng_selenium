package inheritance_pract;

//import constructor_practice.inheritance_1;

class lat_bike {
	protected String motor_bike = "bajaj company";        
	  public void price() {                   
	    System.out.println("the price of bike is =60000");
	  }
}
class inheritance_bike extends lat_bike {
		  private String bike_name = "Pulsar"; 
	
		  public static void main(String[] args) {

			  inheritance_bike mybike = new inheritance_bike();

		 	  mybike.price();

		    System.out.println(mybike.motor_bike + " " + mybike.bike_name);
		  }
		 
	}
		  




