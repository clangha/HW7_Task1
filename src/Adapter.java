public class Adapter implements HouseholdItem{
    private double PricePerMeter;
    public double Price;
    public String Instructions;

    public double MovingCosts(Glass g){
        switch(g.tickness){
            case 1:
                PricePerMeter = 2;
                break;
            case 2:
                PricePerMeter = 1.2;
                break;
            case 3:
                PricePerMeter = 0.7;
                break;
        }
        Price = PricePerMeter * g.lenght;
        return Price;
    }

    public double MovingCosts(Furniture f){
        Price = 5*(f.weight % 20);
        return Price;
    }

    public double MovingCosts(Electronic e){
        if (e.fragile) {
            Price = 5 * (e.weight % 10);
        } else if (!(e.fragile)) {
            Price = 5 * (e.weight % 15);
        }
        return Price;
    }

    public String PackingInstructions(Glass g){
        Instructions = "> should be wrapped with Bubble wraps and packed in a box with dimension: "+(g.lenght+1)+"x"+(g.width+1)+"x"+(g.height+1);
        return Instructions;
    }

    public String PackingInstructions(Furniture f){
        Instructions = "> should be covered with waterproof covers with area of: "+(f.lenght)+"x"+(f.width)+"x"+(f.height);
        return Instructions;
    }

    public String PackingInstructions(Electronic e){
        Instructions = "> should be covered with Polyethylene foam film and packed in a box with dimension: "+(e.lenght+1)+"x"+(e.width+1)+"x"+(e.height+1);
        return Instructions;
    }
}
