import java.util.Scanner;
//Дана строка нечетной длины. Вывести в консоль символ, который находится ровно посередине слова.
//Автор: Раис Гилязов
public class hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Введите слово: ");
            String word = scanner.nextLine();
            char[] wordsplit = word.toCharArray();
            if ((wordsplit.length % 2) == 0) {
                System.out.println("Введите слово, количество букв в котором нечетно!");
            } else {
                System.out.println("Буква посередине: " + word.substring((wordsplit.length / 2), ((wordsplit.length) / 2) + 1));
                break;
            }
        }
    }
}
