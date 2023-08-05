package org.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Сохранение в Json
 */

public class SaveOrderToJson {
    private Order order;
    public void saveToJson(Order order) {
        String fileName = "order_default.json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
