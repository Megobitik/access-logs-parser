import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int numberTwo = new Scanner(System.in).nextInt();

        double quotient = (double) number / numberTwo;
            System.out.println("Частное чисел " +quotient);
        int summ = (int) number + numberTwo;
            System.out.println("Сумма чисел " +summ);
        int minus = (int) number - numberTwo;
            System.out.println("Разность чисел " +minus);
        int multiplication = (int) number * numberTwo;
            System.out.println("Произведение чисел " + multiplication);
        }
}
