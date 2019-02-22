/* Calculator, second version
 * Javadoc comment style used
 * Methods updated to perform like a calculator 
 * Shannon Elsner 370
 * CSE 360, Monday section
 */
package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	//return current total
	public int getTotal () 
	{
		return total;
	}
	
	//add the parameter to the total variable
	public void add (int value) 
	{
		total = total + value;
	}
	
	//subtract the parameter from the total variable
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	//multiply the total by the parameter
	public void multiply (int value) 
	{
		total = total * value;
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
	}
	
	public String getHistory () 
	{
		return "";
	}
}