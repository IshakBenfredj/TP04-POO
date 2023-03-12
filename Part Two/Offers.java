public class Offers {
    int numOffre;
    String description;
    double price;
    String duration;

    public Offers(int numOffre, String description, double price, String duration) {
        this.numOffre = numOffre;
        this.description = description;
        this.price = price;
        this.duration = duration;
    }
    public void canBenefit(double initialCredit) {
        if(initialCredit >= price) {
            System.out.println("Can Benifit");
        } else {
            System.out.println("Can't Benifit");
        }
    }
}
