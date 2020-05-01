import java.util.ArrayList;

public class JavaTest7 {
	
	
	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		
		al.add("Amit");
		al.add("singh");
		al.add("test");
		al.add(10);
		
		ArrayList<Object> al1= new ArrayList<Object>();
		
		al1.add("Amit");
		al1.add("singh");
		al1.add("test");
		al1.add(10);
		System.out.println(al);
		System.out.println(al1);
		
	}

}
