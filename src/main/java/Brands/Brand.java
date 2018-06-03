package Brands;

import java.util.Date;

public class Brand {

    private String name;
    private double purchaseCost;
    private double additionalCost;
    private boolean favourite;
    private double marketValue;
//    purchaseDate needs to be added


    public Brand(String name, double purchaseCost, double additionalCost, boolean favourite, double marketValue){
        this.name = name;
        this.purchaseCost = purchaseCost;
        this.additionalCost = additionalCost;
        this.favourite = false;
        this.marketValue = marketValue;
    }




}
