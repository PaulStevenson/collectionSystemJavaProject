import Interfaces.ITrade;
import Sectors.AlcoholBrand;
import Sectors.ApparelBrand;
import Sectors.Brand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortfolioTest {

    Portfolio portfolio;
    Portfolio alcoholBrandList;
    ITrade alcoholBrand;
    ITrade apparelBrand;

    @Before
    public void before(){
        portfolio = new Portfolio();
        alcoholBrandList = new Portfolio();
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, "2018/06/04", true, 5532);
        apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573); {
        }
    }

    @Test
    public void canCountBrandList(){
        assertEquals(0, portfolio.countBrandList());
    }

    @Test
    public void canCountAlcoholBrandList(){
        assertEquals(0, alcoholBrandList.countAlcoholBrandList());
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
        alcoholBrandList.addAlcoholBrandToList(alcoholBrand);
        assertEquals(1, alcoholBrandList.countAlcoholBrandList());
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
        Brand newAlcohol = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375);
        portfolio.addBrandToList(newAlcohol);
        portfolio.removeBrandFromAlcoholBrandList((AlcoholBrand) newAlcohol);
        assertEquals(0, alcoholBrandList.countAlcoholBrandList());
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



}
