import java.util.Scanner;
//Дана строка и символ. В консоль вывести индекс строки, на котором находится данный символ.
//Автор: Раис Гилязов
public class hw_8_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        System.out.print("Введите букву: ");
        char letter = scanner.next().charAt(0);
        char[] array = word.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (letter == array[i]){
                System.out.println("Буква " + letter + " находится под индексом: " + i);
            }
        }
    }
}
