import Interfaces.ITrade;
import Sectors.AlcoholBrand;
import Sectors.ApparelBrand;
import Sectors.Brand;
import jdk.management.resource.internal.ApproverGroup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortfolioTest {

    Portfolio portfolio;
    AlcoholBrand alcoholBrand;
    ApparelBrand apparelBrand;

    @Before
    public void before(){
        portfolio = new Portfolio();
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, "2018/06/04", true, 5532, false);
        apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573, false);
    }

    @Test
    public void canCountBrandList(){
        assertEquals(0, portfolio.countBrandList());
    }

    @Test
    public void canCountAlcoholBrandList(){
        assertEquals(0, portfolio.countAlcoholBrandList());
    }

    @Test
    public void canCountApparelBrandList(){
        assertEquals(0, portfolio.countApparelBrandList());
    }

    @Test
    public void canAddToBrandList(){
        Brand alcoholBrand = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375, false);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(1, portfolio.countBrandList());
    }

    @Test
    public void canAddToAlcoholBrandList(){
        AlcoholBrand alcoholBrand = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375, false);
        portfolio.addAlcoholBrandToList(alcoholBrand);
        assertEquals(1, portfolio.countAlcoholBrandList());
    }

    @Test
    public void canAddToApparelBrandList(){
        ApparelBrand apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573, false);
        portfolio.addApparelBrandToList(apparelBrand);
        assertEquals(1, portfolio.countApparelBrandList());
    }

    @Test
    public void canRemoveFromBrandList(){
        Brand newAlcohol = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375, false);
        Brand newApparel = new ApparelBrand("H&M", 22536, 25, "2018/06/04", false, 20488, false);
        portfolio.addBrandToList(newAlcohol);
        portfolio.addBrandToList(newApparel);
        portfolio.removeBrandFrombrandList(newAlcohol);
        assertEquals(1, portfolio.countBrandList());
    }

    @Test
    public void canRemoveFromAlcoholBrandList(){
        AlcoholBrand newAlcohol = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375, false);
        portfolio.addBrandToList(newAlcohol);
        portfolio.removeBrandFromAlcoholBrandList(newAlcohol);
        assertEquals(0, portfolio.countAlcoholBrandList());
    }

    @Test
    public void canRemoveFromApprelBrandList(){
       ApparelBrand apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573, false);
        portfolio.addApparelBrandToList(apparelBrand);
        portfolio.removeBrandFromApparelBrandList(apparelBrand);
        assertEquals(0, portfolio.countApparelBrandList());
    }

//    Single Brand

    @Test
    public void canCalculateDifferenceBetweenMarketValueAndTotalSpend(){
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 10, 2, "2018/06/04", true, 20, false);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(8, portfolio.calculateDifferenceBetweenMarketValueAndTotalSpend());
    }

    @Test
    public void canGetDifferenceAsPercentage() {
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 10, 2, "2018/06/04", true, 20, false);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(66.66, portfolio.percentageChangeBetweenValueAndSpend(), 0.01);
    }

//    @Test
//    public void canCheckIfSellable(){
//        alcoholBrand = new AlcoholBrand("Jack Daniel's", 10, 2, "2018/06/04", true, 20, false);
//        portfolio.addBrandToList(alcoholBrand);
//        assertEquals(true, portfolio.checkIfSellable());
//    }


//    All Brands
    @Test
    public void canCalculateTotalSpendOnBrands(){
        portfolio.addBrandToList(apparelBrand);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(22086, portfolio.totalAmountSpentonBrands());
    }

    @Test
    public void canCalculateTotalMarketValueOfBrands(){
        portfolio.addBrandToList(apparelBrand);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(24105, portfolio.totalMarketValueOfBrands());
    }

    @Test
    public void canGetDifferenceBetweenMarketValueAndTotalSpend(){
        portfolio.addBrandToList(apparelBrand);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(2019, portfolio.differenceBetweenValueAndSpendOfAll());
    }

    @Test
    public void canGetDifferenceasPercentageOfAll(){
        portfolio.addBrandToList(apparelBrand);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(9.14, portfolio.percentageChangeBetweenValueAndSpendofAll(), 0.01);
    }




}
