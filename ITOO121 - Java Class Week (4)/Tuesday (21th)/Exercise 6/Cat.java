import java.util.Scanner;

public class Cat extends Animal{
 
  /*
  * constactor for Cat class that
  * takes a name of type String
  * @param args String name
  * */
  public Cat(String name){
    super(name);
  }

  // I will make this dry after Submiting to Nadi
  @Override
  /* 
  * Implementing the makeSound() method from 
  * Animal
  * @param args String sound
  * */
  public void makeSound(String sound){
    System.out.println("A "+ this.getName() 
                        +" makes a ["
                        + sound +"] Sound");
  }
  // make dry


  /*
  * Main entry point of the Cat Prog
  * @param args String[] args
  * */
  public static void main(String[] args){
    DisplayInput display = new DisplayInput();
    Scanner input = new Scanner(System.in);
    Animal dog = new Animal("Dog");
    Cat cat = new Cat("Cat");
   
    display.addString("dog");
    dog.makeSound(input.next());
    display.addString("cat");
    cat.makeSound(input.next()); 
  }
}

/*
* DisplayInput is a Class with a helper
* method addString() 
* */
class DisplayInput{ 
  // Think of way to use the current
  // object's animalName 

  /*
  * addString() is a helper method of type
  * void that takes in a String and prints
  * a message to the screen
  * @param args String h
  * */
  public void addString(String h){
    System.out.print("What sound does a "+ h 
                      +" make?: ");
  }
}

/*
* The Animal class with a method of type
* void makeSound(args) that 
* takes in a String as args
**/
class Animal{
  private String name;

  /*
  * constactor for Animal class that
  * takes a name of type String
  * @param args String animalName
  * */
  public Animal(String animalName){
    this.name = animalName;
  }

  public String getName(){
    return this.name;
  }
  /*
  * makeSound() is a is a helper method of type
  * void that takes in a String and prints
  * a message to the screen
  * @param args String
  * */
   public void makeSound(String string){
    System.out.println("A "+ this.name +" makes a ["
                        + string +"] Sound");
   };
}
