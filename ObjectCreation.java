package sample;

public class ObjectCreation {
	
	public static void main(String[] args) {
		UserInfo user = new UserInfo();
		user.setId(1);
		user.setName("vignesh");
		user.setMobileNo(3123);
		user.setAddress("adsdasdasda");
		user.setPincode(600116);
		System.out.println(user);
		
		
		String[] arr = new String[] {"beauty", "mascara"};
		
		Dimensions dimensions = new Dimensions();
		dimensions.setWidth(10.00);
		dimensions.setHeight(2.0);
		dimensions.setDepth(2.0);
		
		
		UserInfo user2 = new UserInfo();
		user2.setId(2);
		user2.setName("kumar");
		user2.setName("sathish");
		user2.setMobileNo(222);
		user2.setPincode(600119);
		user2.setAddress("sdfdfsdf");
		user2.setTags(arr);
		user2.setDimensions(dimensions);
		
		System.out.println(user2);
		System.out.println(user2.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getDimensions().getWidth());
		System.out.println(user2.getTags());
		
			
		
	}

}
