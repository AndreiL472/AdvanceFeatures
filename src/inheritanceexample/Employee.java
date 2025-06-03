package inheritanceexample;

public class Employee {

    // Clasă abstractă – folosită pentru moștenire, fără excepții în ea
        private String name;
        private int age;
        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Employee() {}
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }

