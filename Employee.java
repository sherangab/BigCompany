/**
* This is the superclass Employee.
* It contains the general information for SalesMan and Technician
*/

import java.io.*;

public class Employee implements Comparable, Serializable {

	private String name;			// Name of employee
	private int number;			// Employee number of employee
	
	/**
	* Constructor  to create the superclass
	* @param nom Name of the employee
	* @param number Employee number
	*/
	public Employee(String nom, int number )
	{
		name = nom;
		this.number = number;
	}
	
	// getters and setters
   public String getName(){ return name; }
   
   public int getNumber(){ return number; }
   
   public void setName(String newName){ name = newName; } 
   
   public void setNumber(int newNumber){ number = newNumber; }

	/**
	* compareTo method for comparison of objects
	* @param Employee object
	* @return An integer to indicate comparison  
	*/
	public int compareTo(Object o)
	{
		if (getNumber()>((Employee)o).getNumber())
         return 1;
      else if (getNumber()<((Employee)o).getNumber())
         return -1;
      else
         return 0;
	}
	
	/** toString method for printing */
	public String toString()
	{
		return name + "," + number;
	}
}