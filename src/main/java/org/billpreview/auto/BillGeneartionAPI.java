package org.billpreview.auto;

import java.io.IOException;

import org.billpreview.Utils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class BillGeneartionAPI extends Utils {
	Billgeneration_JSON billgenrationjsonobject;
	private JSONObject requestbody;

	@Test
	public void BillGeneartion_API() throws IOException {
		requestbody = billgenrationjsonobject.BillGenarationJson();
		Response res = requestspecification().body(requestbody).when()
				.post("/restservices/chargepreview/v1/billGeneration/test").then().log().all().extract().response();

		int result = res.getStatusCode();
		System.out.println("this is " + result);

	}
}
