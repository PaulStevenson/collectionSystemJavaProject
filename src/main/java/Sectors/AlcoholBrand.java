package Sectors;

import java.util.ArrayList;

public class AlcoholBrand extends Brand{

    private ArrayList<AlcoholBrand> sectorlist;

    public AlcoholBrand(String name, int purchaseCost, int additionalCost, boolean favourite, int marketValue) {
        super(name, purchaseCost, additionalCost, favourite, marketValue);
        this.sectorlist = new ArrayList<AlcoholBrand>();

    }


    public int countSectorList() {
        return this.sectorlist.size();
    }

    public void addBrandToList(AlcoholBrand newBrand) {
        this.sectorlist.add(newBrand);

    }
}
