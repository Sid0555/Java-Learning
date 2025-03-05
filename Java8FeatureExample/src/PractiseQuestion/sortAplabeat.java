package PractiseQuestion;


//write a program to a sort a Array of String in ascending oreder alphabetially without using sort built-in method and Stream / Collections
//i/p String s=["Capgemini","Accenture","TCS","EPAM"]
//o/p =[Accenture,Capgemini,EPAM,TCS]
public class sortAplabeat {
	public static void main(String[] args) {
		//for sorting
		String[] s={"Capgemini","Accenture","TCS","EPAM"};
		for(int i =0; i<s.length-1;i++) {
			for(int j=0; j<s.length-i-1;j++) {
				if(s[j].compareTo(s[j+1])>0) {
					
					String temp = s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
					
					
				}
			}
		}
		//for printing
		 System.out.print("Sorted Array: [");
	        for (int i = 0; i < s.length; i++) {
	            System.out.print(s[i]);
	            if (i < s.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	}

}
