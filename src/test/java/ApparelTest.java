import Sectors.ApparelBrand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ApparelTest {

    ApparelBrand apparelBrand;
    ApparelBrand apparelBrand2;

    @Before
    public void before() {
        apparelBrand = new ApparelBrand("H&M", 22536, 25, "2018/06/04", false, 20488);

        apparelBrand2 = new ApparelBrand("Paul", 22536, 25, "2018/06/04", false, 200);
    }


    @Test
    public void hasName() {
        assertEquals("H&M", apparelBrand.getName());
    }

    @Test
    public void hasPurchaseCost() {
        assertEquals(22536, apparelBrand.getPurchaseCost(), 0.01);
    }

    @Test
    public void hasAdditionalCost() {
        assertEquals(25, apparelBrand.getAdditionalCost(), 0.01);
    }

    @Test
    public void isMarkedFavourite() {
        assertEquals(false, apparelBrand.isMarkedFavourite());
    }

    @Test
    public void hasMarketValue() {
        assertEquals(20488, apparelBrand.getMarketValue());
    }

    @Test
    public void canSetFavouriteStatus() {
        apparelBrand.setFavouriteStatus(true);
        assertEquals(true, apparelBrand.isMarkedFavourite());
    }

    @Test
    public void setMarketValue() {
        apparelBrand = new ApparelBrand("H&M", 22536, 25, "2018/06/04", false, 20488);
        apparelBrand.setMarketValue(6000);
        assertEquals(6000, apparelBrand.getMarketValue());
    }

//    @Test
//    public void countSectorlist(){
//        assertEquals(0, apparelBrand.countApparelList());
//    }
//
//    @Test
//    public void canAddToSectorList(){
//        ApparelBrand newBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573);
//        apparelBrand.addBrandToApparelList(newBrand);
//        assertEquals(1, apparelBrand.countApparelList());
//    }
//
//    @Test
//    public void canRemoveFromSectorList(){
//        ApparelBrand newBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573);
//        apparelBrand.addBrandToApparelList(newBrand);
//        apparelBrand.removeBrandFromApparelList(newBrand);
//        assertEquals(0, apparelBrand.countApparelList());
//    }

    @Test
    public void canCalculateTotalPurchaseCost(){
        assertEquals(22561, apparelBrand.calculateTotalPurchaseCost());
    }

    @Test
    public void setDate(){
        apparelBrand.setAcquisitionDate("2017/05/04");
        assertEquals("2017/05/04", apparelBrand.getAcquisitionDate());
    }

    @Test
    public void canCalculateSpendVsSellingPrice(){
        assertEquals(2073, apparelBrand.calculateSpendVsMarketValue());
    }






}



