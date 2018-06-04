package Sectors;

import Interfaces.ITrade;

import java.util.ArrayList;

public class AlcoholBrand extends Brand {

    private ArrayList<AlcoholBrand> sectorlist;

    public AlcoholBrand(String name, int purchaseCost, int additionalCost, String acquisitionDate, boolean favourite, int marketValue) {
        super(name, purchaseCost, additionalCost, acquisitionDate, favourite, marketValue);
        this.sectorlist = new ArrayList<>();
    }

    public int countSectorList() {
        return this.sectorlist.size();
    }

    public void addBrandToList(AlcoholBrand newBrand) {
        this.sectorlist.add(newBrand);
        System.out.println(sectorlist.toString());
    }

    public void removeBrandFromList(AlcoholBrand newBrand) {
        this.sectorlist.remove(newBrand);
    }

    @Override
    public int calculateTotalPurchaseCost() {
        return this.purchaseCost + this.additionalCost;
    }





}
