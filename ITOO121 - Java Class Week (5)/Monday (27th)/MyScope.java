
public class MyScope{
  static int counter;
  static int count;

  public int method1(int v){
    count = 3 + v;
    counter = 3 + v;
    //System.out.println("Count" + count);
    return counter; 
  }

  public int method2(int v){
    count = count * v;
    counter = counter * v;
    //System.out.println("Count" + count);
    return counter; 
  }

  public double method3(int v){
    count = count / v;
    counter = counter / v;
    //System.out.println("Count" + count);
    return counter; 
  }

  public static void main(String[] args){
   MyScope nums = new MyScope();
   MyScope nums2 = new MyScope();
   System.out.println("Method 1 counter: " + nums.method1(2));
   System.out.println("Method 2 counter: " + nums.method2(4));
   System.out.println("Method 3 counter: " + nums.method3(6));
   System.out.println("Obj2|Method 1 counter: " + nums2.method1(2));
   System.out.println("Obj2|Method 2 counter: " + nums2.method2(4));
   System.out.println("Obj2|Method 3 counter: " + nums2.method3(6));
  }
}
