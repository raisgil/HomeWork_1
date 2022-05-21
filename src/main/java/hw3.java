import java.util.Scanner;
//Дан массив из 5 символов. Сформировать из данного массива строку, начиная с конца и вывести её в консоль.
//Автор: Раис Гилязов
public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int w = scanner.nextInt();
        char[] symbol = new char[w];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < symbol.length; i++) {
            symbol[i] = scanner.next().charAt(0);
        }
            for (int i = symbol.length-1; i >=0; i--) {
                System.out.print(symbol[i]);
            }
            System.out.println();
    }
}
