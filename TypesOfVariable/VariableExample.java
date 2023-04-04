
public class VariableExample {
	
	int myVariable = 20;   // Instance Variable
	static int data = 30;  // Local or Class Variable
    public static void main(String args[]) {
    	int a = 10;  // Local Variable
    	
    	VariableExample obj = new VariableExample();
    	  System.out.println("Value of instance variable myVariable: "+obj.myVariable);
          System.out.println("Value of static variable data: "+VariableExample.data);
          System.out.println("Value of local variable a: "+a);
    }
}
