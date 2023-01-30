package instruments;

public class Piano extends Instrument{

    private final String style; // grand or upright

    public Piano(String type, String material, String colour, String style){
        super(type, material, colour);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public String play(){
        return "piano sounds";
    }

}
