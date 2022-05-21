import java.util.Scanner;
//Дан массив из 3 чисел с плавающей точкой. Вывести в консоль сумму, произведение и среднее этих чисел.
//Автор: Раис Гилязов
public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] numbers = new double [3];
        System.out.println("Введите три числа:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextDouble();
        }
        double sum = numbers[0] + numbers[1] + numbers[2];
        String sum_res = String.format("%.2f",sum);
        System.out.println("Сумма: " + sum_res);

        double multi = numbers[0] * numbers[1] * numbers[2];
        String multi_res = String.format("%.2f",multi);
        System.out.println("Произведение: " + multi_res);

        double middle = (numbers[0] + numbers[1] + numbers[2])/3;
        String middle_res = String.format("%.2f",middle);
        System.out.println("Среднее: " + middle_res);

    }
}
