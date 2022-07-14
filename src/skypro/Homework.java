package skypro;

public class Homework {
    public static void main(String[] args) {
    // Задание 1
        byte cherry = 120;
        short apples = 25321;
        int kiwi = 158769;
        long skateBoard = 3698521L;
        float salt = 15.850f;
        double sugar = 189.9991;
        char symbol = 21;
        boolean isWeightFructs = 10 > cherry;
        // Задание 2
        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + "кг");
        float differenceBetween = weightSecondBoxer - weightFirstBoxer;
        /*
        Пытался пойти сложным путем как в обучающем ролике
        вес первого бойца минус второго, потом через переменную overload,
        но что-то пошло не так. Скорее всего, здесь это нельзя применить т.к.
        нет дополнительных условий.
         */
        System.out.println("Разница в весе между бойцами " + differenceBetween + "кг");
    }
}
