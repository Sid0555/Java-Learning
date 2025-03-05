package JavaVariables;



 class siddant{
	public void baap(){
		System.out.println("tera baap hu mein");
	}
	public void indi() {
		System.out.println("parent ki kamai");
	}
}

 
 
 class abhihek extends siddant{
	public void baap() {
		System.out.println("apka beta hu mein");
	}
	
}




public class over_load {
	
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		abhihek a1 = new abhihek();
		a1.baap();
		siddant s1= new siddant();
		s1.baap();
		siddant s2=new abhihek();
		s2.baap();
		s2.indi();
		//abhihek a2 =new siddant();
		
	}
	
	
	
}
