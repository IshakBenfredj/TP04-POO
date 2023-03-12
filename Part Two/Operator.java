public class Operator {
    String commercialName;
    String prefixNumber;
    int numberCoveredStates;
    Offers opertorOffers[];
    public Operator(String commercialName, String prefixNumber, int numberCoveredStates ,Offers opertOffers[]) {
        this.commercialName = commercialName;
        this.prefixNumber = prefixNumber;
        this.numberCoveredStates = numberCoveredStates;
        this.opertorOffers = opertOffers;
    }
    public void print_info () {
        System.out.println("commercial Name: "+commercialName);
        System.out.println("prefix Number: "+prefixNumber);
        System.out.println("number Covered States: "+numberCoveredStates);
    }
    public void print_offers() {
        for (Offers offer : opertorOffers) {
            System.out.println(offer.numOffre +"description: "+offer.description+" || price: "+offer.price+" || duration: "+offer.duration);
        }
    }
    public void getOffreByNum(int m) {
        for (Offers offer : opertorOffers) {
            if (offer.numOffre == m) {             
                System.out.println(offer.numOffre +"description: "+offer.description+" || price: "+offer.price+" || duration: "+offer.duration);
            }
        }
    }
}