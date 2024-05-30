package inheritance_pract;

 class parent
{
	String brand="maruti";
	
	public void method_name()
	{
		System.out.println("Hi this is brand maruti");
	}
}
 
 class inhert extends parent
 {
	 String car_name="alto";	
	 public static void main(String[] args) {
		
			
			 
			 inhert obj=new inhert();
			 obj.method_name();
			 System.out.println(obj.brand+" "+obj.car_name);

		
		
		}
	

}
