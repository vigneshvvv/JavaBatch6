package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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
		ce.add(new ComparatorPractice(3, "kumar", 20000, 19));
		
		System.out.println(ce);
		Collections.sort(ce, ageComparator);
		
		System.out.println(ce);
		
//		Collections.sort(ce, salaryComparatorMin);
		Collections.sort(ce, (a,b) -> b.salary - a.salary);
		System.out.println("The comparator of salary"+  ce);
		
		List<ComparatorPractice> out = ce.stream().sorted((a,b) -> a.salary - b.salary).collect(Collectors.toList());
		System.out.println(out);
		
		List<ComparatorPractice> outLimit = ce.stream()
				.sorted((a,b) -> a.salary - b.salary)
				.limit(1).collect(Collectors.toList());
		
		System.out.println(outLimit);
		
		Map<String, Integer> mapOutput = ce.stream()
				.collect(Collectors.toMap(ComparatorPractice :: getName , ComparatorPractice::getSalary));
		
		System.out.println(mapOutput);
		
		Map<Integer, Long> countOutput = ce.stream()
				.collect(Collectors.groupingBy(ComparatorPractice:: getAge, Collectors.counting()));
		
		System.out.println("Counting output"+ countOutput);
		
		
		List<PersonDetails> details = new ArrayList<PersonDetails>();
		details.add(new PersonDetails(1, "v", 10000, 29));
		details.add(new PersonDetails(2, "c", 20000, 19));
		details.add(new PersonDetails(3, "kumar", 20000, 19));
		
		List<DepartmentDetails> departmentDetails = new ArrayList<>();
		departmentDetails.add(new DepartmentDetails(1, "HR", details));
		departmentDetails.add(new DepartmentDetails(2, "Dev", details));
		
	List<String> namesData =departmentDetails.stream()
		.filter((ne) -> ne.getDepartment_name() == "Dev" )
		.flatMap(dep -> dep.getDetails().stream())
		.filter(emp -> emp.getSalary() > 10000)
		.map(PersonDetails :: getName)
		.collect(Collectors.toList());
		
		System.out.println(namesData);
		
		List<String> manualFor = new ArrayList<>();
		
		for(DepartmentDetails departmentDetails2 : departmentDetails) {
			if(departmentDetails2.getDepartment_name() == "Dev") {
			for(PersonDetails detailsn : departmentDetails2.getDetails()) {
				if(detailsn.getSalary() > 10000) {
					manualFor.add(detailsn.getName());
				}
				}
			}
			
		}
		
		System.out.println("manul for loop output"+ manualFor) ;		
	}
	
	

}
