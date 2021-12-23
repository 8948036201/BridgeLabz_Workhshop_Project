//Data Layer
package com.bl.chemistshop;

import java.util.List;
import java.util.ArrayList;

public class MedicineStore {
	
	private List<Medicine> medicineList = new ArrayList();
	
	public List getMedicineList() {
		return medicineList;
	}
	
	public void add(Medicine medicine) {
		medicineList.add(medicine);
	}
	
	public void remove(Medicine medicine) {
		medicineList.remove(medicine);
	}

	public Medicine getMedicine(String medicineName) {
		
		for (int i = 0; i < medicineList.size(); i++) {
			if (medicineList.get(i).name.equalsIgnoreCase(medicineName)) {
				return medicineList.get(i);
			}
		}
		return null;
	}
}

