/*1)a constructor in java is a special method that is used to initialise the objects.
2)the constructor is called when an object of a class is created.
3)it can be used to set initial value for object attributes.
**note:- a constructor cannot return void as it return type.
*/
package constructor_practice;

 class default_constructor {

	int x;//create a class attribute
	
	//create a class constructor
	public default_constructor()
	{
		x=100;
	}
	
	public static void main(String[] args) {
		
		default_constructor obj=new default_constructor();//creating the class object
		System.out.println(obj.x);//printing x value

	}

}
