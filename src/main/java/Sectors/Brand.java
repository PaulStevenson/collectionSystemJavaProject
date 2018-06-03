package Sectors;


public abstract class Brand  {

    private String name;
    protected int purchaseCost;
    protected int additionalCost;
    private boolean favourite;
    private int marketValue;
//    purchaseDate needs to be added


    public Brand(String name, int purchaseCost, int additionalCost, boolean favourite, int marketValue){
        this.name = name;
        this.purchaseCost = purchaseCost;
        this.additionalCost = additionalCost;
        this.favourite = favourite;
        this.marketValue = marketValue;
    }


    public String getName() {
        return this.name;
    }

    public int getPurchaseCost() {
        return purchaseCost;
    }

    public int getAdditionalCost() {
        return additionalCost;
    }


    public boolean isMarkedFavourite() {
        return this.favourite;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int newMarketValue) {
        this.marketValue = newMarketValue;
    }
}
