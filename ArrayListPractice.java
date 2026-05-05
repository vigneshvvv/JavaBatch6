package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
		
		Set<Integer> removeDup = new HashSet<Integer>();
		removeDup.add(1);
		removeDup.add(2);
		removeDup.add(1);
		removeDup.add(3);
		removeDup.add(4);
		removeDup.add(5);
		
		System.out.println(removeDup);
		removeDup.remove(1);
		System.out.println(removeDup);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(4);
		set2.add(5);
		
		removeDup.removeAll(set2);
		System.out.println(removeDup);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(3);
		pq.add(6);
		pq.add(1);
		
		System.out.println("pq"+ pq);
		
		 System.out.println(pq.peek());
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());

		 System.out.println("pq"+ pq);
		 
		 PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
		 
		 pq1.add(1);
		 pq1.add(3);
		 pq1.add(7);
		 pq1.add(10);
		 
		 System.out.println(pq1);
		 
		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		 map.put(1, 10);
		 map.put(2, 20);
		 map.put(3, 30);
		 
		 System.out.println(map.get(3));
		 
		 UserProfile profile2 = new UserProfile(1, "kumar", "adsada", 60);
		UserProfile profile3 = new UserProfile(2, "sathish", "adsada", 50);
		 
		 Map<String, UserProfile> profileMap = new HashMap<>();
		 profileMap.put(profile2.getName(), profile2);
		 profileMap.put(profile3.getName(), profile3);
		 
		 System.out.println("getting details from hashmap" + profileMap.get("sathish"));
		 
		 
		 Map<Integer, List<UserProfile>> mapList = new HashMap<>();
		 mapList.put(1, profiles);
		 
		 System.out.println(mapList);
		 
		 //last in first out
		 Stack<Integer> st = new Stack<>();
		 st.add(100);
		 st.add(200);
		 st.add(300);
		 
		 System.out.println(st.peek());
		 
		 System.out.println(st.pop());
		 
		 //first in first out
		 Queue<Integer> queue = new PriorityQueue<Integer>();
		 queue.add(100);
		 queue.add(200);
		 queue.add(300);
		
		 System.out.println(queue.peek());
		 System.out.println("before removing"+ queue);
		 System.out.println(queue.poll());
		 System.out.println("after removing"+  queue);
		 
		
	}

}
