public class Factory1 extends AbstractFactory{

    public IceCream createIce(String iceC) {
        if (iceC.equals("Шоколадне")){
            return new ChocolateIceCream();
        }
        else{
            if (iceC.equals("Пломбір")){
                return new SundaeIceCream();
            }
            else {
                return new VanillaIceCream();
            }
        }
    }

}
