import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int number = in.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int number1 = in.nextInt();
        in.close();
        char abc = 'a';


        char[][] multi = new char[number][number1];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number1; j++) {
                multi[i][j] = abc;
                System.out.print(multi[i][j] + " ");

            }
            abc++;
            System.out.println();
        }
    }
}

