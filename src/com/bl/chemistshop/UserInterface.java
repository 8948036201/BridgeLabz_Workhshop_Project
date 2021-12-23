//UI Layer or View Layer
package com.bl.chemistshop;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	public void printAllHomeopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.HOMEOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void printAllAllopathy(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.ALLOPATHY) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void printAllAyurvedic(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.AYURVEDIC) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void printAllYunani(List<Medicine> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).type == Medicine.Type.YUNANI) {
				System.out.println(list.get(i));
			}
		}
	}
	
	public void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	int showMainMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the medicine:");
		System.out.println("Enter 2 to remove the medicine:");
		System.out.println("Enter 3 to update the medicine:");
		System.out.println("Enter 4 to print all the medicine:");
		System.out.println("Enter 5 to print all the Homeopathic medicine:");
		System.out.println("Enter 6 to print all the Allopathic medicine:");
		System.out.println("Enter 7 to print all the Ayurvedic medicine:");
		System.out.println("Enter 8 to print all the Yunani medicine:");
		System.out.println("Enter 9 to exit:");
		int option = scanner.nextInt();
		return option;
	}
	
	public void update(Medicine medicine) {
		MedicineStore medicineStore = new MedicineStore();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Whiche Details You want to update");
		System.out.println("[1] CompanyName \n [2] Type \n [3] MfgDate \n [4]ExpDate \n [5] Name \n [6] Composition");
		System.out.println("Please Choose any one");
		int op = scanner1.nextInt();
		
		switch (op) {
		case 1:
			
			System.out.println("Enter the updating Companyname");
			Scanner scanner = new Scanner(System.in);
			medicine.companyName = scanner.nextLine();
			 medicineStore.getMedicine(medicine.companyName);
			break;
		case 2 :
			
			System.out.println("Enter the updating Type");
			//medicine.type = scanner1.next();
			break;
			
		case 3:
			System.out.println("Enter the updating Mfgdate dd/mm/yyyy");
			String date = scanner1.next();
			medicine.mfgDate = new Date(date);
			break;
			
		case 4:
			System.out.println("Enter the Updating Exp-date dd/mm/yyyy");
			String exdate = scanner1.next();
			medicine.expDate = new Date(exdate);
			break;
			
		case 5:
			System.out.println("Enter the medicine name");
			medicine.name = scanner1.next();
			break;
			
		case 6:
			System.out.println("Enter the composition");
			medicine.composition =  new String[3];
			break;
		default:
			System.out.println("Your medicine details is uptodate");
		}
	}
}
