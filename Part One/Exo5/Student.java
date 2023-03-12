public class Student {
    String Name;
    String phone_number;
    String email_address;
    int id_number;
    double averge_mark;
    Address address[];
    // public Student(String Name,String phone_number,String email_address,int id_number,double averge_mark,Address[] address){
    public Student(String Name,Address[] address){
        this.Name = Name;
        this.address = address;
        // this.phone_number = phone_number;
        // this.email_address = email_address;
        // this.id_number = id_number ;
        // this.averge_mark = averge_mark;
    }
    public void print_student_info() {
        System.out.println("name: "+Name);
        // System.out.println("phone: "+phone_number);
        // System.out.println("email:: "+email_address);
        System.out.println("Address One: "+address[0]);
        System.out.println("Address Two: "+address[1]);
    }
}
