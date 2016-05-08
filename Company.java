/*
   Company class to handle Logic behind bigApplet
*/

import java.io.*;
import java.util.*;
import java.util.ArrayList;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Company {
   
   private static String textFileName = "Employees.txt";
   private static ArrayList<Employee> myCompany = new ArrayList<Employee>();
   
   /*
      Reload original data into Array
   */
   public static void Reset() {
      myCompany.clear();
      myCompany.add(new SalesMan(15000.0, "Downtown", "Alan Read", 11545));
      myCompany.add(new SalesMan(2500.0, "Sidetown", "Lan Rea", 1545));
      myCompany.add(new SalesMan(500.0, "Uptown", "Ed Coupe", 51545));
      myCompany.add(new Technician(1, "Production", "Tina Fay", 46435));
      myCompany.add(new Technician(2, "Quality Control", "Sam Barker", 52435));
   }
   
   /*
      Display contents of Array into Text Area
      @param jtaDisplay Text Area to display data
   */
   public static void Display(JTextArea jtaDisplay){
      jtaDisplay.setText("");
      for(int i=0; i<myCompany.size(); i++)
         jtaDisplay.append(myCompany.get(i).toString()+"\n");
   }
   
   /*
      Sorts the contents of Array based on ID number      
   */
   public static void Sort() {           
         Collections.sort(myCompany);         
   }
   
   /*
      Adds new Employee to database
      @param newEmployee New Employee Information
   */
   public static void Add(String newEmployee) {      
      String newLine="", newName="", newTerritory="", newDepartment="";
      int newNumber=0, newLevel=0, p1=0, p2=0, p3=0;
      double newTarget=0.0;
      
      newLine = newEmployee;
      if (newLine.charAt(0)=='T') {
         p1 = newLine.indexOf(',', 2);
         newName = newLine.substring(2,p1);
         p2 = newLine.indexOf(',', p1+1);
         newNumber = Integer.parseInt(newLine.substring(p1+1,p2));
         p3 = newLine.indexOf(',', p2+1);
         newLevel = Integer.parseInt(newLine.substring(p2+1,p3));
         newDepartment = newLine.substring(p3+1,newLine.length());
         Technician tech = new Technician(newLevel, newDepartment, newName, newNumber);
         myCompany.add(tech);
      }
      else if (newLine.charAt(0)=='S') {
         p1 = newLine.indexOf(',', 2);
         newName = newLine.substring(2,p1);
         p2 = newLine.indexOf(',', p1+1);
         newNumber = Integer.parseInt(newLine.substring(p1+1,p2));
         p3 = newLine.indexOf(',', p2+1);
         newTarget = Double.parseDouble(newLine.substring(p2+1,p3));
         newTerritory = newLine.substring(p3+1,newLine.length());
         SalesMan sales = new SalesMan(newTarget, newTerritory, newName, newNumber);
         myCompany.add(sales);
      }
   }
   
   /*
      Deletes the given Employee
      @param delEmployee ID number of employee to delete
   */
   public static void Delete(int delEmployee) {
      for(int i=0; i<myCompany.size(); i++){
         if(((Employee)myCompany.get(i)).getNumber()==(delEmployee)) {
            myCompany.remove(i);
            return;
         }
      }
      JOptionPane.showMessageDialog(null, "ID Not Found", "Delete", JOptionPane.ERROR_MESSAGE); 
   }
}