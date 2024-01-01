package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        // Создаем первоначальный список
        List<Double> listNumber = new ArrayList<>();
        listNumber.add(2d);
        listNumber.add(1d);
        listNumber.add(4d);
        listNumber.add(5d);
        listNumber.add(10d);
        listNumber.add(12d);
        listNumber.add(20d);

        // Выводим на экран первоначальный список
        System.out.println("Список чисел: " + listNumber);

        // Выделяем из списка четные числа
        List<Double> listNumber1 = listNumber.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Список четных чисел: " + listNumber1);

        // Считаем среднее значение всех четных чисел
        OptionalDouble averageValue = listNumber1.stream().mapToInt(Double::intValue).average();
        System.out.println("Среднее значение: " + averageValue.getAsDouble());
    }
}