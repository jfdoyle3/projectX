package DataObjects;

import java.util.Arrays;

public class PotHole {

	public String location;
	public String ward;
	public String date_reported;
	public String date_filled;
	public String total_filled;
	public String status;
	public String longtitude;
	public String latitude;
	
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
	public String getTotal_filled() {
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
	public String getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "PotHole [location=" + location + ", ward=" + ward + ", date_reported=" + date_reported
				+ ", date_filled=" + date_filled + ", total_filled=" + total_filled + ", status=" + status
				+ ", longtitude=" + longtitude + ", latitude=" + latitude + "]";
	}

	}
	

