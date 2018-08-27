import java.util.Scanner;

public class Question5{
	Scanner input = new Scanner(System.in);
	private int num;
	private final String[] list = new String[]{
		"less than","equal to","greater than"
	};

	public Question5(){
	}

	public Question5(int num){
		this.num = num;
	}

	public void setNum(){
		System.out.print("Enter a number between 35 and 74\n"
				+"[ENTER]: ");
		this.num = input.nextInt();
		while(this.num < 35 | this.num > 74)
			setNum();
	}

	public int getNum(){
		return this.num;
	}

	public int calculate(){
	 	int x = this.num / 10;
		int y = this.num - (x * 10);
		if(x < y)
			return 0;
		if(x == y)
			return 1;
		else
			return 2;
	}

	public void show(){
		System.out.print("======================================================\n"
				+  "The number is ["+ getNum() +"]\n"
				+  "The tens digit is "
				+   list[this.calculate()]
				+  " the ones digit\n"
				+  "======================================================\n"
		);
	}

	public static void main(String[] args){
		Question5 numobj = new Question5();
		numobj.setNum();
		numobj.show();
	}
}
