package Hamburger;

public class OnionRingsDecorator extends HamburgerDecorator{
    OnionRingsDecorator(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public String serve(){
        return super.serve() + OnionRings();
    }

    private String OnionRings() {
        return " with onion rings";
    }
}
