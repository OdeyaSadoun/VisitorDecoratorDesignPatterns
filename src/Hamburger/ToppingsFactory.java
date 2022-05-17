package Hamburger;

public class ToppingsFactory {
    //we have chosen to do the classic factory- factory class
    public static HamburgerDecorator addTopping(String code,Hamburger hamburger){
        //TODO: fix
        HamburgerDecorator topping = null;
        switch (code){
            case "ch":
                topping = new ChipsDecorator(hamburger);
                break;
            case "or":
                topping = new OnionRingsDecorator(hamburger);
                break;
            case "sa":
                topping = new SaladDecorator(hamburger);
                break;
            case "fe":
                topping = new FriedEggDecorator(hamburger);
                break;
            default:
                throw new RuntimeException("wrong Hamburger");
        }
        return topping;
    }
}
