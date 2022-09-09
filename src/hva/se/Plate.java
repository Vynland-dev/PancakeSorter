package hva.se;

import java.util.ArrayDeque;

public class Plate<E> extends ArrayDeque<Pancake> {


    private boolean isValid(Pancake pancake) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        if (this.size() > 25){
            throw new ArrayIndexOutOfBoundsException("Number of elements exceed limit (25)");
        }

        if (this.stream().anyMatch(e -> e.getDiameter() == pancake.getDiameter())) {
            throw new IllegalArgumentException("Element already exists");
        }

        return true;
    }


    public void addFirst(Pancake pancake) {
        if (isValid(pancake)) super.addFirst(pancake);
    }

    public void addLast(Pancake pancake) {
        if (isValid(pancake)) super.addLast(pancake);
    }



}
