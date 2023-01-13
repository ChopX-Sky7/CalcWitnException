import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Operations {

public static void getSum() throws InputMismatchException{
    Scanner in = new Scanner(System.in);
    float a, b, result = 0;

    try {
        System.out.println("Введите число а:");
        a = in.nextFloat();
        System.out.println("Введите число а:");
        b = in.nextFloat();

        result = a + b;
        System.out.println(" Число a = " + a
                + " \n Число b = " + b
                + " \n Результат = " + result
        );
    }
    catch (Exception inputMismatch){
        System.out.println("Ввиду вашей глупости и нашей предусмотрительности мы конвертируем введенные вами строку в число собственным алгоритмом.");
        a = new Random().nextFloat(1, 1000);
        b = new Random().nextFloat(1, 1000);
        result = a + b;
        System.out.println(" Число a = " + a
                + " \n Число b = " + b
                + "\n Результат = " + result
        );
    }
}

    public static void getDiff() throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        float a, b, result = 0;

        try {
            System.out.println("Введите число а:");
            a = in.nextFloat();
            System.out.println("Введите число а:");
            b = in.nextFloat();

            result = a - b;
            System.out.println(" Число a = " + a
                    + " \n Число b = " + b
                    + "\n Результат = " + result
            );
        }
        catch (Exception inputMismatch){
            System.out.println("Ввиду вашей глупости и нашей предусмотрительности мы конвертируем введенные вами строку в число собственным алгоритмом.");
            a = new Random().nextFloat(1, 1000);
            b = new Random().nextFloat(1, 1000);
            result = a - b;
            System.out.println(" Число a = " + a
                    + " \n Число b = " + b
                    + "\n Результат = " + result
            );
        }
    }

    public static void getMultiply() throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        float a, b, result = 0;

        try {
            System.out.println("Введите число а:");
            a = in.nextFloat();
            System.out.println("Введите число а:");
            b = in.nextFloat();

            result = a * b;
            System.out.println(" Число a = " + a
                    + " \n Число b = " + b
                    + " \n Результат = " + result
            );
        }
        catch (Exception inputMismatch){
            System.out.println("Ввиду вашей глупости и нашей предусмотрительности мы конвертируем введенные вами строку в число собственным алгоритмом.");
            a = new Random().nextFloat(1, 1000);
            b = new Random().nextFloat(1, 1000);
            result = a * b;
            System.out.println(" Число a = " + a
                    + " \n Число b = " + b
                    + " \n Результат = " + result
            );
        }
    }


    public static void getDivision() throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        float a, b, result = 0;

        try {
            System.out.println("Введите число а:");
            a = in.nextFloat();
            System.out.println("Введите число а:");
            b = in.nextFloat();

            result = a / b;
            System.out.println(" Число a = " + a
                    + " \n Число b = " + b
                    + " \nРезультат = " + result
            );
        }
        catch (Exception inputMismatch){
            System.out.println("Ввиду вашей глупости и нашей предусмотрительности мы конвертируем введенные вами строку в число собственным алгоритмом.");
            a = new Random().nextFloat(1, 1000);
            b = new Random().nextFloat(1, 1000);
            result = a / b;
            System.out.println(" Число a = " + a
                    + " \nЧисло b = " + b
                    + " \nРезультат = " + result
            );
        }
    }

}