package sample;

public interface UserInterfaceOperation {
	
	 void samplePrintMethod();
	 
	 default void printDefaultOperation() {
		 System.out.println("Default method printed");
	 }

}
