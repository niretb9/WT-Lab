/* WAP in java using inheritance to show how to call the base class parameterized constructors from the derived class using super keyword*/
package LAB07;
class Person {
    private String name;
    public Person(String name) {
      this.name = name;
      System.out.println("Person constructor called");
    } 
    public String getName() {
      return name;
    }
  }
  class Employee extends Person {
    private double salary;  // Parameterized constructor
    public Employee(String name, double salary) {
      super(name); // Call base class constructor with 'name' parameter
      this.salary = salary;
      System.out.println("Employee constructor called");
    }
     public double getSalary() {
      return salary;
    }
  }
  class q6{
    public static void main(String[] args) {
      Employee employee = new Employee("John Doe", 50000.0);
      System.out.println("Name: " + employee.getName());
      System.out.println("Salary: " + employee.getSalary());
    }
  }
  