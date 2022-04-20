public class CarShop {

    public static void main(String[] args) {
        Car toyotaCamry=new Car("Toyota","Japan",4,'F');
        Car hondaCivic=new Car("Honda","Japan",5,'E');
        Car modelX=new Car("Tesla","USA",4,'E');

//        toyotaCamry.infoPrinter("Toyota Camry");
        hondaCivic.infoPrinter("Honda Civic");
        modelX.infoPrinter("Tesla Model X");

        hondaCivic.priceCalculator(35000);
        modelX.priceCalculator(45000.0);
    }
}
