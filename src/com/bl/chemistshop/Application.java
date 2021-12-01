//Controller Layer
package com.bl.chemistshop;

import java.util.Date;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("30/11/2021");
		crocin.expDate = new Date("30/11/2025");
		
		GluconD gluconD = new GluconD();
		gluconD.mfgDate = new Date("30/11/2021");
		gluconD.expDate = new Date("23/11/2024");
		
		PantopD pantopD = new PantopD();
		pantopD.mfgDate = new Date("30/11/2021");
		pantopD.expDate = new Date("28/11/2023");
		
		Aciloc aciloc = new Aciloc();
		aciloc.mfgDate = new Date("30/11/2021");
		aciloc.expDate = new Date("30/11/2025");
		
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("30/11/2021");
		disprin.expDate = new Date("30/11/2025");
		
		NatrumMur natrumMur = new NatrumMur();
		natrumMur.mfgDate = new Date("30/11/2021");
		natrumMur.expDate = new Date("30/11/2026");
		
		Triphala triphala = new Triphala();
		triphala.mfgDate = new Date("30/11/2021");
		triphala.expDate = new Date("30/11/2028");
		
		Zafran zafran = new Zafran();
		zafran.mfgDate = new Date("30/11/2021");
		zafran.expDate = new Date("30/11/2024");
		
		MedicineStore medicineStore = new MedicineStore();
		
		medicineStore.add(crocin);
		medicineStore.add(gluconD);
		medicineStore.add(pantopD);
		medicineStore.add(aciloc);
		medicineStore.add(disprin);
		medicineStore.add(natrumMur);
		medicineStore.add(triphala);
		medicineStore.add(zafran);
		
		UserInterface userInterface = new UserInterface();
		List medicineList = medicineStore.getMedicineList();
		userInterface.print(medicineList);
		
		medicineStore.remove(crocin);
		medicineStore.remove(gluconD);
		
		System.out.println("Printing after removal: ");
		userInterface.print(medicineList);
		
		System.out.println("Print All Homeopathy medicine here: ");
		userInterface.printAllHomeopathy(medicineList);
		
		System.out.println("Print All Allopathy medicine here: ");
		userInterface.printAllAllopathy(medicineList);
		
		System.out.println("Print All Ayurvedic medicine here: ");
		userInterface.printAllAyurvedic(medicineList);
		
		System.out.println("Print All Yunani medicine here: ");
		userInterface.printAllYunani(medicineList);
	}

}
