package finalstatic;

public class finalex1 {
	finalex1(){
		System.out.println("default constructor");
	}
static int a = 1;
void show() {
	System.out.println(a);
}
void wellcome() {
	System.out.println("wellcome method");
}
public class finalextest extends finalex1 {
	void show() {
		System.out.println("extends method" );
		}
	public static void main(String[] args) {
		finalex1 fex1 = new finalex1();
	//	finalex1.show();
		}
}}
