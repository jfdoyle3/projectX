package GetAPIData;


import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

public class PotHoleDataJsonArray {

	public static void getPotHoleData() {
		
		String oneJson="[{\"location\":\"Halsey St\",\"ward\":\"2\",\"date_reported\":\"2016-06-07T00:00:00.000\",\"status\":\"Closed\"}]";
		ArrayList<String> potholeList=new ArrayList<String>();
		
	//	final HttpResponse<JsonNode> jsonNodeResponse = Unirest.get("https://data.providenceri.gov/resource/tisk-wsvu.json").asJson();
		final HttpResponse<String> jsonStringResponse = Unirest.get("https://data.providenceri.gov/resource/tisk-wsvu.json").asString();
		
		String stringJson=jsonStringResponse.getBody();
//		String[] arrJson=stringJson.split("\\n,");
//		
//		for(int idx=0; idx<arrJson.length; idx++){
//			if(idx==0) {
//				potholeList.add(arrJson[idx]+"]");
//			} else if
//			(idx==arrJson.length) {
//				potholeList.add("["+arrJson[idx]);
//		} else {
//			potholeList.add("["+arrJson[idx]+"]");
//		}
//			
//		}
//		
		 JSONArray jsonArray = new JSONArray(stringJson);
		   IntStream.range(0, jsonArray.length())
		      .mapToObj(index -> ((JSONObject)jsonArray.get(index)).optString("location"))
		      .collect(Collectors.toList());
		
		    
		//System.out.println(potholeList.get(15));
		
//		JSONArray jsonarray = new JSONArray(oneJson);
//		JSONArray jsonarray = new JSONArray(jsonStringResponse);
//		
//
//	    for(int i=0; i<jsonarray.length(); i++){
//	        JSONObject obj = jsonarray.getJSONObject(i);
//
//	        String name = obj.getString("location");
//	        String url = obj.getString("ward");
//
//	        System.out.println(name);
//	        System.out.println(url);
//
//	        System.out.println(obj);
	        
	    }   
	}
