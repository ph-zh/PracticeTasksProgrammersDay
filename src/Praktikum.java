/*
Ваш будущий профессиональный праздник принято отмечать в 256-й день года.
В не високосный год он выпадает на 13 сентября, в високосный — на 12 сентября.
Напишите программу для определения даты празднования дня программиста.
Формат данных:
На вход программа должна получать номер года, а на выходе выводить дату
праздника в формате дд.мм.гггг.
Например, ввод: 2000, вывод: 12.09.2000.
Информационная справка:
Порядок определения високосного года:
•	год, номер которого кратен 400, — високосный;
•	остальные годы, номер которых кратен 100, — не високосные
(например, годы 1700, 1800, 1900, 2100, 2200, 2300);
•	остальные годы, номер которых кратен 4, — високосные.
Условия прохождения проверки:
Код компилируется без ошибок.
Логика работы программы соответствует условию задачи.
Формат вывода соответствует условию задачи.
 */
import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("removed class Main");

//        if (isLeapYear(year)) {
//            // здесь нужно вывести результат
//        }
//    }
//
//    public static boolean isLeapYear(int year) {
//        // здесь нужно определить, является ли переданный год високосным
//    }
    }
}