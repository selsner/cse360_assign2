/* Calculator, third and final version
 * Javadoc comment style used
 * Methods updated to perform like a calculator
 * Also getHistory method will return a history of all actions as a String.  
 * Shannon Elsner 370
 * CSE 360, Monday section
 */
package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/*
	 * getTotal will return current total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/*
	 * add function will add the parameter to the total variable
	 */
	public void add (int value) 
	{
		total = total + value;
		history += ("+ " + value);
	}
	
	/*
	 * The subtract function will subtract the parameter from the total variable
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history += ("- " + value);
	}
	
	/*
	 * The multiply function will multiply the total by the parameter
	 */
	public void multiply (int value) 
	{
		total = total * value;
		history += ("* " + value);

	}
	
	/* divide the total by the parameter using integer division
	 * If the parameter is zero, set the total to zero
	 */ 
	public void divide (int value) 
	{
		if(value == 0)
			total = 0;
		else
			total = total / value;
		history += ("/ " + value);

	}
	
	/*
	 * The getHistory function will return a history of all actions as a String
	 */
	public String getHistory () 
	{
		return history.toString();
	}
}