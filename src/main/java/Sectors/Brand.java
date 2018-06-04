package Sectors;


import Interfaces.ITrade;

public abstract class Brand implements ITrade {

    private String name;
    protected int purchaseCost;
    protected int additionalCost;
    private String acquisitionDate;
    private boolean favourite;
    protected int marketValue;
    


    public Brand(String name, int purchaseCost, int additionalCost, String acquisitionDate, boolean favourite, int marketValue){
        this.name = name;
        this.purchaseCost = purchaseCost;
        this.additionalCost = additionalCost;
        this.acquisitionDate = acquisitionDate;
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


    public void setFavouriteStatus(boolean favourite) {
        this.favourite = favourite;
    }

    public String getAcquisitionDate() {
        return this.acquisitionDate;
    }

    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }



}
