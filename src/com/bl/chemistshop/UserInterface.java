//UI Layer or View Layer
package com.bl.chemistshop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bl.chemistshop.Medicine.Type;

public class UserInterface {
	
	Scanner scanner = new Scanner(System.in);
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
	
	public void updateMedicine(Medicine medicine) {
		Scanner scannerstr = new Scanner(System.in);
		System.out.println("[1] changename \n[2] change company name \n[3] change mfg date \n"+ 
				"[4] change Expiry date \n[5] change compositons \n[6] change type ");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("enter tne name of medicine");
			medicine.name = scanner.nextLine();
			break;
		case 2:
			System.out.println("enter the company name");
			medicine.companyName = scanner.nextLine();
			break;
		case 3:
			System.out.println("enter the mfg date in mm/dd/yyyy formate");
			String tempMfgDate = scanner.next();
			medicine.mfgDate =  new Date(tempMfgDate);	
			break;
		case 4:
			System.out.println("enter the expiry date in mm/dd/yyyy formate");
			String tempExpDate = scanner.next();
			medicine.expDate = new Date(tempExpDate); 
			break;
		case 5:
			System.out.println("enter the composition");
			medicine.composition = scannerstr.nextLine().split(" ");
			break;
		default:
			System.out.println("enter the type of medicine");
			String tempType = scanner.nextLine();
		}
	}
}
