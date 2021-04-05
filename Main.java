import java.time.*;

/**
* This program tests the Employee class.
* * @version 1.12 2015-05-08
* @author Cay Horstmann
*/
public class EmployeeTest
{
public static void main(String[] args)
{

Employee[] staff = new Employee[3];

staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

// raise everyone's salary by 5%
for (Employee e : staff)
e.raiseSalary(5);

// print out information about all Employee objects
for (Employee e : staff)
System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
+ e.getHireDay());
}
}

class Employee
{
private String name;
private double salary;
private LocalDate hireDay;

public Employee(String n, double s, int year, int month, int day)
{
name = n;
salary = s;
hireDay = LocalDate.of(year, month, day);
}

public String getName()
{
return name;
}

public double getSalary()
{
return salary;
}

public LocalDate getHireDay()
{
return hireDay;
}

public void raiseSalary(double byPercent)
{
double raise = salary * byPercent / 100;
salary += raise;
}
}

public class StaticTest
{
public static void main(String[] args)
{
// fill the staff array with three Employee objects
Employee[] staff = new Employee[3];

staff[0] = new Employee("Tom", 40000);
staff[1] = new Employee("Dick", 60000);
staff[2] = new Employee("Harry", 65000);

// print out information about all Employee objects
for (Employee e : staff)
{
e.setId();
System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
+ e.getSalary());
}

int n = Employee.getNextId(); // calls static method
System.out.println("Next available id=" + n);
}
}

class Employee
{
private static int nextId = 1;

private String name;
private double salary;
private int id;

public Employee(String n, double s)
{
name = n;
salary = s;
id = 0;
}

public String getName()
{
return name;
}
