class InstanceVariable {  

	// Declared Instance Variable
	 public String name;
	 public int i;
	 public Integer I;
	 InstanceVariable()
 	 {
		// Default Constructor
		// initializing Instance Variable
		this.name = "Vaibhav Rathod";
	 }
	
	// Main Method
	public static void main(String[] args)
	{
		// Object Creation
		InstanceVariable obj = new InstanceVariable();
		
		// Displaying O/P
		System.out.println("Name of obj is: " + obj.name);
		System.out.println("Default value for int is " + obj.i);
		
		// toString() called internally
		System.out.println("Default value for Integer is " + obj.I);
	}
}