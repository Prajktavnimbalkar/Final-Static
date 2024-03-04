package finalstatic;

public class demobankveriable {
final int maxvalue;

public demobankveriable() {
	maxvalue = 10;
}
void mymethod() {
	System.out.println("maxvalue = " +maxvalue);
}
public static void main(String[] args) {
	demobankveriable dbv = new demobankveriable();
	dbv.mymethod();
}
}
