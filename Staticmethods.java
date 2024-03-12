package finalstatic;

public class Staticmethods {
	private String name;
	private static String staticstr = "static string";
	
	public void Staticmethod (String n) {
		this.name = n;
	}
	public static void  teststaticmethod () {
		System.out.println("i m static method");
		System.out.println(Staticmethods.staticstr);
		System.out.println("name ");
	}
	public static void main(String[] args) {
	//	Staticmethods msm = new Staticmethods("jbk test 1");
	//	Staticmethods.teststaticmethod();
		Staticmethods msm = new Staticmethods();
		msm.teststaticmethod();
		}
}
