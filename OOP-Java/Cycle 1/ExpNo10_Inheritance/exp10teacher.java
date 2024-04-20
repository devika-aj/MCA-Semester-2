import java.util.Scanner;
class Person
{
    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age)
    {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person
{
    int empId;
    String companyName;
    String qualification;
    double salary;

    Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary)
    {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee
{
    String subject;
    String department;
    int teacherId;

    Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId)
    {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}


class exp10teacher
{
	public static void main(String[] args)
	{
        	Scanner s = new Scanner(System.in);

	        System.out.print("Enter the number of teachers: ");
        	int numTeachers = s.nextInt();
        	s.nextLine();

        	Teacher[] teachers = new Teacher[numTeachers];

        	for (int i = 0; i < numTeachers; i++)
		{
            		System.out.println("\nEnter details for teacher " + (i + 1) + ":");
            		System.out.print("Name: ");
            		String name = s.nextLine();
            		System.out.print("Gender: ");
            		String gender = s.nextLine();
            		System.out.print("Address: ");
            		String address = s.nextLine();
            		System.out.print("Age: ");
            		int age = s.nextInt();
            		s.nextLine();
            		System.out.print("Employee ID: ");
            		int empId = s.nextInt();
            		s.nextLine();
            		System.out.print("Company Name: ");
            		String companyName = s.nextLine();
            		System.out.print("Qualification: ");
            		String qualification = s.nextLine();
            		System.out.print("Salary: ");
            		double salary = s.nextDouble();
            		s.nextLine();
            		System.out.print("Subject: ");
            		String subject = s.nextLine();
		        System.out.print("Department: ");
            		String department = s.nextLine();
            		System.out.print("Teacher ID: ");
            		int teacherId = s.nextInt();
            		s.nextLine();

            		teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
               }

        	System.out.println("\nDetails of Teachers:");
        	boolean a=true;
        	for (int i = 0; i < numTeachers; i++)
		{
            		System.out.println("\n**** Teacher " + (i + 1) + " ****");
	        	teachers[i].display();
            		a=false;
        	}
        	if(a)
		{
            		System.out.println("Empty !!");
        	}
        	s.close();
    	}
}
