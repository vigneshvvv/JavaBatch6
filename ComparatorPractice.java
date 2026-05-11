package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorPractice {
	


	private int id;
	private String name;
	private int salary;
	private int age;
	
	public ComparatorPractice(int id, String name, int salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "ComparatorPractice [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
		Comparator<ComparatorPractice> ageComparator = new Comparator<ComparatorPractice>() {
			
			@Override
			public int compare(ComparatorPractice arg0, ComparatorPractice arg1) {
				// TODO Auto-generated method stub
				return arg0.age - arg1.age;
			}
		};
		
		Comparator<ComparatorPractice> salaryComparator = new Comparator<ComparatorPractice>() {
			
			@Override
			public int compare(ComparatorPractice arg0, ComparatorPractice arg1) {
				// TODO Auto-generated method stub
				return arg0.salary - arg1.salary;
			}
		};
		
		Comparator<ComparatorPractice> salaryComparatorMin = (a,b) -> a.salary - b.salary;
		
		List<ComparatorPractice> ce = new ArrayList<ComparatorPractice>();
		ce.add(new ComparatorPractice(1, "v", 10000, 29));
		ce.add(new ComparatorPractice(2, "c", 20000, 19));
		
		System.out.println(ce);
		Collections.sort(ce, ageComparator);
		
		System.out.println(ce);
		
//		Collections.sort(ce, salaryComparatorMin);
		Collections.sort(ce, (a,b) -> b.salary - a.salary);
		System.out.println("The comparator of salary"+  ce);
		
		List<ComparatorPractice> out = ce.stream().sorted((a,b) -> a.salary - b.salary).collect(Collectors.toList());
		
		System.out.println(out);
		
		
		
	}
	
	

}
