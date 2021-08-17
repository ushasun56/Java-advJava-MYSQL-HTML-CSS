package gettersetterProgram;
 public class Employee 
 { 
  private String name; 
  private int id; 
  private String nCompany; 
 Employee(String name, int id, String nCompany)
 { 
   this.id = id; 
   this.name = name; 
   this.nCompany = nCompany; 
 } 
 public String getName() { 
   return name; 
 } 
public int getId() { 
   return id; 
 } 
public String getNCompany() { 
   return nCompany;
 } 
} 
package gettersetterProgram;
public class  ReadOnlyTest { 
public static void main(String[] args)
{ 
 Employee em = new Employee("Deep", 23435, "TCS"); 
 String name = em.getName(); // This method will read the value of the variable. Since the return type of this method is String. That's why we will store the returning value using a variable 'name' with data type String. 

 int id = em.getId(); // The return type of this method is an integer. 
 String nCompany = em.getNCompany(); 
 System.out.println("Employee's name: " +name); 
 System.out.println("Employee's id: " +id);
 System.out.println("Company's name: " +nCompany);
 } 
}