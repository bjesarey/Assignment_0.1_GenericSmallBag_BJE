/**
 * Creates an item to be placed in the SmallBag class with generics.
 */

/**
 * @author Brandon Esarey
 * @version 1.0
 * Assignment 0.1
 * CS215
 * Semester year Fall 2023
 */
public class Item <T>{

	private T e;

	/**
	 * @return the e
	 */
	public T getE() {
		return e;
	}//end getE

	/**
	 * @param e the e to set
	 */
	public void setE(T e) {
		this.e = e;
	}//end setE
	
}//end Item
