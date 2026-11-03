class Employee
{
    //Private Data Members
    private int empId;
    private String empName;
    private double salary;

    //Setter Methods
    public void setEmpId(int empId)
    {
        this.empId = empId;
    }
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    //Getter Methods
    public int getEmpId()
    {
        return empId;
    }
    public String getEmpName()
    {
        return empName;
    }
    public double getSalary()
    {
        return salary;
    }
}

public class GetterSetter
{
    public static void main(String[] args)
    {
        Employee emp = new Employee();

        //Setting values
        emp.setEmpId(101);
        emp.setEmpName("Sourabh");
        emp.setSalary(43000);

        //Getting and Displaying values
        System.out.println("Employee Id: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}