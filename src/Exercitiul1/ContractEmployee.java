package Exercitiul1;

public class ContractEmployee extends Employee {
    private double contractAmount;
    private int contractDuration;

    public ContractEmployee(String name, int id, String departament, double contractAmount, int contractDuration) {
        super(name, id, departament);
        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;
    }

    public double calculatePaycheck() {
        return this.contractAmount * (double)this.contractDuration;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + ", Type: Contract, Total Pay: " + this.calculatePaycheck();
    }

    public void giveRaise(double percentage) {
        this.contractAmount += this.contractAmount * (percentage / (double)100.0F);
    }
}
