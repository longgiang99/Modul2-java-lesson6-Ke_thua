package bai7_abstrac_interface.thuchanh1;

public class Chicken extends Animal  implements Edible{

    @Override
    public String makeSound() {
        return "tao la ga day";
    }

    @Override
    public String howToEat() {
        return "nuong ga len la an duoc";
    }
}
