import java.util.Scanner;

public class main {
        public static void offer_information(Operator name,Offers tab[],double credit) {
            Scanner in = new Scanner(System.in);
            System.out.println("operator cv state: "+name.numberCoveredStates);
            System.out.println("operator prifix: "+name.prefixNumber);
            System.out.println("choose an offer from this");
            name.print_offers();
            int numOff = in.nextInt();
            System.out.println("your offre is: ");
            name.getOffreByNum(numOff);
            tab[numOff].canBenefit(credit);
        }
    public static void main(String[] args) {
        // Create Djezzy offers
        Offers djezzyOffer1 = new Offers(0,"Mo/net", 30, "24H");
        Offers djezzyOffer2 = new Offers(1,"Free calls", 100, "24H");
        Offers djezzyOffer3 = new Offers(2,"Free calls + net", 200, "7 Days");
        Offers djezzyOffer4 = new Offers(3,"Free calls all + net", 500, "15 Days");
        Offers djezzyOffer5 = new Offers(4,"Free calls all + net", 1000, "1 Month");
        // Create Mobilis offers
        Offers mobilisOffer1 = new Offers(0,"200 Mo/net", 40, "24H");
        Offers mobilisOffer2 = new Offers(1,"Free calls + net", 100, "24H");
        Offers mobilisOffer3 = new Offers(2,"Free calls + 1G", 200, "7 Days");
        Offers mobilisOffer4 = new Offers(3,"Free calls all + net", 500, "15 Days");
        Offers mobilisOffer5 = new Offers(4,"Free calls all + net", 1000, "1 Month");

        // Create Ooredoo offers
        Offers ooredooOffer1 = new Offers(0,"1G internet", 100, "24H");
        Offers ooredooOffer2 = new Offers(1,"Free calls + net", 200, "48H");
        Offers ooredooOffer3 = new Offers(2,"Free calls + 10 G", 500, "15 Days");
        Offers ooredooOffer4 = new Offers(3,"Free calls all + 40 G", 1000, "1 Month");
        Offers ooredooOffer5 = new Offers(4,"Free calls all + net", 3000, "2 Month");

        // Arrays Offers
        Offers djezzyOffers[] = {djezzyOffer1,djezzyOffer2,djezzyOffer3,djezzyOffer4,djezzyOffer5};
        Offers mobilisOffers[] = {mobilisOffer1,mobilisOffer2,mobilisOffer3,mobilisOffer4,mobilisOffer5};
        Offers ooredooOffers[] = {ooredooOffer1,ooredooOffer2,ooredooOffer3,ooredooOffer4,ooredooOffer5};
        // Opertors
        Operator djezzy = new Operator("Djezzy", "07", 30,djezzyOffers);
        Operator mobilis = new Operator("Mobilis", "06", 18,mobilisOffers);
        Operator ooredoo = new Operator("Ooredoo", "05", 16,ooredooOffers);

        djezzy.print_info();
        System.out.println("######################################");
        mobilis.print_info();
        System.out.println("######################################");
        ooredoo.print_info();
        System.out.println("######################################");

        // djezzyOffer1.canBenefit(10);
        // System.out.println("######################################");
        // mobilisOffer1.canBenefit(6);
        // System.out.println("######################################");
        // ooredooOffer1.canBenefit(11);
        // System.out.println("######################################");

        // User
        Scanner in = new Scanner(System.in);
        System.out.println("print your phone");
        String phone = in.next();
        System.out.println("Enter your Credit");
        double credit = in.nextDouble();
        System.out.println("your opertaor information");
        String prefix = phone.substring(0, 2);
        if (prefix.equals(djezzy.prefixNumber)) {
            System.out.println("operator name: Djezzy");
            offer_information(djezzy , djezzyOffers , credit);
        } else if (prefix.equals(mobilis.prefixNumber)) {
            System.out.println("operator name: mobilis");
            offer_information(mobilis , mobilisOffers , credit);
        } else  {
            System.out.println("operator name: ooredoo");
            offer_information(ooredoo , ooredooOffers , credit);
        }
    }
}
