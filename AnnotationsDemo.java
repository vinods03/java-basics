// This has javadoc annotations as well as other annotations like @Override @Deprecated @SuppressWarnings

/**
 * @author VINOD
 * @version 1.2
 * @since 2013
 */

package oops;

/**
 * Class A
 */
class A
{
	/**
	 * Base display() method
	 * @param none
	 */
    public void display()
    {
        
    }
}

/**
 * Class B is a child class of Class A
 */
class B extends A
{
	/**
	 * The display method overrides the base display method
	 */
    @Override
    public void display()
    {
    	System.out.println("Hi");
    }
    
    /**
     * The deprecated show method suppoerted for backward compatibility
     */
    @Deprecated
    public void show()
    {
        System.out.println("Bye");
    }
    
}

public class AnnotationsDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		int i;

        B b=new B();
  
        
        b.show();
        
    }

	}

