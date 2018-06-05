import Interfaces.ITrade;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<ITrade> brandList;
    private ArrayList<ITrade> alcoholBrandList;

    public Portfolio() {
        this.brandList = new ArrayList<ITrade>();
        this.alcoholBrandList = new ArrayList<ITrade>();
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



//CALCULATE TOTAL MARKET VALUE OF BRANDS, THEN DIFFERENCE BETWEEN SPEND AND VALUE!!!!!!!!!!!!!!

//
//

    public int totalMarketValueOfBrands() {
        int totalMarketValue = 0;
        for (ITrade marketValue : brandList) {
            totalMarketValue += marketValue.calculateMarketValueOfBrands();
        }
        return totalMarketValue;
    }

//    public int calculateSpendVsMarketValue() {
//        return calculateTotalPurchaseCost() - this.marketValue;
//    }





}

//Caluclate total spent on al objects - for loop in brandList
// Count number items from a subclass   Loop through arraylist
//    For loop pull out brand from a sector

