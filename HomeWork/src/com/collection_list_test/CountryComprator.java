package com.collection_list_test;

import java.time.LocalDate;
import java.util.Comparator;

public class CountryComprator implements Comparator<Shipment> {

	@Override
	public int compare(Shipment o1, Shipment o2) {
		if (o2.getAddr().city.equals(o1.getAddr().city)) {
//			return LocalDate.of(o1.getDate().yy, o1.getDate().mm, o1.getDate().dd)
//					.compareTo(LocalDate.of(o2.getDate().yy, o2.getDate().mm, o2.getDate().dd));
			if (o1.getDate().yy == o2.getDate().yy) {
				if (o1.getDate().mm == o2.getDate().mm) {
					return o1.getDate().dd - o2.getDate().dd;
				} else {
					return o1.getDate().mm - o2.getDate().mm;
				}
			} else {
				return o1.getDate().yy - o2.getDate().yy;
			}
		}
		return o2.getAddr().city.compareTo(o1.getAddr().city);
	}

}
