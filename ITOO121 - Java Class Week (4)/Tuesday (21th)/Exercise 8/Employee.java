import java.util.Scanner;

//Document this program later when done!!

/*
* 
* */
public class Employee{
  Scanner input = new Scanner(System.in);
  private String name;

  /*
  * 
  * */
  public void setName(){
    System.out.print("Enter Worker's Name:");
    this.name = input.next();
  }

  /*
  * 
  * */
  public String getName(){
    return this.name;  
  }

  /*
  * 
  * */
  public static void main(String[] args){
    CTIWorker employee = new CTIWorker();
    employee.setName();
    employee.setShift();
    employee.setHours();
    employee.setPayRate();
    employee.display();
  }
}

  /*
  * 
  * */
class CTIWorker extends Employee{
  Scanner input = new Scanner(System.in);
  private int shift;
  private double hourlyPayRate;
  private int hours;

  /*
  * 
  * */
  public CTIWorker(){
  }

  /*
  * 
  * */
  public CTIWorker(int shift, double payRate){
    this.shift = shift;
    this.hourlyPayRate = payRate;
  }

  /*
  * 
  * */
  public void setShift(){
    System.out.print("Enter "+ super.getName() 
                    +"'s Shift:");
    this.shift = input.nextInt();
  }

  /*
  *
  * */
  public int getShift(){
      return this.shift;
  }

  /*
  *
  * */
  public String workShift(){
    if(getShift() == 1)    
      return "Day Shift";
    if(getShift() == 2)
      return "Night Shift";
    else
      return "\nThey could have be an input error "
              +"or you just don't work here\n";
  }

  /*
  *
  * */
  public void setPayRate(){
    System.out.print("Enter Rate Per Hour for "
                    + workShift() +":");
    this.hourlyPayRate = input.nextDouble();
  }

  /*
  *
  * */
  public double getPayRate(){
    return this.hourlyPayRate;
  }
  
  public void setHours(){
    System.out.print("How many Hours did "
                    + super.getName() +" work in the "
                    + workShift() +"?:");
    this.hours = input.nextInt();
  }

  /*
  *
  * */
  public int getHours(){
    return this.hours;
  }

  /*
  * 
  * */
  public void display(){
    System.out.println( super.getName() + " Earned: [R"
                        + getHours() * getPayRate() +"] for the "
                        + workShift());
  }
}
