package Exercise1;

import java.util.Scanner;

public class Scan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String firstWord = scanner.next();
        System.out.print("Введите второе слово: ");
        String secondWord = scanner.next();

        if (firstWord.length() % 2 != 0 || secondWord.length() % 2 != 0) {
            System.out.println("Слова должны содержать четное количество букв");
            return;
        }

        int firstHalfLength = firstWord.length() / 2;
        int secondHalfLength = secondWord.length() / 2;

        String resultingWord = firstWord.substring(0, firstHalfLength) + secondWord.substring(secondHalfLength);

        System.out.println("Результат: " + resultingWord);
    }

}
