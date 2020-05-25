package GetAPIData;


import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;

public class PotHoleData {

	public static void getPotHoleData() {
		
		String oneJson="{\"location\":\"Halsey St\",\"ward\":\"2\",\"date_reported\":\"2016-06-07T00:00:00.000\",\"status\":\"Closed\"}";
		ArrayList<PotHole> potholeList=new ArrayList<PotHole>();
		
	//	final HttpResponse<JsonNode> jsonNodeResponse = Unirest.get("https://data.providenceri.gov/resource/tisk-wsvu.json").asJson();
		final HttpResponse<String> jsonStringResponse = Unirest.get("https://data.providenceri.gov/resource/tisk-wsvu.json").asString();
		
		String stringJson=jsonStringResponse.getBody();
		String[] arrJson=stringJson.split("\\n");
		Gson gson = new Gson();
		//String json = gson.toJson(arrJson[0]);
		//System.out.println(arrJson[]);
		
		for(int idx=0; idx<arrJson.length; idx++) {
			PotHole data = new Gson().fromJson(arrJson[idx], PotHole.class);
			potholeList.add(data);
		}
		//PotHole address=gsonBuild.fromJson(json, PotHole.class);
		
		//System.out.println(data.toString());
		
		// System.out.println(json);
	}

}
