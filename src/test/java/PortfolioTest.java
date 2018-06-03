import Interfaces.ISpent;
import Sectors.AlcoholBrand;
import Sectors.Brand;
import org.junit.Before;

public class PortfolioTest {

    Portfolio portfolio;
    ISpent brand;

    @Before
    public void before(){
        brand = new AlcoholBrand("Jack Daniel's", 5522, 20, true, 5532);
    }

}
