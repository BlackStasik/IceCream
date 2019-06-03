public class App {

    public static void main(String[] args) {
        Factory1 factory = new Factory1();

        IceCream iceCream;
        iceCream = factory.createIce("c");

        System.out.println(iceCream.description + " - " + iceCream.cost());
        iceCream = factory.createIce("v");
        System.out.println(iceCream.description + " - " + iceCream.cost());
        iceCream = factory.createIce("s");
        System.out.println(iceCream.description + " - " + iceCream.cost());

    }

}
