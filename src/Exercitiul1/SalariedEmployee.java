package Exercitiul1;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, String departament, double annualSalary) {
        super(name, id, departament);
        this.annualSalary = annualSalary;
    }

    public double calculatePaycheck() {
        return this.annualSalary / (double)26.0F;
    }

    public void giveRaise(double percentage) {
        if (percentage > (double)0.0F) {
            this.annualSalary += this.annualSalary * (percentage / (double)100.0F);
        } else {
            System.out.println("Please enter posivite percentage");
        }

    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " Total Pay: " + this.calculatePaycheck();
    }
}
