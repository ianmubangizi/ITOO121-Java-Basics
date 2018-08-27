public class Car{
  private String carName;
  private int mileage;
  private int yearManfactured;

  public Car(String name){
    this.carName = name;
    this.mileage = 45000;
    this.yearManfactured = 2002;
  }

  public String carInfo(){
   return "Car Name: ["+ this.carName +"]\n"
        + "Mileage: ["+ this.mileage +"]\n"
        + "Manfactured: ["+ this.yearManfactured +"]";
  }

  public static void main(String[] args){
    Car ford = new Car("Ford GT");
    System.out.print(ford.carInfo());
  }
}
