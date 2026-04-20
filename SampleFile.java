package sample;

public class SampleFile {

	public static void main(String[] args) {
		Integer id = 1;
		String name = "new";
		Boolean isTrue = true;
		System.out.println(id);
		id =2;
		System.out.println(id);
		System.out.println(name);
		System.out.println(isTrue);
		
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
//		array[5] = 60;
		
		System.out.println(array[4]);
		System.out.println(array.length);
		
		int[] array2 = new int[] {1,2,3,4,5};
		array2[1] = 5;
		System.out.println(array2[1]);
		
//		for(int i = 0; i <array2.length; i++) {
//			System.out.println("The value of i is " + i);
//			System.out.println(array2[i]);
//		}
			
//		for(int i = 0; i <array2.length; i++) {
//			if(array2[i] == 2) {
//				System.out.println("The number 2 exist");
//			}else {
//				System.out.println("The number doesn't exist");
//			}
//		}
		
		boolean result = false;
		for(int i = 0; i <array2.length; i++) {
			if(array2[i] == 2) {
				result = true;
			}
		}
		
		if(result) {
			System.out.println("The number 2 exist");
		}else {
			System.out.println("The number 2 doesn't exist");
		}
	}
}

