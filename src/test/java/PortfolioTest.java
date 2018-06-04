import Interfaces.ISpent;
import Sectors.AlcoholBrand;
import Sectors.Brand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PortfolioTest {

    Portfolio portfolio;
    ISpent brand;

    @Before
    public void before(){
        portfolio = new Portfolio();
        brand = new AlcoholBrand("Jack Daniel's", 5522, 20, true, 5532);
    }

    @Test
    public void canCountBrandList(){
        assertEquals(0, portfolio.countBrandList());
    }

    @Test
    public void canAddToBrandList(){
        AlcoholBrand newBrand = new AlcoholBrand("Budwieser", 15375, 20, false, 15375);
        portfolio.addBrandToList(newBrand);
        assertEquals(1, portfolio.countBrandList());
    }

    @Test
    public void canRemoveFromBrandList(){
        AlcoholBrand newBrand = new AlcoholBrand("Budwieser", 15375, 20, false, 15375);
        portfolio.addBrandToList(newBrand);
        portfolio.removeBrandFrombrandList(newBrand);
        assertEquals(0, portfolio.countBrandList());
    }

}
