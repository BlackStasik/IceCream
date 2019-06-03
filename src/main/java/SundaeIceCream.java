public class SundaeIceCream extends IceCream {

    public SundaeIceCream() {
        description = "Морозиво пломбір";
        adds = "Джем";
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
