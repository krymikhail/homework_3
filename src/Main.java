public class Main {
    public static void main(String[] args) {

        double[] numbers = {9.5, 3.1, -4.5, 1.9, -3.4, 0.7, 6.3, -5.2, 2.5, 4.0, -0.7, 3.6, -3.5, 2.2, 7.8};

        boolean negativeNumbers = false;
        double amount = 0;
        int result = 0;

        for (double num: numbers) {
            if (!negativeNumbers) {
                if (num <0) {
                    negativeNumbers = true;
                }
            } else {
                if (num > 0) {
                    amount += num;
                    result++;
                }
            }
        }

        if (result > 0) {
            double average = amount / result;
            System.out.println("Среднее арифметическое всех положительных чисел, стоящих после первого отрицательного числа: " + average);
        }
    }
}