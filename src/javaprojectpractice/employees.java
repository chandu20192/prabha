package javaprojectpractice;

public class employees {
    private String name;
    private int id;
    private double salary;

    public employees(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return this.salary * 12;
    
    }
    public void giveRaise(double amount) {
        this.salary += amount;
    

}
}