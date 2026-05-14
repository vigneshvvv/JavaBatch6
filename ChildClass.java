package sample;

public class ChildClass extends abstractPractice{

	ChildClass(int amount) {
		super(amount);
	}

	@Override
	void printNewOperation() {
		
		System.out.println("The extended method");
	}
	
	@Override
	public void printOperation() {
		System.out.println("The method got overrided");
	}
	
	
	

}
