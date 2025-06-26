
// @author @version @since @param @value @return @throws Exception

/** @author Vinod Subramanian
 * @version 1.1
 * @since 2025
*/

package oops;

/** @author Vinod Subramanian
 * Class for Library Book
 */

class Book {
	
	/**
	 * @value 10 is the default value
	 */
	static int val = 10;
	private String name;
	
	/**
	 * @param id
	 * @return the name of the book
	 */
	public String getName(int id){       
        return "";
    }
	
	/**
	 * Parameterized constructor
	 * @param s
	 */
	public Book(String s) {
		name = s;
	}
	
	/**
	 * 
	 * @param roll
	 * @throws Exception if book not found
	 */
	public void issue(int roll) throws Exception {
		System.out.println("Book issued to " +roll);
	}
	
	/**
	 * @param name of the book
	 * @return true if book is available
	 */
	public boolean isAvailable(String s) {
		return true;
	}
}

public class JavaDocDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
