package finalstatic;

public class finalvarmethod {
	final static int a = 10;

	final void JBK() {
		int i = 0;
		for (i = 0; i < 5; i++) {
			System.out.println("value i =" + i);
		}
	}

	public static void main(String[] args) {
		finalvarmethod fvm = new finalvarmethod();
		fvm.JBK();
		System.out.println(a);
	}
}
