package Hamburger;

public class SaladDecorator extends HamburgerDecorator{
    SaladDecorator(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public String serve(){
        return super.serve() + Salad();
    }

    private String Salad() {
        return " with salad";
    }
}
