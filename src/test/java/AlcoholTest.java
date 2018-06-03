import Sectors.AlcoholBrand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlcoholTest {

    AlcoholBrand alcoholBrand;

    @Before
    public void before(){
        alcoholBrand = new AlcoholBrand("Jack Daniel's", 5522, 20, true, 5532);
    }

    @Test
    public void hasName(){
        assertEquals("Jack Daniel's", alcoholBrand.getName());
    }

    @Test
    public void hasPurchaseCost(){
        assertEquals(5522, alcoholBrand.getPurchaseCost(), 0.01);
    }

    @Test
    public void hasAdditionalCost(){
        assertEquals(20, alcoholBrand.getAdditionalCost(), 0.01);
    }

    @Test
    public void isMarkedFavourite(){
        assertTrue(alcoholBrand.isMarkedFavourite());
    }

    @Test
    public void hasMarketValue(){
        assertEquals(5532, alcoholBrand.getMarketValue());
    }



}
