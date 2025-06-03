package Exercitiul1;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, int id, String departament, double hourlyWage, double hoursWorked) {
        super(name, id, departament);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePaycheck() {
        return this.hourlyWage * this.hoursWorked;
    }

    public void giveRaise(double percentage) {
        this.hourlyWage += this.hourlyWage * (percentage / (double)100.0F);
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Type: Contract, Total Pay: " + this.calculatePaycheck();
    }
}
