package sagarsoft1;

import inheritance.MobilePhones;

public class Employee {
	String companyName;
	String employeeName;
	int employeeID;

	public Employee()
	{
		companyName = "Sagarsoft";
	}
	
	public Employee(String name, int ID)
	{
		companyName = "Sagarsoft";
		employeeName = name;
		employeeID = ID;
		
	}
	
	public void printCompanyName()
	{
		System.out.println(companyName);
	}
	
	public void printEmployeeDetails()
	{
		System.out.println(companyName);
		System.out.println(employeeName);
		System.out.println(employeeID);
		
	}
}
