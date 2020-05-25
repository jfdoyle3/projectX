package GetAPIData;

import java.util.Arrays;

public class PotHole {

	public String location;
	public String ward;
	public String date_reported;
	public String date_filled;
	public String total_filled;
	public String status;
	//public String geolocation[];
	// Field name: :@computed_region_cjq3_kq3a
	public String computed_region_cjq3_kq3a;
	// Field name: :@computed_region_asue_2ipu
	public String computed_region_asue_2ipu;
	// Field name: :@computed_region_ueqj_g33x
	public String computed_region_ueqj_g33x;
	
//	public PotHole(String Location, String Ward, String date_filled, String total_filled, String Status) {
//		
//		this.location=Location;
//		this.ward=Ward;
//		this.date_filled=date_filled;
//		this.total_filled=total_filled;
//		this.status=Status;
//	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getDate_reported() {
		return date_reported;
	}
	public void setDate_reported(String date_reported) {
		this.date_reported = date_reported;
	}
	public String getDate_filled() {
		return date_filled;
	}
	public void setDate_filled(String date_filled) {
		this.date_filled = date_filled;
	}
	public String gettotal_filled() {
		return total_filled;
	}
	public void setTotal_filled(String total_filled) {
		this.total_filled = total_filled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
//	public String[] getGeolocation() {
//		return geolocation;
//	}
//	public void setGeolocation(String[] geolocation) {
//		this.geolocation = geolocation;
//	}
	public String getComputed_region_cjq3_kq3a() {
		return computed_region_cjq3_kq3a;
	}
	public void setComputed_region_cjq3_kq3a(String computed_region_cjq3_kq3a) {
		this.computed_region_cjq3_kq3a = computed_region_cjq3_kq3a;
	}
	public String getComputed_region_asue_2ipu() {
		return computed_region_asue_2ipu;
	}
	public void setComputed_region_asue_2ipu(String computed_region_asue_2ipu) {
		this.computed_region_asue_2ipu = computed_region_asue_2ipu;
	}
	public String getComputed_region_ueqj_g33x() {
		return computed_region_ueqj_g33x;
	}
	public void setComputed_region_ueqj_g33x(String computed_region_ueqj_g33x) {
		this.computed_region_ueqj_g33x = computed_region_ueqj_g33x;
	}
	
//	@Override
//	public String toString() {
//		return "PotHole [location=" + location + ", ward=" + ward + ", date_reported=" + date_reported + ", date_filled="
//				+ date_filled + ", total_filled=" + total_filled + ", status=" + status + ", geolocation="
//				+ Arrays.toString(geolocation) + ", computed_region_cjq3_kq3a=" + computed_region_cjq3_kq3a
//				+ ", computed_region_asue_2ipu=" + computed_region_asue_2ipu + ", computed_region_ueqj_g33x="
//				+ computed_region_ueqj_g33x + "]";
//	}
	@Override
	public String toString() {
		return "PotHole [location=" + location + ", ward=" + ward + ", date_reported=" + date_reported + ", date_filled="
				+ date_filled + ", total_filled=" + total_filled + ", status=" + status 
				+ ", computed_region_asue_2ipu=" + computed_region_asue_2ipu + ", computed_region_ueqj_g33x="
				+ computed_region_ueqj_g33x + "]";
	}
	
}
