/**
 * Holds an object from the Item class by using generics.
 */

/**
 * @author Brandon Esarey
 * @version 1.0
 * Assignment 0.1
 * CS215
 * Semester year Fall 2023
 */
public class SmallBag <T>{

	private T item;

	/**
	 * @return the item
	 */
	public T getItem() {
		return item;
	}//end getItem

	/**
	 * @param item the item to set
	 */
	public void setItem(T item) {
		this.item = item;
	}//end setItem
	
}//end SmallBag
