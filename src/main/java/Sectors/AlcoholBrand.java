package Sectors;

import Interfaces.ITrade;

import java.util.ArrayList;

public class AlcoholBrand extends Brand {

//    public ArrayList<AlcoholBrand> sectorList1;

    public AlcoholBrand(String name, int purchaseCost, int additionalCost, String acquisitionDate, boolean favourite, int marketValue) {
        super(name, purchaseCost, additionalCost, acquisitionDate, favourite, marketValue);
    }

//    public int countSectorList() {
//        return this.sectorList1.size();
//    }
//
//    public void addBrandToList(AlcoholBrand newBrand) {
//        this.sectorList1.add(newBrand);
//    }
//
//    public void removeBrandFromList(AlcoholBrand newBrand) {
//        this.sectorList1.remove(newBrand);
//    }

    @Override
    public int calculateTotalPurchaseCost() {
        return this.purchaseCost + this.additionalCost;
    }

//    @Override
//    public int calculateMarketValueOfBrands() {
//        int totalMarketValue = 0;
//        for (AlcoholBrand marketValue : sectorList1){
//            totalMarketValue += marketValue.calculateMarketValueOfBrands();
//        }
//        return totalMarketValue;
//    }



}
