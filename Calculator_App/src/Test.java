
public class Test {
	
	public static void main(String[] args) {
		
	OperationImpl o=new OperationImpl();
	double ans=o.add(10.12, 15);
	double ans2=o.subtract(50.6, 19);
	double ans3=o.multiply(10, 15);
	double ans4=o.divide(10, 2);
	
	System.out.println(ans);
	System.out.println(ans2);
	System.out.println(ans3);
	System.out.println(ans4);
	
	
	}

}
