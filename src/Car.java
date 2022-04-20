public class Car {

    String companyName;
    String carName;
    String companyLocation;
    int carryingCapacity;
    char energyType;
    double taxRate = 0.08;

//   public Car(){
//
//   }
    public Car(String companyName, String companyLocation, int carryingCapacity, char energyType){
    this.companyName=companyName;
    this.companyLocation=companyLocation;
    this.carryingCapacity=carryingCapacity;
    this.energyType=energyType;
    }

    public void infoPrinter(String carName){
        this.carName=carName;
        System.out.println("\nCarrying capacity of "+carName+" is : "+carryingCapacity+" persons.");
        System.out.println("The producing country of "+carName+" is : "+companyLocation+".");
        System.out.println("The energy type of "+carName+" is : "+energyType+".\n");

    }

    public double priceCalculator(double carPrice){
        System.out.println("The price of "+carName+" is : "+(carPrice+(carPrice*taxRate)));
        return (carPrice+(carPrice*taxRate));
    }


}
