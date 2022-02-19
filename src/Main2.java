public class Main2 {
    public static void main(String[] args) {
        int accountAmount = 200;
        int replenishmentAmount = 1000;
        int totalSum = accountAmount + replenishmentAmount;

        if (replenishmentAmount > 1000) {
            int totalBonus = replenishmentAmount / 100;
            int total = totalSum + totalBonus;
            System.out.println("Бонус: " + totalBonus + " руб.");
            System.out.println("Итоговая сумма: " + total + " руб.");
        } else {
            System.out.println("Бонус: 0 руб.");
            System.out.println("Итоговая сумма: " + totalSum + " руб.");
        }
    }
}
