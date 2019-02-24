package org.billpreview.auto;

import org.json.simple.JSONObject;

public class EligibilityAPI_JSON {

	public static JSONObject eligibilityJson() {
		JSONObject requestParams = new JSONObject();
		requestParams.put("invoiceAccountNumber", "8310000984924");
		requestParams.put("attuid", "ra8586");
		requestParams.put("bbgwUsageInd", "Y");
		requestParams.put("requestedDate", "20190223000004");

		return requestParams;
	}

}