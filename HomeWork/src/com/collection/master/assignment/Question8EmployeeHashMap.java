package com.collection.master.assignment;

import java.util.HashMap;

public class Question8EmployeeHashMap {
	  public static void main (String args[])
	  {
		 HashMap <Employee1,String> hm=new HashMap<>();
		 
		 hm.put(new Employee1(101,"Radha",45000f),"Hr");
		 hm.put(new Employee1(102,"Neha",48000f),"Manager");
		 hm.put(new Employee1(103,"Reva",35000f),"TL");
		 hm.put(new Employee1(101,"Radha",45000f),"Hr");
			  
		 System.out.println(hm);
		  
		  
	  }
}
