package finalstatic;

public class Staticblock {
	static int a =10;
	static int b = 20;
	static{
		System.out.println("working started");
	}
public static void main(String[] args) {
	System.out.println("main is working");
	System.out.println("value = "+a);
	System.out.println("value = "+b);
}
}
