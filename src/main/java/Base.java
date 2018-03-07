//Домашняя работа: задание 1,2,3 - все выполнено.

import java.util.Scanner;

/**
 * @author Yulia Kim
 * @see #main(String[])
 */
public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose an option: 1 - calculator; 2 - array"); //длина массива задается из консоли
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter the first number:");
                double i = scanner.nextDouble();
                System.out.println("Enter the second number:");
                double j = scanner.nextDouble();

                double add = i + j; //сумма
                double sub = i - j; //разность
                double mult = i * j; //умножение
                double div = i / j; //деление

                System.out.print("\n Result of addition: ");
                System.out.printf("%f + %f = %20.4f", i, j, add); //вывод суммы

                System.out.print("\n Result of subtraction: ");
                System.out.printf("%f - %f = %20.4f", i, j, sub); //вывод разности

                System.out.print("\n Result of multiplication: ");
                System.out.printf("%f * %f = %20.4f", i, j, mult); //вывод умножения

                System.out.print("\n Result of division: ");
                System.out.printf("%f / %f = %20.4f", i, j, div); //вывод деления
            }
            break;

            case 2: {
                System.out.println("Enter the length of array:"); //длина массива задается из консоли
                int lengthOfArray = scanner.nextInt();

                String[] array = new String[lengthOfArray]; //объявление массива

                System.out.printf("Enter %d values of array: \n", lengthOfArray); //значения элементов массива задаются из консоли
                for (int i = 0; i < array.length; i++) {
                    String word = scanner.next();
                    array[i] = word;

                }

                int max = array[0].length(); //поиск длины самого длинного слова
                for (int k = 0; k < array.length; k++) {
                    if (array[k].length() > max) {
                        max = array[k].length();
                    }
                }

                for (int h = 0; h < array.length; h++) //поиск самого длинного слова(или слов)
                {
                    if (max == array[h].length())
                        System.out.println("The longest word: " + array[h]); //вывод самых длинных слов в массиве
                }


                System.out.println("Length of the longest word: " + max); //вывод количества знаков в длинном слове

            }
            break;
            default:
                System.out.println("Invalid choice"); //выбор отличается от 1 и 2
        }


    }

}