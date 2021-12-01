package com.bl.chemistshop;

import java.util.Date;

public class Crocin extends Medicine {
	Crocin() {
		type = Medicine.Type.ALLOPATHY;
		companyName = "GSK";
		composition = new String[3];
		composition[0] = "Paracetamol";
		composition[1] = "caffeine";
		composition[2] = "Sodium Methyl Paraben";
	}
}
