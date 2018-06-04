package Sectors;

import Interfaces.ISpent;

import java.util.ArrayList;

public class ApparelBrand extends Brand implements ISpent {

    private ArrayList<ApparelBrand> ApparelList;

    public ApparelBrand(String name, int purchaseCost, int additionalCost, String acquisitionDate, boolean favourite, int marketValue) {
        super(name, purchaseCost, additionalCost, acquisitionDate, favourite, marketValue);
        this.ApparelList = new ArrayList<>();
    }

    public int countApparelList() {
        return this.ApparelList.size();
    }

    public void addBrandToApparelList(ApparelBrand newBrand) {
        this.ApparelList.add(newBrand);
        System.out.println(ApparelList.toString());
    }

    public void removeBrandFromApparelList(ApparelBrand newBrand) {
        this.ApparelList.remove(newBrand);
    }

    @Override
    public int calculateTotalPurchaseCost() {
        return this.purchaseCost + this.additionalCost;
    }

}
