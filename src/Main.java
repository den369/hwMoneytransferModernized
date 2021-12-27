public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10000;
        int miles = service.calkulate(cost);
        System.out.println("Вы заработали " + miles + " бонусных миль");

    }
}