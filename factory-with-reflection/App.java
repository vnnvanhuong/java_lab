public class App {
    
    public static void main(String[] args) {
        MemberShipCard silverCard = MembershipCardFactory.get("silver");
        MemberShipCard goldCard = MembershipCardFactory.get("gold");
        MemberShipCard platinumCard = MembershipCardFactory.get("platinum");

        System.out.printf("---> card %s - point threshold %d", silverCard, silverCard.getPointThreshold());
        System.out.println();

        System.out.printf("---> card %s - point threshold %d", goldCard, goldCard.getPointThreshold());
        System.out.println();

        System.out.printf("---> card %s - point threshold %d", platinumCard, platinumCard.getPointThreshold());
        System.out.println();

    }    
}