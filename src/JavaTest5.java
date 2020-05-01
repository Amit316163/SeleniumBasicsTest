
public class JavaTest5 {
	
	public boolean testMethod1() {
		Integer I1=100;
		Integer I2=100;
		return(I1==I2);
	}
	
	public boolean testMethod2() {
		Integer J1=100;
		Integer J2=100;
		return(J1==J2);
	}
	
	public static void main(String[] args) {
		
		JavaTest5 js=new JavaTest5();
		System.out.println(js.testMethod1() +"tets"+js.testMethod2());
		
		
	}

}
