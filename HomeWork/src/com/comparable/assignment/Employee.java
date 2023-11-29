package com.comparable.assignment;
//WAP to create a class Employee with (name, designation and age).
//Now create and add Employee objects elements to Arraylist. Print ArrayList.
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String designation;
	private int age;
	private Profile profile;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String designation, int age, Profile profile) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.profile=profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" +id+", name=" + name + ", designation=" + designation + ", age=" + age +",Profile Details: "+profile+"]";
	}

//4.based on id in which use < , > & == technique.
//	@Override
//	in ascending order
//	public int compareTo(Employee e) {
//		if (this.getId() == e.getId())
//			return 0;
//		else if (this.getId() < e.getId())
//			return -1;
//		else
//			return 1;
//	}
	
	/*@Override
	//6. in descending order
	public int compareTo(Employee e) {
		if (this.getId() == e.getId())
			return 0;
		else if (this.getId() > e.getId())
			return -1;
		else
			return 1;
	}*/
	
	//5. sorting on id but based on inbuilt compareTo method
	/*@Override
	public int compareTo(Employee e) {
		Integer id1=this.getId();
		Integer id2 = e.getId();
		return id1.compareTo(id2);
	}*/
	
	/*@Override
	//7. using inbuilt
	public int compareTo(Employee e) {
		Integer id1=this.getId();
		Integer id2 = e.getId();
		return id2.compareTo(id1);
	}*/
	
	/*@Override
	public int compareTo(Employee e) {
		int result = this.getName().compareTo(e.getName());
		if(result==0)
		return ((Integer)this.getId()).compareTo(e.getId());
		else
			return result;
	}*/
	/*@Override
	 * sort on basis of name and if name is same then sort on id
	public int compareTo(Employee e) {
		if (this.getName().compareTo(e.getName())==0) {
			if(this.getId()==e.getId())
				return 0;
			else if(this.getId()<e.getId())
				return -1;
			else
				return 1;
		}	
		else
			return this.getName().compareTo(e.getName());
	}*/
	
	@Override
	//sort on basis of country
	public int compareTo(Employee e) {
		return this.profile.getCountry().compareTo(e.getProfile().getCountry());
	}

}
