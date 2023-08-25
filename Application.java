/**
 * Demonstrates how the SmallBag class stores an item from the item class.
 */

/**
 * @author Brandon Esarey
 * @version 1.0
 * Assignment 0.1
 * CS215
 * Semester year Fall 2023
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item<String> MyItem = new Item<String>();
		MyItem.setE("Brandon");
		SmallBag<Item> MyBag = new SmallBag<Item>();
		MyBag.setItem(MyItem);
		System.out.println(MyItem.getE());
		
		
		Item<Integer> MyInteger = new Item<Integer>();
		MyInteger.setE(7);
		MyBag.setItem(MyInteger);
		System.out.println(MyInteger.getE());


	}//end main()

}//end Application
