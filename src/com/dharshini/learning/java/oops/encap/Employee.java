package com.dharshini.learning.java.oops.encap;

public class Employee {
    private String empName;
    private String id;
    private int salary;

    public Employee(String empName, String id, int salary) {
        this.empName = empName;
        this.id = id;
        this.salary = salary;
    }
    public String getEmpName() {
        return empName;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    public void bCalculate(int bonus) {
        if(bonus>=1 && bonus <=20){
            salary = salary + salary* bonus/100;
            System.out.println(salary);
        }else {
            System.out.println("Bonus not incremented");
        }

    }
}
