//UI Layer or View Layer
package com.bl.chemistshop;

import java.util.List;

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
}
