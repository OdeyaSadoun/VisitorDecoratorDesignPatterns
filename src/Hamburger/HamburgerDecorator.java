package Hamburger;

public class HamburgerDecorator implements Hamburger{
    Hamburger itsHamburger;
    HamburgerDecorator(Hamburger hamburger){
        this.itsHamburger = hamburger;
    }
    @Override
    public String serve() {
        return itsHamburger.serve();
    }
}
