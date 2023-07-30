package org.geekbrains.lesson4.homework;

public class Homework {

    /**
     * Задача:
     *
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     * @param args
     */


    public static void main(String[] args) {
        Apple apple = new Apple(2);
        Box<Apple> apples = new Box<>();
        Orange orange = new Orange(3);
        Box<Orange> oranges = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        apples.add(apple);
        apples.add(apple);
        oranges.add(orange);
        System.out.println(apples.getWeight());
        System.out.println(oranges.getWeight());
        System.out.println(apples.compare(oranges));
        System.out.println(oranges.compare(oranges));
        System.out.println(orangeBox.getWeight());
        oranges.transferFruits(orangeBox);
        System.out.println(oranges.getWeight());
        System.out.println(orangeBox.getWeight());
    }

}
