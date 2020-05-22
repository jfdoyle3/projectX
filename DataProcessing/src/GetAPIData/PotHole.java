package GetAPIData;

public class PotHole {
	
	 String location;
	 String ward;
	 String datefilled;
	 String totalfilled;
	 String status;
	//private String geolocation[];
	// Field name:  :@computed_region_cjq3_kq3a
	//private String computed_region_cjq3_kq3a;
	// Field name:  :@computed_region_asue_2ipu
	//private String computed_region_asue_2ipu;
	// Field name:  :@computed_region_ueqj_g33x
	//private String computed_region_ueqj_g33x;

	public PotHole(String Location, String Ward, String DateFilled, String TotalFilled, String Status) {
		
		this.location=Location;
		this.ward=Ward;
		this.datefilled=DateFilled;
		this.totalfilled=TotalFilled;
		this.status=Status;
	}
}
