import Sectors.AlcoholBrand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlcoholTest {

    AlcoholBrand alcoholBrand;

    @Before
    public void before() {
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, true, 5532);
    }

    @Test
    public void hasName() {
        assertEquals("Jack Daniel's", alcoholBrand.getName());
    }

    @Test
    public void hasPurchaseCost() {
        assertEquals(5522, alcoholBrand.getPurchaseCost(), 0.01);
    }

    @Test
    public void hasAdditionalCost() {
        assertEquals(20, alcoholBrand.getAdditionalCost(), 0.01);
    }

    @Test
    public void isMarkedFavourite() {
        assertTrue(alcoholBrand.isMarkedFavourite());
    }

    @Test
    public void hasMarketValue() {
        assertEquals(5532, alcoholBrand.getMarketValue());
    }

    @Test
    public void canSetAsFavourite() {
        AlcoholBrand alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, false, 5532);
        alcoholBrand.setAsFavourite(true);
        assertEquals(true, alcoholBrand.isMarkedFavourite());
    }

    @Test
    public void setMarketValue() {
        AlcoholBrand alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, true, 5532);
        alcoholBrand.setMarketValue(6000);
        assertEquals(6000, alcoholBrand.getMarketValue());
    }

    @Test
    public void countSectorlist(){
        assertEquals(0, alcoholBrand.countSectorList());
    }

    @Test
    public void canAddToSectorList(){
        AlcoholBrand newBrand = new AlcoholBrand("Budwieser", 15375, 20, false, 15375);
        alcoholBrand.addBrandToList(newBrand);
        assertEquals(1, alcoholBrand.countSectorList());
    }

    @Test
    public void canRemoveFromSectorList(){
        AlcoholBrand newBrand = new AlcoholBrand("Budwieser", 15375, 20, false, 15375);
        alcoholBrand.addBrandToList(newBrand);
        alcoholBrand.removeBrandFromList(newBrand);
        assertEquals(0, alcoholBrand.countSectorList());
    }

    @Test
    public void canCalculateTotalPurchaseCost(){
        assertEquals(5542, alcoholBrand.calculateTotalPurchaseCost());
    }



}



