package org.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruct> {

    private List<T> fructs;

    public Box(ArrayList<T> fructs) {
        this.fructs = fructs;
    }
    public Box() {
        this.fructs = new ArrayList<>();
    }

    public void add(T fruct){
        fructs.add((T) fruct);
    }
    public float getWeight() {
        float weight = 0.0f;
        for (T fruсt : fructs) {
            if (fruсt instanceof Apple) {
                weight += 1.0f * fruсt.getAmount() ;
            } else if (fruсt instanceof Orange) {
                weight += 1.5f *fruсt.getAmount() ;
            }
        }
        return weight;
    }
    public boolean compare(Box<?> otherBox) {
        return (this.getWeight() - otherBox.getWeight()) == 0;
    }

    public void transferFruits(Box<T> otherBox) {
        for (T fruct : fructs) {
            otherBox.add(fruct);
        }
        fructs.clear();
    }
}
