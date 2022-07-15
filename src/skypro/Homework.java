package skypro;

public class Homework {
    public static void main(String[] args) {
    // Задание 1

        byte cherry = 120;
        short apples = 25321;
        int kiwi = 158769;
        long skateBoard = 3698521;
        float salt = 15.850f;
        double sugar = 189.9991;
        char symbol = 21;
        boolean isWeightFructs = 10 > cherry;

        // Задание 2

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + "кг");
        float differenceBetween = Math.abs(weightFirstBoxer - weightSecondBoxer);
        System.out.println("Разница в весе между бойцами " + differenceBetween + "кг");

        // Задание 3

        int banana = 5;
        int bananaWeight = 80;

        int milk = 200/100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int total = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);
        int gramsInKgs = 1000;
        double totalKgs = total / (gramsInKgs * 1.0);
        System.out.println("Вес завтрака составляет " + total + " грамм");
        System.out.println("вес завтрака составляет " + totalKgs + " килограмм");

        // Задание 4

        int weight = 7;
        int gramsInKg = 1000;
        int weightInGrams = weight * gramsInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays = weightInGrams / maxGramsPerDay;
        int maxDays = weightInGrams / minGramsPerDay;

        int diffDays = (minDays + maxDays) / 2;

        System.out.println("При первом варианте потребуется " + minDays + " дней");
        System.out.println("При втором варианте потребуется " + maxDays + " дней");
        System.out.println("В среднем потребуется " + diffDays + " дней");


        // Задание 5

        int percent = 10;
        double multiplier = percent / (100 * 1.0);

        int mashaBefore = 67760;
        int denisBefore = 83_690;
        int kristinaBefore = 76_230;

        int mashaAfter = (int) (mashaBefore + (mashaBefore * multiplier));
        int denisAfter = (int) (denisBefore + (denisBefore * multiplier));
        int kristinaAfter = (int) (kristinaBefore + (kristinaBefore * multiplier));

        int mashaDiff = (mashaAfter - mashaBefore) * 12;
        int denisDiff = (denisAfter - denisBefore) * 12;
        int kristinaDiff = (kristinaAfter - kristinaBefore) * 12;

        System.out.println("Маша теперь получает " + mashaAfter + " рублей. " + "Годовой доход вырос на " + mashaDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. " + "Годовой доход вырос на " + denisDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaAfter + " рублей. " + "Годовой доход вырос на " + kristinaDiff + " рублей.");

    }
}
