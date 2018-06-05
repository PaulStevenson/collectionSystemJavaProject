package Sectors;

import Interfaces.ITrade;

public class AlcoholBrand extends Brand implements ITrade{


    public AlcoholBrand(String name, int purchaseCost, int additionalCost, String acquisitionDate, boolean favourite, int marketValue) {
        super(name, purchaseCost, additionalCost, acquisitionDate, favourite, marketValue);
    }

    @Override
    public int calculateTotalPurchaseCost() {
        return this.purchaseCost + this.additionalCost;
    }

    @Override
    public int totalMarketValue() {
        return this.marketValue;
    }


}
