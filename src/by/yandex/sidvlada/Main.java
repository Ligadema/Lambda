package by.yandex.sidvlada;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        double a = Math.random() * 10;
        double b = Math.random() * 10;

        List<Integer> list = new ArrayList<>();
        list.add((int) a);
        list.add((int) b);

        for (Integer n : list) {
            boolean c = a > b;
            if (c == true) {
                list.set(0, (int) a);
                list.set(1, (int) b);
            } else {
                list.set(0, (int) b);
                list.set(1, (int) a);
            }
        }
        System.out.println("MAX: " + list.get(0) + "\nMIN: " + list.get(1));
    }
    }

