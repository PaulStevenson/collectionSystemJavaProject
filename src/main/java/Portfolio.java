import Interfaces.ITrade;
import Sectors.AlcoholBrand;
import Sectors.Brand;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<ITrade> portfolioList;
    private ArrayList<AlcoholBrand> alcoholBrandList;

    public Portfolio() {
        this.portfolioList = new ArrayList<ITrade>();
        this.alcoholBrandList = new ArrayList<AlcoholBrand>();
    }

    public int countBrandList() {
        return this.portfolioList.size();
    }

    public int countAlcoholBrandList() {
        return this.alcoholBrandList.size();
    }

    public void addBrandToList(ITrade newBrand) {
        this.portfolioList.add(newBrand);
    }

    public void addAlcoholBrandToList(AlcoholBrand newBrand) {
        this.alcoholBrandList.add(newBrand);
    }

    public void removeBrandFrombrandList(Brand newAlcohol) {
        this.portfolioList.remove(newAlcohol);
    }

    public void removeBrandFromAlcoholBrandList(AlcoholBrand newBrand) {
        this.alcoholBrandList.remove(newBrand);
    }

    public int totalAmountSpentonBrands() {
        int total = 0;
        for (ITrade newBrand : portfolioList) {
            total += newBrand.calculateTotalPurchaseCost();
        }
        return total;
    }

    public int totalMarketValueOfBrands() {
        int totalMarketValue = 0;
        for (ITrade marketValue : portfolioList) {
            totalMarketValue += marketValue.totalMarketValue();
        }
        return totalMarketValue;
    }
}




//CALCULATE TOTAL MARKET VALUE OF BRANDS, THEN DIFFERENCE BETWEEN SPEND AND VALUE!!!!!!!!!!!!!!

//
//


//    }

//    public int calculateSpendVsMarketValue() {
//        return calculateTotalPurchaseCost() - this.marketValue;
//    }







//Caluclate total spent on al objects - for loop in brandList
// Count number items from a subclass   Loop through arraylist
//    For loop pull out brand from a sector

