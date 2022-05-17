package Hamburger;

public class ChipsDecorator extends HamburgerDecorator{
    public ChipsDecorator(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public String serve(){
        return super.serve() + Chips();
    }

    private String Chips() {
        return " with chips";
    }
}
