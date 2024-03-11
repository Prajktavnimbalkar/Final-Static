package finalstatic;

public class Staticmethodcopyargs {
	public static void copyvariables (String str1,String str2 ) {
		str2 = str1;
		System.out.println("1 string = " +str1);
		System.out.println("2 string = " + str2);
	}
public static void main(String[] args) {
	Staticmethodcopyargs.copyvariables("POI","SDF");
	copyvariables("ugg", "jgt");
	
}
}
