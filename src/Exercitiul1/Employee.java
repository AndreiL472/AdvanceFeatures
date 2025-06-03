
package Exercitiul1;

abstract class Employee {
    private String name;
    private int id;
    private String departament;

    public Employee(String name, int id, String departament) {
        this.name = name;
        this.id = id;
        this.departament = departament;
    }

    public abstract double calculatePaycheck();

    public String toString() {
        return "Employee{name='" + this.name + "', id=" + this.id + ", departament='" + this.departament + "'}";
    }

    public abstract void giveRaise(double var1);
}