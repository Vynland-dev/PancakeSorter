package hva.se;

import java.util.ArrayDeque;

public class Plate<E> extends ArrayDeque<Pancake> {



    public void addFirst(Pancake pancake) throws IllegalArgumentException {
        if (this.stream().noneMatch(e -> e.getDiameter() == pancake.getDiameter())){
            super.addFirst(pancake);
        } else {
            throw new IllegalArgumentException("Element already exists");
        }
    }

    public void addLast(Pancake pancake) throws IllegalArgumentException {
        if (this.stream().noneMatch(e -> e.getDiameter() == pancake.getDiameter())){
            super.addFirst(pancake);
        } else {
            throw new IllegalArgumentException("Element already exists");
        }
    }



}
