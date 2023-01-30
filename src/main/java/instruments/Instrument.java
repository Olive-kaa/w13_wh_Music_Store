package instruments;
import behaviours.IPlay;
import behaviours.Saleable;

public abstract class Instrument implements IPlay, Saleable{
    private String type;
    private String material;
    private String colour;

    public Instrument(String type, String material, String colour){
        this.type = type;
        this.material = material;
        this.colour = colour;
    }


    public String getMaterial() {
        return material;
    }
    public String getColour(){
        return colour;
    }

    public double buyingPrice() {
        return 0;
    }

    public double sellingPrice(){
        return 0;
    }
}
