package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperation {
	
	public static List<UserInformation> generateUser(){
		List<UserInformation> info = new ArrayList<UserInformation>();
		
		UserInformation information1 = new UserInformation(1, "abdul", "asdasd", 20, null, "male", "123@gmail.com", "12132323", null, null, null);
		UserInformation information = new UserInformation(2, "vignesh", "asdasd", 22, null, "male", "123@gmail.com", "12132323", null, null, null);
		UserInformation information2 = new UserInformation(3, "Deva", "asdasd", 28, null, "male", "123@gmail.com", "12132323", null, null, null);
		UserInformation information3 = new UserInformation(4, "Subha", "asdasd", 30, null, "male", "123@gmail.com", "12132323", null, null, null);
		
		info.add(information3);
		info.add(information1);
		info.add(information);
		info.add(information2);
		return info;
	}
	
	public static void main(String[] args) {
		List<UserInformation> info = generateUser();
		System.out.println(info);
		
		List<UserInformation> result = new ArrayList<>();
		
		for(UserInformation information: info) {
			if(information.getAge() > 25) {
				result.add(information);
			}
		}
		
		System.out.println(result);
		
		List<UserInformation> streamResult = info.stream()
												.filter((e) -> e.getAge() > 25)
												.collect(Collectors.toList());
		
		System.out.println("The stream result is" + streamResult);
		
		
		//to get person name who has age > 25
        List<String> names = new ArrayList<>();
		
		for(UserInformation information: info) {
			if(information.getAge() > 25) {
				names.add(information.getFirstName());
			}
		}
		System.out.println("name using for loop" + names);
		
		
		List<String> StreamNames = info.stream()
										.filter((e) -> e.getAge() > 25)
										.map((e1) -> e1.getFirstName())
										.collect(Collectors.toList());
		System.out.println("name using stream" + StreamNames);
		
	}

}
