package javaTesting;

public class Child1 extends Parent1{
	
	public static void car() {
		System.out.println("Child ki car:Audi");
	}
	
	public static void main(String[] args) {
		
		//without static method
//		Parent1 p=new Parent1();
//		p.car();  //Parent ki Car:Jeep
//		
//		Child1 c=new Child1();
//		c.car();// Child ki car:Audi
//		
//		Parent1 p1=new Child1();
//		p1.car(); //Child ki car:Audi
		
		//With Static method
		Parent1 p=new Parent1();
		p.car();  //Parent ki Car:Jeep
		
		Child1 c=new Child1();
		c.car();// Child ki car:Audi
		
		Parent1 p1=new Child1();
		p1.car(); //Parent ki Car:Jeep
		
		//Static method can be override?
	}

}
