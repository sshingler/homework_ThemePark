import attractions.Dodgems;
import attractions.Park;
import attractions.RollerCoaster;
import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;
import behaviours.IReviewed;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ThemeParkTest {

    ThemePark themePark;

    Dodgems dodgems;
    Park park;
    RollerCoaster rollerCoaster;
    Playground playground;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void SetUp() {
        dodgems = new Dodgems("BumperCars", 6);
        park = new Park("ParkGreen", 4);
        rollerCoaster = new RollerCoaster("BigDipper", 9);
        playground = new Playground("PlayTime", 4);
        candyflossStall = new CandyflossStall("StickyTown", "Sugar Lee", ParkingSpot.A1, 5);
        iceCreamStall = new IceCreamStall("IceTown", "Ice Dave", ParkingSpot.A2, 7);
        tobaccoStall = new TobaccoStall("SmokeyTown", "Smokey Joe", ParkingSpot.A3, 9);

        themePark = new ThemePark("Big Park", dodgems,park,rollerCoaster,playground,candyflossStall,iceCreamStall,tobaccoStall);
    }

    @Test
    public void canGetAllReviewed(){
        ArrayList<IReviewed> allReviewedObjects = new ArrayList<>();
        allReviewedObjects.add(dodgems);
        allReviewedObjects.add(park);
        allReviewedObjects.add(rollerCoaster);
        allReviewedObjects.add(playground);
        allReviewedObjects.add(candyflossStall);
        allReviewedObjects.add(iceCreamStall);
        allReviewedObjects.add(tobaccoStall);
        assertEquals(allReviewedObjects, themePark.getAllReviewed());
    }

}
