import java.util.Scanner;
//Даны 2 строки. В консоль вывести true, если первая строка является подстрокой второй строки, в противном случае вывести false.
//Автор: Раис Гилязов
public class hw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();
        System.out.println(word2.contains(word1));

    }
}
