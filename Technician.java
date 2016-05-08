/**
   Technician class which inherits from Employee
*/

public class Technician extends Employee {
   private int level;
   private String department;
   
   /**
      Default Constructor using inheritance
      @param newName Name of Employee
      @param newNumber Employee Number
   */
   public Technician(String newName, int newNumber) {
      super(newName, newNumber);
   }
   
   /*
      Four Parameter Constructor
      @param newLevel Technician Level 1-3
      @param newDepartment Technician Department
      @param newName Name of Employee
      @param newNumber Employee Number
   */
   public Technician(int newLevel, String newDepartment, String newName, int newNumber)
   {
      super(newName, newNumber);
      level = newLevel;
      department = newDepartment;      
   }
   
   // Setters and Getters
   public int getLevel() { return level; }
   
   public String getDepartment() { return department; }
   
   public void setLevel(int newLevel) { level = newLevel; }
   
   public void setDepartment(String newDepartment) { department = newDepartment; }
   
   /** toString method for printing */
	public String toString()
	{
		return "T," + super.toString() + "," + level + "," + department;
	}
}