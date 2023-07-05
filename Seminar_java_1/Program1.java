package Seminar_java_1;

import java.util.Scanner;

public class Program1 {
    // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
    // чисел от 1 до n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();
        System.out.printf("T number: %s\n", getNumber(number));

        sc.close();
    }

    static int getNumber(int n) {
        return n * (n + 1) / 2;
    }
}
