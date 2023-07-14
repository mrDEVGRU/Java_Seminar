package Seminar_java_1;

import java.util.Scanner;

public class Program3 {
    // 3) Реализовать простой калькулятор
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ops (+, -, *, /): ");
        String s = sc.nextLine();
        System.out.print("Input number: ");
        int number1 = sc.nextInt();
        System.out.print("Input number: ");
        int number2 = sc.nextInt();

        System.out.print(getResult(number1, number2, s));

        sc.close();
    }

    public static Integer getResult(int number1, int number2, String s) {
        int result = 0;
        switch (s) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return result;
    }
}
