//Controller Layer
package com.bl.chemistshop;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	Scanner scanner = new Scanner(System.in);
	MedicineStore medicineStore = new MedicineStore();
	UserInterface userInterface = new UserInterface();
	//Medicine medicine;
	
	public static void main(String[] args) {
		Application application = new Application();
		int option = 0;
		while (option != 9) {
			option = application.userInterface.showMainMenu();
			application.handleUserSelection(option);
		}

		/* 
		 * UserInterface userInterface = new UserInterface(); 
		 * List medicineList = medicineStore.getMedicineList();
		 * userInterface.print(medicineList);
		 * 
		 * medicineStore.remove(crocin);
		 * medicineStore.remove(gluconD);
		 * 
		 * System.out.println("Printing after removal: ");
		 * userInterface.print(medicineList);
		 * 
		 * System.out.println("Print All Homeopathy medicine here: ");
		 * userInterface.printAllHomeopathy(medicineList);
		 * 
		 * System.out.println("Print All Allopathy medicine here: ");
		 * userInterface.printAllAllopathy(medicineList);
		 * 
		 * System.out.println("Print All Ayurvedic medicine here: ");
		 * userInterface.printAllAyurvedic(medicineList);
		 * 
		 * System.out.println("Print All Yunani medicine here: ");
		 * userInterface.printAllYunani(medicineList);
		 */
	}

	private void handleUserSelection(int option) {

		switch (option) {
		case 1:
			addMedicine();
			break;
		case 2:
			removeMedicine();
			break;
		case 3:
			System.out.println("enter the medicine name want to update");
			String medicineName = scanner.nextLine();
			Medicine medicine = medicineStore.getMedicine(medicineName);
			userInterface.updateMedicine(medicine);
			break;
		case 4:
			//List medicineList = medicineStore.getMedicineList();
			userInterface.print( medicineStore.getMedicineList());
			break;
		case 5:
			List allopathyMedicineList = medicineStore.getMedicineList();
			userInterface.printAllAllopathy(allopathyMedicineList);
			break;
		case 6:
			List homeopathyMedicineList = medicineStore.getMedicineList();
			userInterface.printAllHomeopathy(homeopathyMedicineList);
			break;
		case 7:
			List aiurvedicMedicineList = medicineStore.getMedicineList();
			userInterface.printAllAyurvedic(aiurvedicMedicineList);
		case 8:
			List yunamiMedicineList = medicineStore.getMedicineList();
			userInterface.printAllYunani(yunamiMedicineList);
			break;
		default:
			break;
				
		}
	}

	void addMedicine() {

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
	}
	
	public void removeMedicine() {
		
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the medicine name want to remove");
		String medicineName = scanner.nextLine();
		Medicine medicine = medicineStore.getMedicine(medicineName);
		medicineStore.remove(medicine);
	}
	
	/*void updateMedicine() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the medicine name");
		String medicineName = scanner.nextLine();
		Medicine medicine = medicineStore.getMedicine(medicineName);
		System.out.println("\n");
		
		System.out.println("Before Updating the details  "+medicine);
		System.out.println("\n");
		
		userInterface.update(medicine);
		
		System.out.print("\n");
		System.out.println("After Updating the details  "+medicine);
		
		System.out.print("\n");
		System.out.println("Succesfully Updated");
	}*/
}
