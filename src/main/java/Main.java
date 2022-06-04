public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long actual1 = service.calculate(1000, true);
        long expected1 = 30;
        System.out.println("ОР: " + expected1 + ", ФР: " + actual1);

        long actual2 = service.calculate(10_000_000, true);
        long expected2 = 500;
        System.out.println("ОР: " + expected2 + ", ФР: " + actual2);

    }
}
