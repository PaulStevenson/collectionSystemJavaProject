import Interfaces.ITrade;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<ITrade> brandList;

    public Portfolio() {
        this.brandList = new ArrayList<ITrade>();
    }

    public int countBrandList() {
        return this.brandList.size();
    }

    public void addBrandToList(ITrade newBrand) {
        this.brandList.add(newBrand);
    }

    public void removeBrandFrombrandList(ITrade newBrand) {
        this.brandList.remove(newBrand);
    }

    public int totalAmountSpentonBrands() {
        int total = 0;
        for (ITrade newBrand : brandList) {
            total += newBrand.calculateTotalPurchaseCost();
        }
        return total;
    }

//    public int totalMarketValueOfBrands() {
//        int totalMarketValue = 0;
//        for (ITrade marketValue : brandList) {
//            totalMarketValue += marketValue();
//        }
//        return totalMarketValue;
//    }


//    public int calculateSpendVsMarketValue() {
//        return totalAmountSpentonBrands() - totalMarketValueOfBrands();
//    }


}

//Caluclate total spent on al objects - for loop in brandList
// Count number items from a subclass   Loop through arraylist
//    For loop pull out brand from a sector

