package hva.se;

import java.util.ArrayList;


public class Plate<E> extends ArrayList<Pancake> {

    public Plate(Pancake pancake) {
        super();
        this.add(pancake);
    }

    private boolean isValid(Pancake pancake) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
        int maxSize = 25;

        if (this.size() > maxSize) {
            throw new ArrayIndexOutOfBoundsException("Number of elements exceed limit (25)");
        }

        System.out.println(this.size());
        if (this.stream().anyMatch(e -> e.getDiameter() == pancake.getDiameter())) {
            throw new IllegalArgumentException("Element already exists");
        }

        return true;
    }


    public boolean add(Pancake pancake) {
        if (isValid(pancake)) super.add(pancake);
        return true;
    }


    public void pancakeSort() {
    }
}
