
public class JavaTest {
	
	static int count=0;
	
	JavaTest(){
		System.out.println(count++);
	}
	JavaTest(int i){
		System.out.println(++count);
	}
	JavaTest(long l){
		System.out.println(--count);
	}
	JavaTest(float f){
		System.out.println(count--);
	}
	JavaTest(double d){
		System.out.println(--count);
	}
	
	
	public static void main(String[] args) {
		
		JavaTest js=new JavaTest();
		JavaTest js1=new JavaTest(10);
		JavaTest js2=new JavaTest(10l);
		JavaTest js3=new JavaTest(10f);
		JavaTest js4=new JavaTest(10d);
		System.out.println(count);
		
		
	}

}
