import java.util.Scanner;
class Employee
{
	int eNo;
    	String eName;
    	int eSalary;

    	Employee(int eNo, String eName, int eSalary)
	{
        	this.eNo = eNo;
        	this.eName = eName;
        	this.eSalary = eSalary;
    	}

    	void display()
	{
        	System.out.println("Employee Number: " + eNo);
        	System.out.println("Employee Name: " + eName);
        	System.out.println("Employee Salary: " + eSalary);
    	}
}
class exp9
{
    	public static void main(String[] args)
	{
        	Scanner s = new Scanner(System.in);

        	System.out.print("Enter the number of employees: ");
	        int n = s.nextInt();
        	s.nextLine();
        	Employee[] employees = new Employee[n];

        	for (int i =0; i <n; i++)
		{
            		System.out.println("\n**** Enter Employee " +(i+1)+ " details ****");
            		System.out.print("Employee Number: ");
            		int eNo = s.nextInt();
            		s.nextLine();
            		System.out.print("Employee Name: ");
            		String eName = s.nextLine();
            		System.out.print("Employee Salary: ");
            		int eSalary = s.nextInt();
            		s.nextLine();
            		System.out.println("\n=============================");
            		employees[i] = new Employee(eNo, eName, eSalary);
        	}

        	System.out.print("\nEnter the employee number to search: ");
        	int searchENo = s.nextInt();
        	boolean found = false;
        	for (Employee emp : employees)
		{
            		if (emp.eNo == searchENo)
			{
                		emp.display();
                		found = true;
                		break;
            		}
        	}

        	if (!found)
		{
            		System.out.println("Employee with employee number " + searchENo + " not found.");
        	}
        	s.close();
    	}
}
