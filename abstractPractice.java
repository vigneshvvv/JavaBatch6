package sample;

abstract class abstractPractice {
	
	int amount;
	
	abstractPractice(int amount){
		this.amount = amount;	
		
	}
	
	public void printOperation() {
		System.out.println("The non abstract method printed" + amount);
	}
	
	abstract void printNewOperation();
	
	

}
