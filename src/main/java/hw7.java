import java.util.Scanner;

//Дан массив из 5 целых чисел. Вывести в консоль результат деления суммы элементов массива на их количество.
//Автор: Раис Гилязов
public class hw7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ваших чисел: ");
        int w = scanner.nextInt();
        int[] numbers = new int[w];
        System.out.println("Введите целые числа:");
        for (int i = 0; i < w; i++) {
            numbers[i]= scanner.nextInt();
        }
        double sum=0; //исправил на тип double
        for (int j = 0; j < w; j++) {
            sum = sum + numbers[j];
        }
        System.out.println("Среднее арифмитическое = " + sum/w);
    }
}
