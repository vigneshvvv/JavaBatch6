package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		
		List<Integer> ids1 = new ArrayList<Integer>();
		ids1.add(4);
		ids1.add(5);
		ids1.add(6);
		
		ids.addAll(ids1);
		
		System.out.println(ids);
		
		System.out.println(ids.get(1));
		
//		for(int i = 0; i < ids.size(); i++) {
//			
//		}
		
		for(Integer id: ids) {
			System.out.println(id);
		}
		
		UserProfile profile = new UserProfile(1, "adsdasda", "adsada", 60);
		UserProfile profile1 = new UserProfile(2, "adsdasda", "adsada", 50);
		
		List<UserProfile> profiles = new ArrayList<>();
		profiles.add(profile1);
		profiles.add(profile);
		
		System.out.println(profiles);
		
		for(UserProfile profile2: profiles) {
			System.out.println(profile2);
		}
		
		System.out.println(ids.contains(1));
		
	}

}
