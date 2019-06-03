public class Order {

    String type;
    String adds;
    String form;
    String price;

    public Order(String type, String adds, String form, String price) {
        this.type = type;
        this.adds = adds;
        this.form = form;
        this.price = price;
    }

    public Order(){
        this.type = "";
        this.adds = "";
        this.form = "";
        this.price = "";
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getType() {
        return type;
    }

    public String getAdds() {
        return adds;
    }

    public String getForm() {
        return form;
    }

    public String getPrice() {
        return price;
    }
}
