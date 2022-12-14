package hva.se;

public class Pancake implements Comparable<Pancake>{

    private final double diameter;


    public Pancake(double diameter) {
        if (diameter <= 0) throw new IllegalArgumentException("Diameter can not be zero or negative");
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public int compareTo(Pancake other) {
        return Double.compare(diameter, other.diameter);
    }
}
