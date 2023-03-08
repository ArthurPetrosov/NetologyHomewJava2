public class Main {
    public static void main(String[] args) {

        int priceTicket = 10_000;
        int bonusForMile = 20;
        int totalBonus = priceTicket / bonusForMile;

        System.out.println(totalBonus);
    }
}