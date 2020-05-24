package GetAPIData;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;

public class PotHoleData {

	public static void getPotHoleData() {
		
		final HttpResponse<String> jsonResponse = Unirest.get("https://data.providenceri.gov/resource/tisk-wsvu.json").asString();
		String stringJson=jsonResponse.getBody();
		Gson gson = new Gson();
		String json = gson.toJson(stringJson);
		
		
		System.out.println(json);
		//System.out.println(jsonResponse.getBody());	
	}

}
