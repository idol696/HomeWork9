public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] spending = {150, 3000, 800, 50, 50};
        for (int spendingCurrent : spending) {
            System.out.printf("Сумма трат за месяц составила %s рублей%n", spendingCurrent);
        }

        System.out.println("Задача 2");
        int spendingMin = 0;
        int spendingMax = 0;
        for (int spendingCurrent : spending) {
            if (spendingCurrent > spendingMax) {
                spendingMax = spendingCurrent;
            }
            if (spendingCurrent < spendingMin || spendingMin == 0) {
                spendingMin = spendingCurrent;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + spendingMin);
        System.out.println("Максимальная сумма трат за неделю составила " + spendingMax);

        System.out.println("Задача 3");
        int spendingTotal = 0;
        for (int spendingCurrent : spending) {
            spendingTotal += spendingCurrent;
        }
        double spendingMid = (double) spendingTotal / spending.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", spendingMid);

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}