import java.util.Scanner;
//Дана строка длиной больше 5 символов. Вывести в консоль подстроку из первых 3 символов и последних 3 символов.
//Автор: Раис Гилязов
public class hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String word = scanner.nextLine();
        System.out.println("Первые три символа: "+ word.substring(0,3));
        System.out.println("Последние три символа: "+ word.substring(word.length()-3,word.length()));
    }
}
