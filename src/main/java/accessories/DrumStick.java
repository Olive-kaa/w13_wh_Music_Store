package accessories;

import behaviours.Saleable;

public class DrumStick implements Saleable{

    private String description;
    private double priceBought;
    private double priceToSell;

    public DrumStick(String description, double priceBought, double priceToSell){
        this.description = description;
        this.priceBought = priceBought;
        this. priceToSell = priceToSell;
    }

    public double isSold() {
        return 3.50;
    }

}
