
public class JavaTest2 {
	
	public void testMethod(int i) {
		System.out.println("int");
	}
	
	public void testMethod(float f) {
		System.out.println("float");
	}
	public static void main(String[] args) {
		
		JavaTest2 js = new JavaTest2();
		js.testMethod(10.10f);
		js.testMethod(10);
		js.testMethod(10l);
		//js.testMethod(10.10);
		js.testMethod('c');
		
		/*JavaTest2 js=new JavaTest2(10.5f); 
		JavaTest2 js1=new JavaTest2(10l);
		JavaTest2 js2=new JavaTest2('a');*/
		
		
		
	}

}
