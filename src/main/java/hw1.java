import java.util.Scanner;
//Дан массив целых чисел. Поменять местами первый и последний элемент и вывести полученный массив.
//Автор: Раис Гилязов
public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер будущего массива: ");
        int w = scanner.nextInt();
        int[] numbers = new int[w];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int a = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = a;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+", ");
        }
    }
}
