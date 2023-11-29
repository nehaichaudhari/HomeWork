package com.arraylist.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Car implements Comparable<Car>{
	int modelNo;
	String colour;
	float price;
	Engine engine;

	Car() {
	}

	Car(int modelNo, String colour, float price, Engine engine) {
		this.modelNo = modelNo;
		this.colour = colour;
		this.price = price;
		this.engine = engine;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", colour=" + colour + ", price=" + price + ", engine=" + engine + "]";
	}

	//on basic of engine type
//	@Override
//	public int compareTo(Car c) {
//		return this.getEngine().getEngineType().compareTo(c.getEngine().getEngineType());
//	}
	
	@Override
	//if engine type is same then sort it bascic on price
	public int compareTo(Car c) {
		if(this.getEngine().getEngineType().compareTo(c.getEngine().getEngineType())==0){
			if(this.getPrice()==c.getPrice())
				return 0;
			else if(this.getPrice()<c.getPrice())
				return -1;
			else
				return 1;
		}
		return this.getEngine().getEngineType().compareTo(c.getEngine().getEngineType()) ; 
		
	}
}

public class CarDetails {
	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car(101, "black", 500000, (new Engine(11, "auto"))));
		list.add(new Car(102, "white", 550000, (new Engine(12, "manual"))));
		list.add(new Car(103, "red", 1100000, (new Engine(13, "auto"))));
		list.add(new Car(104, "gray", 900000, (new Engine(14, "manual"))));
		list.add(new Car(105, "orange", 850000, (new Engine(15, "manual"))));
		list.add(new Car(106, "gray", 1300000, (new Engine(16, "auto"))));

		for (Car c : list) {
			System.out.println(c);
		}
		ArrayList<Car> auto = new ArrayList<>();
		ArrayList<Car> manual = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).engine.engineType.equals("auto")) {
				auto.add(list.get(i));
			} else
				manual.add(list.get(i));
		}
		System.out.println("-------------------");
		for (Car c1 : auto) {
			System.out.println(c1);
		}
		System.out.println("-------------------");
		for (Car c2 : manual) {
			System.out.println(c2);
		}

		// check for price
		System.out.println("-----------------------------");
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).price > 1000000) {
				float dis = (float) (list.get(i).price - (list.get(i).price*0.05));
				list.get(i).price = dis;
				System.out.println("after discount: " + list.get(i));
			}
		}
//		System.out.println("After discount: ");
//		for(Car c:list) {
//			System.out.println(c);
//		}

//		// remove all manual engine
//		System.out.println("--------------------------------");
//		Iterator<Car> itr = list.iterator();
//		while (itr.hasNext()) {
//			if (itr.next().engine.engineType.equals("manual"))
//				itr.remove();
//		}
//		for (Car c : list) {
//			System.out.println(c);
//		}
		
		//sorting
		System.out.println("===================");
		for(Car c: list) {
			System.out.println(c);
		}
		System.out.println("========================");
		//Collections.sort(list);
		Collections.sort(list, new ColourComparator());
		for(Car c: list) {
			System.out.println(c);
		}
	}

}
