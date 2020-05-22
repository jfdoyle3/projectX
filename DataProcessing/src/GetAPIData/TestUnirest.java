package GetAPIData;



import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class TestUnirest {

	public TestUnirest() {
		final HttpResponse<String> jsonResponse = Unirest.get("http://httpbin.org/get").asString();
		System.out.println(jsonResponse.getBody());
		System.out.println("<------->");
	}
	public TestUnirest(String arg, Integer number) {
		final HttpResponse<String> jsonResponse = Unirest.get("http://httpbin.org/get").queryString(arg,number).asString();
		System.out.println(jsonResponse.getBody());
		System.out.println("<------->");
	}
	public TestUnirest(String arg, Integer number, String keyName) {
		final HttpResponse<JsonNode> jsonResponse = Unirest.get("http://httpbin.org/get").queryString(arg,number).asJson();
		System.out.println(jsonResponse.getBody().getObject().getString(keyName));
		System.out.println("<------->");
	}
}
