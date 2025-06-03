package Exercitiul1;

import java.util.ArrayList;

public class EmployeeManager {
    public EmployeeManager() {
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        employees.add(new ContractEmployee("Alice", 101, "IT", (double)4000.0F, 12));
        employees.add(new HourlyEmployee("Bob", 102, "Sales", (double)80.0F, (double)160.0F));
        employees.add(new SalariedEmployee("Carol", 103, "HR", (double)12000.0F));

        for(Employee e : employees) {
            System.out.println(e.toString());
        }

        for(Employee e : employees) {
            e.giveRaise((double)10.0F);
        }

        System.out.println("\nDupă mărire:\n");

        for(Employee e : employees) {
            System.out.println(e.toString());
        }

    }
}


