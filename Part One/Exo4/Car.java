public class Car {
    String car_Type;
    int year;
    String remark;
    public Car(String car_Type, int year){
        this.car_Type = car_Type;
        this.year = year;
        if (year < 2019) {
            this.remark =  "This car needs scanner verification";
        } else {
            this.remark = "This car doesn't need a scanner verification";
        }
    }
    public void print_Car_info() {
        System.out.println("type of this car is: "+car_Type);
        System.out.println("year of this car is: "+year);
        System.out.println("remark about car is: "+remark);
    }
    public static void main(String[] args) {
        Car car_1 = new Car("Peugeot", 2007);
        car_1.print_Car_info();
    }
}
