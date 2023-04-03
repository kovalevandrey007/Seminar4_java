package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public void main(String[] args) {
        ex1();
        ex2();
    }

//    1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//    2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

    public void ex1() {
        final int SIZE = 10_000_000;
        Random random = new Random();

        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(random.nextInt());
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Integer> arrayList = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(random.nextInt());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
    public void ex2() {
        final int SIZE = 100_000;
        Random random = new Random();

        List<Random> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(null);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Random> arrayList = new ArrayList<>(SIZE);
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(null);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }
}




