package Seminar_java_1;

public class Program2 {
    // 2) Вывести все простые числа от 1 до 1000
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (checkSimple(i))
                System.out.print(i + " ");
        }
    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
