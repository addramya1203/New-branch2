package org.billpreview.auto;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class EligibilityTest extends EligibilityAPI {

	public String requestidvalidation() throws Exception {
		Response res = null;
		try {
			res = EligibilityAPI.eligibility_API();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String response = res.asString();
		JsonPath jsonRes = new JsonPath(response);
		System.out.println("eligibility response" + jsonRes);
		requestId = jsonRes.getString("requestId");
		return requestId;

	}

}
