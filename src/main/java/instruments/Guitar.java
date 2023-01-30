package instruments;

public class Guitar extends Instrument{
    private final int numberOfStrings;

    public Guitar(String type, String material, String colour, int numberOfStrings){
        super(type, material, colour);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "guitar sounds";
    }

    @Override
    public double isSold() {
        return 0;
    }
}
