import Interfaces.ITrade;
import Sectors.AlcoholBrand;
import Sectors.ApparelBrand;
import Sectors.Brand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortfolioTest {

    Portfolio portfolio;
    ITrade alcoholBrand;
    ITrade apparelBrand;

    @Before
    public void before(){
        portfolio = new Portfolio();
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, "2018/06/04", true, 5532);
        apparelBrand = new ApparelBrand("Zara", 16529, 15, "2018/06/04",false, 18573); {
        }
    }

    @Test
    public void canCountBrandList(){
        assertEquals(0, portfolio.countBrandList());
    }

    @Test
    public void canAddToBrandList(){
        ITrade alcoholBrand = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(1, portfolio.countBrandList());
    }

    @Test
    public void canRemoveFromBrandList(){
        Brand newBrand = new AlcoholBrand("Budwieser", 15375, 20, "2018/06/04",false, 15375);
        Brand newApparel = new ApparelBrand("H&M", 22536, 25, "2018/06/04", false, 20488);
        portfolio.addBrandToList(newBrand);
        portfolio.addBrandToList(newApparel);
        portfolio.removeBrandFrombrandList(newBrand);
        assertEquals(1, portfolio.countBrandList());
    }

    @Test
    public void canCalculateTotalSpendOnBrands(){
        portfolio.addBrandToList(apparelBrand);
        portfolio.addBrandToList(alcoholBrand);
        assertEquals(22086, portfolio.totalAmountSpentonBrands());
    }

//    @Test
//    public void canCalculateTotalMarketValueOfBrands(){
//        assertEquals(35863, portfolio.totalMarketValueOfBrands());
//    }
//
//    @Test
//    public void canCalculateSpendVsSellingPrice(){
//        assertEquals(-2019, portfolio.calculateSpendVsMarketValue());
//    }

//    @Test
//    public void totalMarketValueOfBrands(){
//        assertEquals(24105, portfolio.totalMarketValueOfBrands());
//    }


}
