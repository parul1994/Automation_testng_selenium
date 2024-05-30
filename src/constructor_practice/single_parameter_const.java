package constructor_practice;

 class single_parameter_const {

	String x;
	
	public single_parameter_const(String name)
	{
		x=name;
	}
	
	public static void main(String[] args) {
		
		single_parameter_const obj=new single_parameter_const("parul gupta");
		System.out.println(obj.x);
	}

}
