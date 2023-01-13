import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws InputMismatchException {
        long timeStart = System.nanoTime();
        Scanner in = new Scanner(System.in);
        System.out.println("Какую операцию вы хотите выполнить?");
        System.out.println("Сложение: + \n Вычитание: - \n Умножение: * \n Деление \n");
        System.out.println("Поддерживается работа с дробными числами. Вводите только численные значения, или если хотите, попробуйте что будет со строкой");
        String selection = in.nextLine();

        switch (selection) {
            case "+":
                Operations.getSum();
                break;
            case "-":
                Operations.getDiff();
                break;
            case "*":
                Operations.getMultiply();
                break;
            case "/":
                break;
            default:
        }
        long timeEnd = System.nanoTime();
        long timeRun = (timeEnd - timeStart) / 1000000;
        System.out.println("Время выполнения: " + timeRun);
    }


}
