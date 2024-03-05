package finalstatic;

public class finalclassdemo {
	void show() {
		System.out.println("final class not inheritate");
	}
	public class finalclasstest extends finalclassdemo{
	
public static void main(String[] args) {
	finalclassdemo fcd = new finalclassdemo();
	fcd.show();
	}
}
}
