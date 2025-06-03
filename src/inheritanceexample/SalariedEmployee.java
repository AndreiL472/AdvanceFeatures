package inheritanceexample;

    public class SalariedEmployee extends Employee {
        String salariedContractData;
        int taxTopay;
        public SalariedEmployee(String name, int age, String salariedContractData, int taxTopay) {
            super(name, age);
            this.salariedContractData = salariedContractData;
            this.taxTopay = taxTopay;
        }
    }

