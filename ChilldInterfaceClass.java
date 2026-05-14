package sample;

public class ChilldInterfaceClass implements UserInterfaceOperation, UserInterfaceSecond {

	@Override
	public void samplePrintMethod() {
		System.out.println("The user Interface class one printed");
		
	}

	@Override
	public void printSecondInterface() {
		System.out.println("Second Interface class printed");
		
	}
	
	public static void main(String[] args) {
		ChilldInterfaceClass chilldInterfaceClass = new ChilldInterfaceClass();
		chilldInterfaceClass.samplePrintMethod();
		chilldInterfaceClass.printSecondInterface();
		chilldInterfaceClass.printDefaultOperation();
	}

}
