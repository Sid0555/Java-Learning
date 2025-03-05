package PractiseQuestion;

//polymorphism overloading overriding




class a1 implements op{
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}

	@Override
	public void printsl() {
		System.out.println("this is implemented interface");
		
	}
}

 interface op{
	 void printsl();
 }
 
public class demo {
	public static void main(String[] args) {
		
		a1 ob = new a1();
		System.out.println(ob.add(5, 5));
		System.out.println(ob.add(5, 5, 6));
		
	}

}
