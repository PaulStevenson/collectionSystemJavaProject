import Sectors.AlcoholBrand;
import Sectors.ApparelBrand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AlcoholTest {

    AlcoholBrand alcoholBrand;


    @Before
    public void before() {
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, "2018/06/04", true, 5532, false);
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
        assertEquals(true, alcoholBrand.isMarkedFavourite());
    }

    @Test
    public void hasMarketValue() {
        assertEquals(5532, alcoholBrand.getMarketValue());
    }

    @Test
    public void canSetFavouriteStatus() {
        alcoholBrand.setFavouriteStatus(false);
        assertEquals(false, alcoholBrand.isMarkedFavourite());
    }

    @Test
    public void isSellable(){
        assertEquals(false, alcoholBrand.getSellable());
    }

    @Test
    public void setSellable(){
        alcoholBrand.setSellable(true);
        assertEquals(true, alcoholBrand.getSellable());

    }

    @Test
    public void setMarketValue() {
        AlcoholBrand alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, "2018/06/04",true, 5532, false);
        alcoholBrand.setMarketValue(6000);
        assertEquals(6000, alcoholBrand.getMarketValue());
    }

    @Test
    public void canCalculateTotalPurchaseCost(){
        assertEquals(5542, alcoholBrand.calculateTotalPurchaseCost());
    }

    @Test
    public void setDate(){
        alcoholBrand.setAcquisitionDate("2017/05/04");
        assertEquals("2017/05/04", alcoholBrand.getAcquisitionDate());
    }

    @Test
    public void canCalculateDifferenceBetweenMarketValueAndTotalSpend(){
        assertEquals(-10, alcoholBrand.calculateDifferenceBetweenMarketValueAndTotalSpend());
    }

    @Test
    public void canGetDifferenceasPercentage() {
        assertEquals(-0.18, alcoholBrand.percentageChangeBetweenValueAndSpend(), 0.01);
    }

    @Test
    public void canSetAsSellableTrue(){
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 10, 2, "2018/06/04", true, 20, false);
        alcoholBrand.checkIfSellable();
        assertEquals(true, alcoholBrand.getSellable());
    }

    @Test
    public void canSetAsSellableFalse(){
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 10, 2, "2018/06/04", true, 2, false);
        alcoholBrand.checkIfSellable();
        assertEquals(false, alcoholBrand.getSellable());
    }




}



