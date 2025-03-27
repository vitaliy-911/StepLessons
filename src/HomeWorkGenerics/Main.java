package HomeWorkGenerics;

public class Main {
    public static void main(String[] args) {
        LotteryMachine<String> lotto = new LotteryMachine<>();
        lotto.add("Виталик");
        lotto.add("Катя");
        lotto.add("Алексей");
        lotto.add("Виктор");
        lotto.add("Уигений");

        System.out.println("🎰 Первый розыгрыш:");
        String name;
        while ((name = lotto.pick()) != null) {
            System.out.println("Выбран: " + name);
        }

        System.out.println("\n🔁 Новый розыгрыш:");
        lotto.reset();
        while ((name = lotto.pick()) != null) {
            System.out.println("Снова выбран: " + name);

        }
    }
}