package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    private static Object pub;

    public static void main(String[] args) {

//        Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида
//        text~num
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.




        LinkedList<String> ln = new LinkedList<String>();
        System.out.printf("Введите текст в формате - текст~номер: \n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            System.out.println(name);
            String[] result = name.split("\\~");
            System.out.println(Arrays.toString(result));

            int a = Integer.parseInt(result[1]);
            if (result[0].equals("print")) {
                System.out.println(ln.get(a - 1));
                ln.remove(a - 1);


            } else if (a < ln.size()) {
                ln.set(a - 1, result[0]);
            } else {
                ln.add(result[0]);
            }
            System.out.println(ln);

        }
    }
}

