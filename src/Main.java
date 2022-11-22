import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int numberTwo = new Scanner(System.in).nextInt();

        int firstNumber = 5;
        int secondNumber = 10;

        double quotient = (double) firstNumber / secondNumber;
            System.out.println("Частное чисел " +quotient);
        int summ = (int) firstNumber + secondNumber;
            System.out.println("Сумма чисел " +summ);
        int minus = (int) firstNumber - secondNumber;
            System.out.println("Разность чисел " +minus);
        int multiplication = (int) firstNumber * secondNumber;
            System.out.println("Произведение чисел " + multiplication);
        }
}
