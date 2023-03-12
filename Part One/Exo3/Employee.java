public class Employee {
        String name ;
        int yearOfJoining ;
        String address;
        public Employee(String name , int yearOfJoining , String address){
            this.name = name;
            this.yearOfJoining = yearOfJoining;
            this.address = address;
        }
        public void printEmployee(){
            System.out.println("#######################################");
            System.out.println("Your name is: "+name);
            System.out.println("Your year of joining is: "+yearOfJoining);
            System.out.println("Your Address is: "+address);
        }
    public static void main(String[] args) {
        Employee amine = new Employee("Amine", 2002, "24 rue Bt 5001-Oran");
        amine.printEmployee();
        Employee aek = new Employee("Aek", 2012, "29 rue – sba");
        aek.printEmployee();
        Employee mahmoud = new Employee("Mahmoud", 1999, "59 Bt 5000 - Chlef");
        mahmoud.printEmployee();
    }
}