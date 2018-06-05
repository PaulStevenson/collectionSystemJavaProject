package Sectors;

import Interfaces.ITrade;

import java.util.ArrayList;

public class ApparelBrand extends Brand {


    public ApparelBrand(String name, int purchaseCost, int additionalCost, String acquisitionDate,
                        boolean favourite, int marketValue) {
        super(name, purchaseCost, additionalCost, acquisitionDate, favourite, marketValue);

    }


    @Override
    public int calculateTotalPurchaseCost() {
        return this.purchaseCost + this.additionalCost;
    }

}
