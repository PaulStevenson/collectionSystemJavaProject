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
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, "2018/06/04", true, 5532);
        apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573);
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
        Brand alcoholBrand = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(1, portfolio.countBrandList());
    }

    @Test
    public void canAddToAlcoholBrandList(){
        AlcoholBrand alcoholBrand = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375);
        portfolio.addAlcoholBrandToList(alcoholBrand);
        assertEquals(1, portfolio.countAlcoholBrandList());
    }

    @Test
    public void canAddToApparelBrandList(){
        ApparelBrand apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573);
        portfolio.addApparelBrandToList(apparelBrand);
        assertEquals(1, portfolio.countApparelBrandList());
    }

    @Test
    public void canRemoveFromBrandList(){
        Brand newAlcohol = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375);
        Brand newApparel = new ApparelBrand("H&M", 22536, 25, "2018/06/04", false, 20488);
        portfolio.addBrandToList(newAlcohol);
        portfolio.addBrandToList(newApparel);
        portfolio.removeBrandFrombrandList(newAlcohol);
        assertEquals(1, portfolio.countBrandList());
    }

    @Test
    public void canRemoveFromAlcoholBrandList(){
        AlcoholBrand newAlcohol = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375);
        portfolio.addBrandToList(newAlcohol);
        portfolio.removeBrandFromAlcoholBrandList(newAlcohol);
        assertEquals(0, portfolio.countAlcoholBrandList());
    }

    @Test
    public void canRemoveFromApprelBrandList(){
       ApparelBrand apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573);
        portfolio.addApparelBrandToList(apparelBrand);
        portfolio.removeBrandFromApparelBrandList(apparelBrand);
        assertEquals(0, portfolio.countApparelBrandList());
    }

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
        assertEquals(2019, portfolio.differenceBetweenValueAndSpend());
    }

    @Test
    public void canAddTotalSpendWithTotalMarketValue(){
        portfolio.addBrandToList(apparelBrand);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(46191, portfolio.TotalSpendPlusTotalMarketValue());
    }

    @Test
    public void calculateDifferenceAsPercentage(){
        portfolio.addBrandToList(apparelBrand);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(4.37, portfolio.differenceAsPercentage(),0.01);
    }


}
