import attractions.Dodgems;
import attractions.Park;
import attractions.RollerCoaster;
import attractions.Playground;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.TobaccoStall;
import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private Dodgems dodgems;
    private Park park;
    private RollerCoaster rollerCoaster;
    private Playground playground;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;

    public ThemePark(String name,
                     Dodgems dodgems,
                     Park park,
                     RollerCoaster rollerCoaster,
                     Playground playground,
                     CandyflossStall candyflossStall,
                     IceCreamStall iceCreamStall,
                     TobaccoStall tobaccoStall) {
        this.name = name;
        this.dodgems = dodgems;
        this.park = park;
        this.rollerCoaster = rollerCoaster;
        this.playground = playground;
        this.candyflossStall = candyflossStall;
        this.iceCreamStall = iceCreamStall;
        this.tobaccoStall = tobaccoStall;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allVenues = new ArrayList<>();
        allVenues.add(this.dodgems);
        allVenues.add(this.park);
        allVenues.add(this.rollerCoaster);
        allVenues.add(this.playground);
        allVenues.add(this.candyflossStall);
        allVenues.add(this.iceCreamStall);
        allVenues.add(this.tobaccoStall);
        return allVenues;
    }
}
