import Interfaces.ISpent;
import Sectors.AlcoholBrand;
import Sectors.ApparelBrand;
import Sectors.Brand;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<ISpent> brandList;

    public Portfolio(){
        this.brandList = new ArrayList<ISpent>();
    }

    public int countBrandList() {
        return this.brandList.size();
    }

    public void addBrandToList(Brand newBrand) {
        this.brandList.add(newBrand);
    }

    public void removeBrandFrombrandList(Brand newBrand) {
        this.brandList.remove(newBrand);
    }



//Caluclate total spent on al objects - for loop in brandList
// Count number items from a subclass   Loop through arraylist
//    For loop pull out brand from a sector
}
