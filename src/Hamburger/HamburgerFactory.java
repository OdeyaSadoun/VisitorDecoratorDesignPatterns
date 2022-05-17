package Hamburger;

public class HamburgerFactory {
    //we have chosen to do the classic factory- factory class
    public static Hamburger createHamburger(String code){
        //TODO: fix
        Hamburger hamburger = null;
        switch (code){
            case "cl":
                hamburger = new ClassicHamburger();
                break;
            case "sp":
                hamburger = new SpicyHamburger();
                break;
            case "la":
                hamburger = new LambHamburger();
                break;
            case "hla":
                hamburger = new HomemadeHamburger();
                break;
            default:
                throw new RuntimeException("wrong Hamburger");
        }
        return hamburger;
    }
}

