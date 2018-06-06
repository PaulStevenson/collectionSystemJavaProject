package Sectors;

import Interfaces.ITrade;

public class ApparelBrand extends Brand implements ITrade {


    public ApparelBrand(String name, int purchaseCost, int additionalCost, String acquisitionDate,
                        boolean favourite, int marketValue) {
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

    @Override
    public int calculateDifferenceBetweenMarketValueAndTotalSpend() {
            return this.marketValue - calculateTotalPurchaseCost();
    }

    @Override
    public double percentageChangeBetweenValueAndSpend() {
        return ((double) calculateDifferenceBetweenMarketValueAndTotalSpend() / (double) calculateTotalPurchaseCost())*100;
    }


}
