package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
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
}
