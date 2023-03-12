class main {
    public static void main(String[] args) {
        Address add1 = new Address("Harchoun", "Algeria");
        Address add2 = new Address("SBA", "Algeria");
        Address addresses[] = {add1,add2};
        Student ishak = new Student("Ishak", addresses);
        ishak.print_student_info();
    }
}