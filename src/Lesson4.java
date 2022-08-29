import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = in.nextInt();

        int sum = 0;
        for(int i = 1; i <= number; i++) {
            sum = sum + i;

        }
        System.out.println("Сумма чисел от 1 до 10" +  " " + "=" + " " + sum);
    }
}

