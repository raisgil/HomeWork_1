import java.util.Scanner;
//Дана строка и символ. В консоль вывести индекс строки, на котором находится данный символ.
//Автор: Раис Гилязов
public class hw8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        System.out.print("Введите букву: ");
        char letter = scanner.next().charAt(0);
        System.out.println("Буква " + letter + " находится под индексом: " + word.indexOf(letter));
    }
}
