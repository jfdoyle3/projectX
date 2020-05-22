package GetAPIData;



import com.google.gson.Gson;


import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class PotHoleData {

	public static void getPotHoleData() {
		
		final HttpResponse<String> jsonResponse = Unirest.get("https://data.providenceri.gov/resource/tisk-wsvu.json").asString();
		
		
		System.out.println(jsonResponse.getBody());	
	}

}
