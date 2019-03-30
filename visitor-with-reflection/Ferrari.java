public class Ferrari implements Car {

    private String color;

    public Ferrari(String color) {
        this.color = color;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
}