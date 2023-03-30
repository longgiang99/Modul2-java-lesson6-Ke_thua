package bai7_abstrac_interface.thuchanh1;

public class test {
    public static void main(String[] args) {
        var ho = new Tiger();
        System.out.println(ho.makeSound());
        var ga = new Chicken();
        System.out.println(ga.makeSound());
        System.out.println(ga.howToEat());
        var apple = new Apple();
        System.out.println(apple.howToEat());
    }
}