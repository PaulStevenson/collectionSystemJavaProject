package Sectors;

import java.util.ArrayList;

public class AlcoholBrand extends Brand{

    private ArrayList<AlcoholBrand> brandslist;

    public AlcoholBrand(String name, int purchaseCost, int additionalCost, boolean favourite, int marketValue) {
        super(name, purchaseCost, additionalCost, favourite, marketValue);
        this.brandslist = new ArrayList<AlcoholBrand>();

    }


    public int countBrandList() {
        return this.brandslist.size();
    }
}
