public class VanillaIceCream extends IceCream {

    public VanillaIceCream() {
        description = "Ванільне морозиво";
        adds = "Шоколад";
        form = "Стаканчик";
        cost = 6;
    }

    public String getDescription() {
        return description;
    }

    public String gerAdds() {
        return adds;
    }

    public String gerForm() {
        return form;
    }

    public double cost() {
        return cost;
    }
}
