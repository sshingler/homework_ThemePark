package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double startingPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.startingPrice = 4.50;
    }

    @Override
    public double defaultPrice() {
        return this.startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        defaultPrice();
        double newPrice = 0;
        if (visitor.getAge() < 12){
            newPrice = defaultPrice() * 0.5;
        } else {
            newPrice = defaultPrice();
        }
        return newPrice;
    }
}
