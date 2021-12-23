package com.bl.chemistshop;

import java.util.Arrays;
import java.util.Date;

public class Medicine {
	
	enum Type{HOMEOPATHY, ALLOPATHY, AYURVEDIC, YUNANI};
	
	String companyName;
	Type type;
	Date mfgDate;
	Date expDate;
	String[] composition;
	String name;
	
	@Override
	public String toString() {
		return "Medicine [companyName=" + companyName + ", type=" + type + ", mfgDate=" + mfgDate + ", expDate="
				+ expDate + ", composition=" + Arrays.toString(composition) + ", name=" + name + "]";
	}
}
