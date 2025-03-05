package LamdaFunction;

public class SimpleFUnction {
	
	public static void main(String [] args) {
		// here we have called the method by class name because in class Addification 
		//we have declared method static and for static method we can call method directly without creating its object 
		int ans =Addification.add(3,4);
		// here we have created object of class Addification we can use this when our method is not static
		Addification ad = new Addification();
		int ans2= ad.add(6, 7);
		System.out.println("The ans by object calling is "+ans2);
		System.out.println("The ans by static calling is "+ans);
		
	}


}
class Addification{
	
	public  static int add(int a, int b) {
		return a+b;
	}

}