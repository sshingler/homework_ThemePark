package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double startingPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.startingPrice = 8.40;
    }

    @Override
    public boolean isAllowedTO(Visitor visitor) {
        boolean isAllowed = false;
        if (visitor.getHeight() > 145 && visitor.getAge() > 12){
            isAllowed = true;
        } else {
            isAllowed = false;
        }
        return isAllowed;
    }

    @Override
    public double defaultPrice() {
        return this.startingPrice;
    }

    @Override
    public double priceFor(Visitor visitor) {
        defaultPrice();
        double newPrice = 0;
        if (visitor.getHeight() > 200) {
            newPrice = defaultPrice() * 2;
        } else {
            newPrice = defaultPrice();
        }
        return newPrice;
    }
}
