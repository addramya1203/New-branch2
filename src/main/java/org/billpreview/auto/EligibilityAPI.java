package org.billpreview.auto;

import java.io.IOException;

import org.billpreview.Utils;
import org.json.simple.JSONObject;

import io.restassured.response.Response;

public class EligibilityAPI extends Utils {
	EligibilityAPI_JSON js;
	private static JSONObject requestbody;

	public static Response eligibility_API() throws IOException {
		// String requestBody = generateStringforjson("CreateCustomer.json");

		requestbody = EligibilityAPI_JSON.eligibilityJson();
		Response res = requestspecification().body(requestbody).when()
				.post("/restservices/chargepreview/v1/eligibilityCheck/test").then().log().all().extract().response();
		return res;

	}
}
