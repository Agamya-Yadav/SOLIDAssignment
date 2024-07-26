package net.media.training.live.srp;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private Address address;
    private Leaves leaves;
    private String manager;
    private int yearsInOrg;
    private int thisYeard;

    public Employee(int empId, double monthlySalary, String name,String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = new Address(addressStreet, addressCity, addressCountry);
        this.leaves = new Leaves(leavesTaken, leavesLeftPreviously);
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public Employee() {
    }
    
    public int getEmpID(){
        return this.empId;
    }
    public String getName(){
        return this.name;
    }
    public Address getAddress(){
        return this.address;
    }
    public Leaves getLeavesStatus(){
        return this.leaves;
    }
    public String getManager(){
        return this.manager;
    }
    public int getYearsInOrg(){
        return this.yearsInOrg;
    }
    public int getThisYeard(){
        return this.thisYeard;
    }
    public double getMonthlySalary(){
        return this.monthlySalary;
    }
    
    //other method related to customer
}
