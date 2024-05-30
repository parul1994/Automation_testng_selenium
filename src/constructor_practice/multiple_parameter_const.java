package constructor_practice;

 class multiple_parameter_const {
	
	String x;
	int y;
	
	
	public multiple_parameter_const(String name,int age)
	{
		x=name;
		y=age;
	}

	public static void main(String[] args) {
		multiple_parameter_const obj=new multiple_parameter_const("parul gupta",28);
		System.out.println("hi my name is :"+obj.x+" "+"and my age is :"+obj.y);
		

	}

}
