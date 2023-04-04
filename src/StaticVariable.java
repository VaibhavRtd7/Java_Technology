
public class StaticVariable {
	
	  public static String geek = "Vaibhav Rathod";
	   
	    public static void main(String[] args)
	    {
	 
	        // geek variable can be accessed without object
	        // creation Displaying O/P StaticVariable.geek --> using the
	        // static variable
	        System.out.println("Geek Name is : " + StaticVariable.geek);
	 
	        // static int c=0;
	        // above line,when uncommented,
	        // will throw an error as static variables cannot be
	        // declared locally.
	    }

}
