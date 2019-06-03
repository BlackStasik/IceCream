public class ChocolateIceCream extends IceCream {

    public ChocolateIceCream() {
        description = "Шоколадне морозиво";
        adds = "Горішки";
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
