import Interfaces.ITrade;
import Sectors.AlcoholBrand;
import Sectors.ApparelBrand;
import Sectors.Brand;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<ITrade> portfolioList;
    private ArrayList<AlcoholBrand> alcoholBrandList;
    private ArrayList<ApparelBrand> apparelBrandList;

    public Portfolio() {
        this.portfolioList = new ArrayList<ITrade>();
        this.alcoholBrandList = new ArrayList<AlcoholBrand>();
        this.apparelBrandList = new ArrayList<ApparelBrand>();
    }

    public int countBrandList() {
        return this.portfolioList.size();
    }

    public int countAlcoholBrandList() {
        return this.alcoholBrandList.size();
    }

    public int countApparelBrandList() {
        return this.apparelBrandList.size();
    }


    public void addBrandToList(ITrade newBrand) {
        this.portfolioList.add(newBrand);
    }

    public void addAlcoholBrandToList(AlcoholBrand newBrand) {
        this.alcoholBrandList.add(newBrand);
    }

    public void addApparelBrandToList(ApparelBrand newBrand) {
        this.apparelBrandList.add(newBrand);
    }


    public void removeBrandFrombrandList(Brand newAlcohol) {
        this.portfolioList.remove(newAlcohol);
    }

    public void removeBrandFromAlcoholBrandList(AlcoholBrand newBrand) {
        this.alcoholBrandList.remove(newBrand);
    }

    public void removeBrandFromApparelBrandList(ApparelBrand newBrand) {
        this.apparelBrandList.remove(newBrand);
    }

    //    Totals
    public int totalAmountSpentOnBrands() {
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

    public int differenceBetweenMarketValueAndSpendOfAll() {
        return totalMarketValueOfBrands() - totalAmountSpentOnBrands();
    }

    public double percentageChangeBetweenMarketValueAndSpendofAll() {
        return ((double) differenceBetweenMarketValueAndSpendOfAll() / (double) totalAmountSpentOnBrands()) * 100;
    }

}






