package sample;

public class ConstructorPrac {
	
	public static void main(String[] args) {
		UserProfile profile=  new  UserProfile(1, "hjyhbhjb", "maths", 90);
		System.out.println(profile);
		
		UserProfile profile2=  new  UserProfile();
		profile2.setId(2);
		
		UserProfile profile3 = new UserProfile(3, "sdsd", "adasd", 90);
	}
	

}
