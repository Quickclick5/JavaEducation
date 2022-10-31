package Lr3;

import java.util.Scanner;

public class example08_02 {

        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String str = in.nextLine();

        System.out.println("1) Через метод Switch: ");

        switch (str) {
            case  "Понедельник" -> System.out.println("Понедельник - 1");
            case  "Вторник" -> System.out.println("Вторник - 2");
            case  "Среда" -> System.out.println("Среда - 3");
            case  "Четверг" -> System.out.println("Четверг - 4");
            case  "Пятница" -> System.out.println("Пятница - 5");
            case  "Суббота" -> System.out.println("Суббота - 6");
            case  "Воскресенье" -> System.out.println("Воскресенье - 7");
            default -> System.out.println("Введено некорректное значение");
        }
        System.out.println("2) Через метод If: ");
        if (str.equalsIgnoreCase("Понедельник")) System.out.println("Понедельник - 1");
        else if (str.equalsIgnoreCase("Вторник")) System.out.println("Вторник - 2");
        else if (str.equalsIgnoreCase("Среда")) System.out.println("Среда - 3");
        else if (str.equalsIgnoreCase("Четверг")) System.out.println("Четверг - 4");
        else if (str.equalsIgnoreCase("Пятница")) System.out.println("Пятница - 5");
        else if (str.equalsIgnoreCase("Суббота")) System.out.println("Суббота - 6");
        else if (str.equalsIgnoreCase("Воскресенье")) System.out.println("Воскресенье - 7");
        else System.out.println("Введено некорректное значение");
    }
    }