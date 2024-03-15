package finalstatic;

public class Variable {
static int count = 0;
public void increment() {
	count++;
}
public static void main(String[] args) {
	Variable v = new Variable();
	v.increment();
	Variable v1 = new Variable();
	v.increment();
	System.out.println("v is "+v.count);
	System.out.println("value is "+v1.count);
}
}
