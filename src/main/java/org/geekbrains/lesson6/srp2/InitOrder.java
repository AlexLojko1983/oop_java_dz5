package org.geekbrains.lesson6.srp2;

import java.util.Scanner;

/**
 * Консольный вариант получения данных для создания Order
 */
public class InitOrder {
    private Scanner scanner = new Scanner(System.in);

    private String name;
    private String product;
    private int qnt;
    private Double price;

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public Double getPrice() {
        return price;
    }

    public void inputFromConsole(){
        name = processInput("Имя клиента: ");
        product = processInput("Продукт: ");
        qnt = Integer.parseInt(processInput("Кол-во: "));
        price = Double.parseDouble(processInput("Цена: "));
    }

    private String processInput(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    @Override
    public String toString() {
        return "InitOrder{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }
}
