package Hamburger;

public class FriedEggDecorator extends HamburgerDecorator{
    FriedEggDecorator(Hamburger hamburger) {
        super(hamburger);
    }
    @Override
    public String serve(){
        return super.serve() + FriedEgg();
    }

    private String FriedEgg() {
        return " with fried egg";
    }
}
