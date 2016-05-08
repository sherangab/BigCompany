/**
   SalesMan class which inherits from Employee
*/

public class SalesMan extends Employee {
   private double target;
   private String territory;
   
   /**
      Default Constructor using inheritance
      @param newName Name of Employee
      @param newNumber Employee Number
   */
   public SalesMan(String newName, int newNumber) {
      super(newName, newNumber);
   }
   
   /*
      Four Parameter Constructor
      @param newTarget Sale Target for Salesman
      @param newTerritory Salesman Territory
      @param newName Name of Employee
      @param newNumber Employee Number
   */
   public SalesMan(double newTarget,String newTerritory, String newName, int newNumber) {
      super(newName, newNumber);
      target = newTarget;
      territory = newTerritory;      
   }
   
   // Setters and Getters
   public double getTarget() { return target; }
   
   public String getTerritory() { return territory; }
   
   public void setTarget(double newTarget) { target = newTarget; }
   
   public void setTerritory(String newTerritory) { territory = newTerritory; }
   
   /** toString method for printing */
	public String toString()
	{
		return "S," + super.toString() + "," + target + "," + territory;
	}
}