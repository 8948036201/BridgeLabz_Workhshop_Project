package com.bl.chemistshop;

public class NatrumMur extends Medicine {
	NatrumMur() {
		type = Medicine.Type.HOMEOPATHY;
		companyName = "HOMEO";
		composition = new String[3];
		composition[0] = "Sea Salt";
		composition[1] = "Sodium Chloride";
		composition[2] = "MUR Six X";
	}

}
