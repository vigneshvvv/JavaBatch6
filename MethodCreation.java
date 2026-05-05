package sample;

public class MethodCreation {
	
	public static Integer addElements(int a, int b) {
		return a*b;
	}
	
	public static void addElementsNew(int a, int b) {
		System.out.println(a +b);
	}
	
	public static boolean checOddEven(int a) {
		if(a %2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
	  Integer result = addElements(10, 20);
	  System.out.println(result);
	  System.out.println(addElements(20, 30));
	  addElementsNew(10, 20);
	  
	  boolean output = checOddEven(10);
	  if(output) {
		  System.out.println("The number is even");
	  }else {
		  System.out.println("The number is odd");
	  }
		
	}

}
